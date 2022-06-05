package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import qa.util.ConfigReader;

import java.util.Properties;

public class ProfessionPage {
    private final WebDriver driver;
    private final Properties prop;

    //1. By Locators:
    private final By professionDropdown = By.xpath("//*[@id=\"form\"]/div[3]/div[1]/div/div/div[1]/div[2]");
    private final By profContinueBtn = By.xpath("//*[@id=\"footer\"]/div/button");

    //2. Constructor of the page class:
    public ProfessionPage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }

    //3. Page Actions: features(behavior) of the page the form of methods:
    public String getInsureProProfessionPageTitle() {
//        WebDriverWait wait=new WebDriverWait(driver, 50);
//        wait.until(ExpectedConditions.titleIs("Profession"));
        return driver.getTitle();
    }
}
