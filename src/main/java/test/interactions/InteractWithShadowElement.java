package test.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import static test.drivers.DriverRemoteBrowser.driver;

public class InteractWithShadowElement implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = (WebElement) jse.executeScript("return document.querySelector(\"#widget-container > widget-payment-methods\").shadowRoot.querySelector(\"#Payments-menu-radio-PSE\")");
        jse.executeScript("arguments[0].click();", element);


    }

    public static InteractWithShadowElement on() {
        return Instrumented.instanceOf(InteractWithShadowElement.class).withProperties();
    }
}
