package test.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.interactions.ExplicitWait;
import test.interactions.FinishTest;
import test.interactions.SelectElement;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.userinterface.LuegoPagoPage.*;
import static test.userinterface.LuegoPagoPage.BTN_COMPLETE_ORDER;

public class AddToTheCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Ensure.that(TXT_VALIDATION).text().contains("Producto simple QA"),
                JavaScriptClick.on(BTN_ADD_TO_CART),
                WaitUntil.the(TXT_VALIDATION_CART_FLOAT, isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(TXT_VALIDATION_CART_FLOAT).text().contains("Producto simple QA"),
                WaitUntil.the(BTN_COMPLETE_ORDER, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_COMPLETE_ORDER),
                WaitUntil.the(TXT_VALIDATION_CART, isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(TXT_VALIDATION_CART).text().contains("Producto simple QA"),
                JavaScriptClick.on(BTN_CONTINUE_PURCHASE)
        );

    }

    public static AddToTheCart here(){
        return Instrumented.instanceOf(AddToTheCart.class).withProperties();
    }
}
