package testing.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import test.drivers.DriverRemoteBrowser;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import test.tasks.*;

public class BuySimpleProductStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user wants to buy a simple product at (.*)$")
    public void thatTheUserWantsToBuyASimpleProductAtSite(String url) {

        DriverRemoteBrowser.chromeHisBrowserWeb();
        OnStage.theActor("user").can(BrowseTheWeb.with(DriverRemoteBrowser.on(url)));
    }


    @When("^he searchs and selects a simple product on the site$")
    public void heSearchAndSelectsASimpleProductOnTheSite() {

        OnStage.theActorInTheSpotlight().attemptsTo(SearchByBar.onTheSite());
        OnStage.theActorInTheSpotlight().attemptsTo(SelectProductFromList.on());
        OnStage.theActorInTheSpotlight().attemptsTo(AddToTheCart.here());


    }

    @Then("^he sees the product on the cart$")
    public void heSeesTheProductOnTheCart() {

        OnStage.theActorInTheSpotlight().attemptsTo(PurchaseTheItem.onThesite());
        OnStage.theActorInTheSpotlight().attemptsTo(DoThePayment.onTheSite());

    }
}
