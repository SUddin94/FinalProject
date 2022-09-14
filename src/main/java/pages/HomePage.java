package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "a[href='/register?returnUrl=%2F']") private WebElement registerButton;
    @FindBy(css = "a[href='/login?returnUrl=%2F']") private WebElement loginButton;

    public RegisterPage registerPage(){
        registerButton.click();
        return PageFactory.initElements(driver,RegisterPage.class);
    }

    public LoginPage loginPage(){
        loginButton.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }


}
