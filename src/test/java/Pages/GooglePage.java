package Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class GooglePage extends PageBase{


    @FindBy(xpath = "//*[@id=\"APjFqb\"]")
    WebElement username;


    public GooglePage(WebDriver Driver) {
        super(Driver);

    }

    public void Execution() throws InterruptedException {
        username.sendKeys("CICD");
        username.sendKeys(Keys.RETURN);

    }

}


