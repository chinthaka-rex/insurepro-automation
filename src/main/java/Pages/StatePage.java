package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import qa.util.ConfigReader;

import java.util.Properties;

public class StatePage {
    private WebDriver driver;
    private Properties prop;

    //1. By Locators:
    private By stateDropdown = By.cssSelector("//*[@id=\"form\"]/div[2]/div/div/div/div[1]/div[2]");
    private By stateContinueBtn = By.xpath("//*[@id=\"footer\"]/div/button");

    //2. Constructor of the page class:
    public StatePage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String setInsureProLandingPageURL() {
        return prop.getProperty("baseURL");
    }

    public String getInsureProStatePageTitle() {
        return driver.getTitle();
    }

    public void selectState(String stateName){
        Select stateDD = new Select(driver.findElement(stateDropdown));
        stateDD.selectByVisibleText(stateName);
    }

    public void clickOnTheContinueBtnOnStatePage(){
        driver.findElement(stateContinueBtn).click();
    }
}
