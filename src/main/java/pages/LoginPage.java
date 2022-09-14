package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email") private WebElement email;
    @FindBy(id = "Password") private WebElement password;
    @FindBy(linkText = "Log in") private WebElement loginButton;
    @FindBy(id = "RememberMe") private WebElement rememberMeButton;

    public LoginPage login(){
        email.sendKeys(getPropertyValue("email"));
        password.sendKeys(getPropertyValue("password"));
        rememberMeButton.click();
        loginButton.click();
        return this;
    }
}
