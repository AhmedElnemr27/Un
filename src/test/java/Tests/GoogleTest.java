package Tests;

import Pages.GooglePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class GoogleTest extends TestBase{

    GooglePage page;

    @Test
    public void GoogleTestt() throws InterruptedException {
        page = new GooglePage(Driver);
        page.Execution();
        Thread.sleep(2000);
        WebElement asser = Driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        Assert.assertTrue(asser.getText().contains("CICD"));
    }

    @AfterMethod
    public void ScreenShot(ITestResult result) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) Driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("src/test/java/ScreenShots/screenshot.png");
        FileUtils.copyFile(source, destination);
    }

}

