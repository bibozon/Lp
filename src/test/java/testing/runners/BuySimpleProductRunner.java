package testing.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/BuySimpleProduct.feature",
        glue = "testing.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)


public class BuySimpleProductRunner {
}
