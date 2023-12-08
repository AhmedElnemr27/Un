package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver Driver;

    public PageBase(WebDriver Driver){
        PageFactory.initElements(Driver,this);
    }
}
