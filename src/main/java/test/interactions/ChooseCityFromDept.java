package test.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ChooseCityFromDept implements Interaction {

    Target element;

    public ChooseCityFromDept(Target element) {
        this.element = element;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listLocation = element.resolveAllFor(actor);
        int min = 0;
        int max = listLocation.size();
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);


        listLocation.get(random_int).click();

    }

    public static ChooseFromDropDownList option(Target element) {
        return Instrumented.instanceOf(ChooseFromDropDownList.class).withProperties(element);
    }
}
