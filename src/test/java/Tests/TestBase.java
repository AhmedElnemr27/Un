package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public WebDriver Driver;

    @BeforeSuite
    public void InitializeDriver(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        Driver = new ChromeDriver(co);
        Driver.navigate().to("https://www.google.com/?client=safari");
    }
}
