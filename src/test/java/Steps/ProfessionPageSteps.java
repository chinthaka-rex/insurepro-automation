package Steps;

import Pages.ProfessionPage;
import Pages.StatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import qa.factory.DriverFactory;

public class ProfessionPageSteps {
    private static String title;
    private final ProfessionPage professionPage = new ProfessionPage(DriverFactory.getDriver());

    @Given("user is on insurepro profession page")
    public void userIsOnInsureproProfessionPage() {
        StatePage statePage = new StatePage(DriverFactory.getDriver());
        statePage.getProfessionPage();
    }

    @When("user gets the title of the insurepro profession page")
    public void userGetsTheTitleOfTheInsureproProfessionPage() {
        title = professionPage.getInsureProProfessionPageTitle();
        System.out.println("Page title is : " + title);
    }

    @When("insurepro profession page title should be {string}")
    public void insureproProfessionPageTitleShouldBe(String expTitle) {
        Assert.assertTrue(title.contains(expTitle));
    }

    @And("insurepro profession page should contain {string} dropdown")
    public void insureproProfessionPageShouldContainDropdown(String arg0) {
    }

    @And("insurepro profession page should contain {string} button")
    public void insureproProfessionPageShouldContainButton(String arg0) {
    }

    @Then("select {string} as the profession")
    public void selectAsTheProfession(String arg0) {
    }

    @And("click on the Continue button on the insurepro profession page")
    public void clickOnTheContinueButtonOnTheInsureproProfessionPage() {
    }

    @Then("user should navigate from profession page to the next page and title should be {string}")
    public void userShouldNavigateFromProfessionPageToTheNextPageAndTitleShouldBe(String arg0) {
    }
}
