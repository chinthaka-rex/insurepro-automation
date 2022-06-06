package Steps;

import Pages.ProfessionPage;
import Pages.WhyAreYouLookingForInsurancePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qa.factory.DriverFactory;

public class WhyAreYouLookingForInsurancePageSteps {
    private static String title;
    private final WhyAreYouLookingForInsurancePage whyAreYouLookingForInsurancePage = new WhyAreYouLookingForInsurancePage(DriverFactory.getDriver());
    @Given("user is on insurepro why are you looking for insurance page")
    public void userIsOnInsureproWhyAreYouLookingForInsurancePage() {
        ProfessionPage professionPage = new ProfessionPage(DriverFactory.getDriver());
        professionPage.getWhyAreYouLookingForInsurancePage();
    }

    @When("user gets the title of the insurepro why are you looking for insurance page")
    public void userGetsTheTitleOfTheInsureproWhyAreYouLookingForInsurancePage() {
    }

    @When("insurepro why are you looking for insurance page should contain {string} button")
    public void insureproWhyAreYouLookingForInsurancePageShouldContainButton(String arg0) {
    }

    @Then("select {string} as the why are you looking for insurance")
    public void selectAsTheWhyAreYouLookingForInsurance(String arg0) {
    }

    @And("click on the Continue button on the insurepro why are you looking for insurance page")
    public void clickOnTheContinueButtonOnTheInsureproWhyAreYouLookingForInsurancePage() {
    }

    @Then("user should navigate from why are you looking for insurance page to the next page and title should be {string}")
    public void userShouldNavigateFromWhyAreYouLookingForInsurancePageToTheNextPageAndTitleShouldBe(String arg0) {
    }
}
