package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.util.ConfigReader;

import java.util.List;
import java.util.Properties;

public class StatePage {
    private final WebDriver driver;
    private final Properties prop;

    //1. By Locators:
    private final By stateDropdown = By.xpath("//*[@id=\"form\"]/div[2]/div/div/div");
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
        return driver.findElement(stateDropdown).getText();
    }

    public String getStateContinueBtnName() throws InterruptedException {
        Thread.sleep(500);
        return driver.findElement(stateContinueBtn).getText();
    }

    public void selectState(String stateName){
        WebDriverWait wait=new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.titleIs("State"));
        List<WebElement> options = driver.findElements(stateDropdown);
        for (WebElement option1 : options) {
            if(stateName.equals(option1.getText().trim()))
                option1.click();
        }
    }

    public void clickOnTheContinueBtnOnStatePage(){
        driver.findElement(stateContinueBtn).click();
    }

    public void getProfessionPage(){
        driver.get(prop.getProperty("baseURL"));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div/button")).click();
        selectState("Florida");
        clickOnTheContinueBtnOnStatePage();
    }
}
