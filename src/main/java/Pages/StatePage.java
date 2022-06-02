package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.util.ConfigReader;

import java.util.Properties;

public class StatePage {
    private final WebDriver driver;
    private final Properties prop;

    //1. By Locators:
    private final By stateDropdown = By.xpath("//*[@id=\"form\"]/div[2]/div/div/div/div[1]/div[2]");
    private final By stateContinueBtn = By.xpath("//*[@id=\"footer\"]/div/button");

    //2. Constructor of the page class:
    public StatePage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String setInsureProStatePageURL() {
        return prop.getProperty("baseURL");
    }

    public String getInsureProStatePageTitle() {
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.titleIs("State"));
        return driver.getTitle();
    }

    public void selectState(String stateName){
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.titleIs("State"));
        Select stateDD = new Select(driver.findElement(stateDropdown));
        stateDD.selectByVisibleText(stateName);
    }

    public void clickOnTheContinueBtnOnStatePage(){
        driver.findElement(stateContinueBtn).click();
    }
}
