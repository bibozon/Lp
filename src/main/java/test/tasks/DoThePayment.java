package test.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import test.interactions.ExplicitWait;
import test.interactions.InteractWithShadowElement;

public class DoThePayment implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                InteractWithShadowElement.on(),
                ExplicitWait.here(10)
//                SelectOptions.on(TXT_DOCUMENT),
//                Enter.theValue(faker),
//                SelectOptions.on(TXT_DOCUMENT),
        );

    }

    public static DoThePayment onTheSite(){
        return Instrumented.instanceOf(DoThePayment.class).withProperties();
    }
}
