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
    private final StatePage statePage = new StatePage(DriverFactory.getDriver());

    @Given("user is on insurepro state page")
    public void userIsOnInsureproStatePage() {
        InsureProLandingPage insureProLandingPage = new InsureProLandingPage(DriverFactory.getDriver());
        insureProLandingPage.getStatePage();
    }

    @When("user gets the title of the insurepro state page")
    public void userGetsTheTitleOfTheInsureproStatePage() {
        title = statePage.getInsureProStatePageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro state page title should be {string}")
    public void insureproStatePageTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro state page should contain {string} dropdown")
    public void insureproStatePageShouldContainDropdown(String expDropdownName) {
        Assert.assertTrue(statePage.getStateDropDownName().contains(expDropdownName));
    }

    @And("insurepro state page should contain {string} button")
    public void insureproStatePageShouldContainButton(String expConBtnName){
        Assert.assertTrue(statePage.getStateContinueBtnName().contains(expConBtnName));
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
        Assert.assertTrue(statePage.getProfPageName().contains(expNxtPageTitle));
    }
}
