package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qa.util.ConfigReader;

import java.util.Properties;

public class WhyAreYouLookingForInsurancePage {
    private final WebDriver driver;
    private final Properties prop;

    //1. By Locators:
    private final By forBusinessBtn = By.xpath("//*[@id=\"form\"]/div[2]/div/label[1]/span/span");
    private final By forJobOrProjectBtn = By.xpath("//*[@id=\"form\"]/div[2]/div/label[2]/span/span");
    private final By continueBtn = By.xpath("//*[@id=\"footer\"]/div/button");


    //2. Constructor of the page class:
    public WhyAreYouLookingForInsurancePage(WebDriver driver) {
        ConfigReader configReader = new ConfigReader();
        prop = configReader.init_prop();
        this.driver = driver;
    }
}
