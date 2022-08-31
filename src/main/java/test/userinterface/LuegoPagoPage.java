package test.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class LuegoPagoPage {

    public static final Target TXT_SEARCH_BAR = Target.the("search bar")
            .locatedBy("//button[@id='headlessui-combobox-button-3']/input");

    public static final Target BTN_PRODUCT_LIST = Target.the("element list")
            .locatedBy("//a[contains(@href,'/productos/')]//span[@class='text-sm leading-tight line-clamp-2 md:text-sm md:group-hover:text-secondary']");

    public static final Target BTN_ADD_TO_CART = Target.the("button add to the cart")
            .locatedBy("//button[contains(text(),'Añadir al carrito')]");
    public static final  Target TXT_VALIDATION = Target.the("text to validate")
            .locatedBy("//div/p[@class='text-xl font-semibold normal-case']");

    public static final Target TXT_VALIDATION_CART_FLOAT = Target.the("text to validate cart float")
            .locatedBy("//div/span[@class='font-semibold']");
    public static final Target BTN_COMPLETE_ORDER = Target.the("button to complete the order")
            .locatedBy("//div[@class='flex flex-col justify-between space-y-2 px-4']/button");

    public static final Target TXT_VALIDATION_CART = Target.the("text validate cart")
            .locatedBy("//div[@class='flex']/span");

    public static final Target BTN_CONTINUE_PURCHASE = Target.the("Button Continuar Ccompra")
            .locatedBy("//div[@class=' flex justify-end']/div/button");

    public static final Target BTN_COOKIES = Target.the("button with the cookies option").locatedBy("//div[@class='float-right md:float-none']/button");

}
