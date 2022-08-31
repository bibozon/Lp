package test.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.userinterface.LuegoPagoPage.*;


public class SelectElement implements Interaction {

    Target element;
    String option;

    public SelectElement(Target element, String option) {
        this.element = element;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> products = element.resolveAllFor(actor);
        for (WebElementFacade i :products) {

            if (i.getText().contains(option)){
                actor.attemptsTo(
                        ExplicitWait.here(2),
                        JavaScriptClick.on(i)
                );
                break;
            }

        }
    }

    public static SelectElement on(Target element, String option) {
        return Instrumented.instanceOf(SelectElement.class).withProperties(element, option);
    }
}
