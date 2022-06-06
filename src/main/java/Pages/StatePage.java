package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.factory.DriverFactory;
import qa.util.ConfigReader;

import java.util.List;
import java.util.Properties;

public class StatePage {
    private final WebDriver driver;
    private final Properties prop;

    //1. By Locators:
    private final By stateDD = By.xpath("//*[@id=\"form\"]/div[2]/div/div/div/div[1]");
    private final By stateDropdown = By.xpath("//*[@id=\"react-select-2-input\"]");
    private final By ddFirstElement = By.xpath("//*[@id=\"react-select-2-listbox\"]");
    private final By stateContinueBtn = By.xpath("//*[@id=\"footer\"]/div/button");


    //2. Constructor of the page class:
    public StatePage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String getInsureProStatePageTitle() {
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.titleIs("State"));
        return driver.getTitle();
    }

    public String getStateDropDownName(){
        return driver.findElement(stateDD).getText();
    }

    public String getStateContinueBtnName(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return driver.findElement(stateContinueBtn).getText();
    }

    public void selectState(String stateName){
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(stateDropdown));

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElement(stateDropdown).sendKeys(stateName);
        driver.findElement(ddFirstElement).click();
    }

    public void clickOnTheContinueBtnOnStatePage(){
        driver.findElement(stateContinueBtn).click();
    }

    public String getProfPageName(){
        return driver.getTitle();
    }

    public void getProfessionPage(){
        InsureProLandingPage insureProLandingPage = new InsureProLandingPage(DriverFactory.getDriver());
        insureProLandingPage.getStatePage();
        insureProLandingPage.clickOnTheQuoteButton();
        selectState("Florida");
        clickOnTheContinueBtnOnStatePage();
    }
}
