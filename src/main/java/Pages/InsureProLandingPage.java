package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.util.ConfigReader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class InsureProLandingPage {
    private final WebDriver driver;
    private final Properties prop;

    //1. By Locators:
    private final By languageLink = By.xpath("//*[@id=\"footer\"]/div/div/button");
    private final By quoteButton = By.xpath("//*[@id=\"footer\"]/div/button");

    //2. Constructor of the page class:
    public InsureProLandingPage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String setInsureProLandingPageURL() {
        return prop.getProperty("baseURL");
    }

    public String getInsureProLandingPageTitle() {
        return driver.getTitle();
    }

    public String getTheLanguageLinkText() {
        return driver.findElement(languageLink).getText();
    }

    public String getTheQuoteButtonText() {
        return driver.findElement(quoteButton).getText();
    }

    public void clickOnTheQuoteButton() {
        driver.findElement(quoteButton).click();
    }

    public String getStatePageTitle(String expNxtPgTitle) {
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.titleIs(expNxtPgTitle));
        return driver.getTitle();
    }

    public  void getStatePage(){
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(quoteButton).click();
    }
}
