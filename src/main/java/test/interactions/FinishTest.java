package test.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static test.drivers.DriverRemoteBrowser.*;

public class FinishTest implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        driver.quit();

    }

    public static FinishTest now(){
        return Instrumented.instanceOf(FinishTest.class).withProperties();
    }
}
