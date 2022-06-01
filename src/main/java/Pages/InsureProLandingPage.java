package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.util.ConfigReader;

import java.util.Properties;

public class InsureProLandingPage {
    private WebDriver driver;
    private Properties prop;

    //1. By Locators:
    private By languageLink = By.xpath("//*[@id=\"footer\"]/div/button");
    private By quoteButton = By.xpath("//*[@id=\"footer\"]/button");

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

    public String getNamePageTitle() {
        return driver.getTitle();
    }

    public  void getStatePage(){
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(quoteButton).click();
    }
}
