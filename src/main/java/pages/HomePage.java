package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy() private WebElement register;


}
