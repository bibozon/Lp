package test.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.userinterface.LuegoPagoPage.*;

public class SearchByBar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_COOKIES, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_COOKIES),
                Enter.theValue("producto").into(TXT_SEARCH_BAR),
                Hit.the(Keys.ENTER).keyIn(TXT_SEARCH_BAR)
        );

    }

    public static SearchByBar onTheSite(){
        return Instrumented.instanceOf(SearchByBar.class).withProperties();
    }
}
