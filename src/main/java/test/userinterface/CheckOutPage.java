package test.userinterface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;

public class CheckOutPage {

    public static final Target TXT_EMAIL = Target.the("field for the email")
            .locatedBy("//div[@class='my-1 w-full']//input[@name='email']");
    public static final Target TXT_FIRST_NAME= Target.the("field for the firstname")
            .locatedBy("//input[@name='firstName']");
    public static final Target TXT_LAST_NAME= Target.the("field for the lastname")
            .locatedBy("//input[@name='lastName']");
    public static final Target TXT_DOC_ID= Target.the("field for the document id")
            .locatedBy("//input[@name='identification']");
    public static final Target TXT_DEPT= Target.the("field for the department")
            .locatedBy("//input[@name='state']");
    public static final Target TXT_CITY= Target.the("field for the city")
            .locatedBy("//input[@name='city']");
    public static final Target TXT_ADDRESS= Target.the("field for the address")
            .locatedBy("//input[@name='address1']");
    public static final Target TXT_PHONE_NUMBER= Target.the("field for the phone number")
            .locatedBy("//input[@name='phone']");

    public static final Target TXT_ERROR_ID= Target.the("field for the phone number")
            .locatedBy("//span[@class='helper-text helper-text-error']");

    public static final Target LST_DEPT = Target.the("list with the departments")
            .locatedBy("//ul[@class='scrollbar absolute z-10 mt-1 max-h-60 min-h-min w-full overflow-auto rounded border bg-white p-2 shadow-md']/li");
    public static final Target LST_CITY = Target.the("list with the cities")
            .locatedBy("//ul[@class='scrollbar absolute z-10 mt-1 max-h-60 min-h-min w-full overflow-auto rounded border bg-white p-2 shadow-md']/li");

    public static final Target CHK_ACCEPT_TERMS = Target.the("check button to accept terms")
            .locatedBy("//label[@class='mt-2 flex']/input[@name='policy']");

    public static final Target BTN_CONTINUE_PAYMENT = Target.the("button to continue")
            .locatedBy("//div//button[@class='button button-lg button-filled button-filled-primary button-shadow-default w-full']");
}
