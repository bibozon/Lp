package test.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import test.interactions.ExplicitWait;
import test.interactions.FinishTest;
import test.interactions.ScrollTo;
import test.interactions.SelectElement;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.userinterface.LuegoPagoPage.*;

public class SelectProductFromList implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ExplicitWait.here(1),
                SelectElement.on(BTN_PRODUCT_LIST, "Producto simple QA"),
                WaitUntil.the(TXT_VALIDATION, isVisible()).forNoMoreThan(10).seconds()
        );
    }

    public static SelectProductFromList on() {
        return Instrumented.instanceOf(SelectProductFromList.class).withProperties();
    }
}
