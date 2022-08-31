package test.interactions;

import com.github.javafaker.Faker;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.ensure.Ensure;

import net.serenitybdd.screenplay.waits.WaitUntil;
import test.model.ClientData;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static test.userinterface.CheckOutPage.*;

public class ListAllElementsOnForm implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {


        ClientData clientData = new ClientData();
        Faker fakeData = new Faker();

        String email = fakeData.internet().emailAddress();
        String firstName = fakeData.name().firstName();
        String lastName = fakeData.name().lastName();
        String docId = fakeData.number().digits(10);
        String address = fakeData.address().fullAddress();
        String phoneNumber = fakeData.number().digits(10);

        actor.attemptsTo(
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(firstName).into(TXT_FIRST_NAME),
                Enter.theValue(lastName).into(TXT_LAST_NAME),
                Enter.keyValues(docId).into(TXT_DOC_ID),
                Ensure.that(TXT_ERROR_ID).isNotDisplayed(),
                JavaScriptClick.on(TXT_DEPT),
                ChooseFromDropDownList.option(LST_DEPT),
                JavaScriptClick.on(TXT_CITY),
                WaitUntil.the(LST_CITY, isVisible()),
                ChooseFromDropDownList.option(LST_CITY),
                Enter.theValue(address).into(TXT_ADDRESS),
                Enter.theValue(phoneNumber).into(TXT_PHONE_NUMBER),
                JavaScriptClick.on(CHK_ACCEPT_TERMS),
                JavaScriptClick.on(BTN_CONTINUE_PAYMENT),
                ExplicitWait.here(2)
        );
    }


    public static ListAllElementsOnForm on() {
        return Instrumented.instanceOf(ListAllElementsOnForm.class).withProperties();
    }
}

