package test.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import test.interactions.ListAllElementsOnForm;

import static test.userinterface.CheckOutPage.TXT_ERROR_ID;

public class DocumentIdValidation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TXT_ERROR_ID.resolveFor(actor).isDisplayed();
    }

    public static Question<Boolean> value() {
        return new DocumentIdValidation();
    }

}
