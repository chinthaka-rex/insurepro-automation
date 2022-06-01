package Steps;

import Pages.InsureProLandingPage;
import Pages.StatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class StatePageSteps {
    private static String title;
    private StatePage statePage = new StatePage(DriverFactory.getDriver());

    @Given("user is on insurepro state page")
    public void userIsOnInsureproStatePage() {
        InsureProLandingPage insureProLandingPage = new InsureProLandingPage(DriverFactory.getDriver());
        insureProLandingPage.getStatePage();
    }

    @When("user gets the title of the insurepro state page")
    public void userGetsTheTitleOfTheInsureproStatePage() {
        DriverFactory.getDriver().get(statePage.setInsureProLandingPageURL());
    }

    @When("insurepro state page title should be {string}")
    public void insureproStatePageTitleShouldBe(String expTitle) {
        title = statePage.getInsureProStatePageTitle();
        System.out.println("Page title is : " + title);
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro state page should contain {string} dropdown")
    public void insureproStatePageShouldContainDropdown(String expDropdownName) {
    }

    @And("insurepro state page should contain {string} button")
    public void insureproStatePageShouldContainButton(String expConBtnName) {
    }

    @Then("select {string} as the state")
    public void selectAsTheState(String expStateName) {
        statePage.selectState(expStateName);
    }

    @And("click on the Continue button on the insurepro state page")
    public void clickOnTheContinueButtonOnTheInsureproStatePage() {
        statePage.clickOnTheContinueBtnOnStatePage();
    }

    @Then("user should navigate from state page to the next page and title should be {string}")
    public void userShouldNavigateFromStatePageToTheNextPageAndTitleShouldBe(String expNxtPageTitle) {
    }
}
