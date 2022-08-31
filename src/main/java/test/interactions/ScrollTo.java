package test.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;

import static test.drivers.DriverRemoteBrowser.driver;
import static test.userinterface.LuegoPagoPage.BTN_PRODUCT_LIST;

public class ScrollTo implements Interaction {

     Target element;

    public ScrollTo(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static ScrollTo on(Target element){
        return Instrumented.instanceOf(ScrollTo.class).withProperties(element);
    }
}
