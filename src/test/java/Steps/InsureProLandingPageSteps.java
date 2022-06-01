package Steps;

import Pages.InsureProLandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class InsureProLandingPageSteps {
    private static String title;
    private InsureProLandingPage insureProLandingPage = new InsureProLandingPage(DriverFactory.getDriver());

    @Given("user is on insurepro landing page")
    public void userIsOnInsureproLandingPage() {
        DriverFactory.getDriver().get(insureProLandingPage.setInsureProLandingPageURL());
    }

    @When("user gets the title of the insurepro landing page")
    public void userGetsTheTitleOfTheInsureproLandingPage() {
        title = insureProLandingPage.getInsureProLandingPageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro landing page title should be {string}")
    public void insureproLandingPageTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro landing page should contain {string} link")
    public void insureproLandingPageShouldContainLink(String expLanguageLinkText) {
        Assert.assertTrue(insureProLandingPage.getTheLanguageLinkText().contains(expLanguageLinkText));
    }

    @And("insurepro landing page should contain {string} button")
    public void insureproLandingPageShouldContainButton(String expQuotBtnName) {
        Assert.assertTrue(insureProLandingPage.getTheQuoteButtonText().contains(expQuotBtnName));
    }

    @And("click on the Get A Quote button")
    public void clickOnTheGetAQuoteButton() {
        insureProLandingPage.clickOnTheQuoteButton();
    }

    @Then("user should navigate to the next page and title should be {string}")
    public void userShouldNavigateToTheNextPageAndTitleShouldBe(String expNxtPgTitle) {
        Assert.assertTrue(insureProLandingPage.getStatePageTitle().contains(expNxtPgTitle));
    }
}
