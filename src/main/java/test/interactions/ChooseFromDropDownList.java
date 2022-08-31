package test.interactions;

import com.github.javafaker.Faker;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ChooseFromDropDownList implements Interaction {

    Target element;
    public ChooseFromDropDownList(Target element) {
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
