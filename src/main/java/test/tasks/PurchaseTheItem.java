package test.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import test.interactions.ListAllElementsOnForm;

public class PurchaseTheItem implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                ListAllElementsOnForm.on()
        );
    }

    public static PurchaseTheItem onThesite(){
        return Instrumented.instanceOf(PurchaseTheItem.class).withProperties();
    }
}
