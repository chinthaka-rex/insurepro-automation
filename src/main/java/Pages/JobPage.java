package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.factory.DriverFactory;

public class JobPage {
    private WebDriver driver;

    //1. By Locators:
    private By houseCleaningBtn = By.xpath("//*[@id=\"form\"]/div[3]/div[2]/label[1]/span/span[2]");
    private By conBtn = By.cssSelector("#footer > button");

    //2. Constructor of the page class:
    public JobPage(WebDriver driver) {
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public void setInsureProJobPage() {
        ZipCodePage zipCodePage = new ZipCodePage(DriverFactory.getDriver());
        zipCodePage.getJobPageForTexas();
    }

    public String getInsureProJobPageTitle() {
        return driver.getTitle();
    }

    public String getJobPageContinueButtonText() {
        return driver.findElement(conBtn).getText();
    }

    public void clickOnTheJobType() {
        driver.findElement(houseCleaningBtn).click();
    }

    public void clickOnTheContinueButton() {
        driver.findElement(conBtn).click();
    }

    public String getMonthlyJobRatePageTitle() {
        return driver.getTitle();
    }
}
