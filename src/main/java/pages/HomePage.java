package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Register") private WebElement registerButton;
    @FindBy(linkText = "Log in") private WebElement loginButton;



    public RegisterPage registerPage(){
        iFrame();
        registerButton.click();
        return PageFactory.initElements(driver,RegisterPage.class);
    }

    public LoginPage loginPage(){
        iFrame();
        loginButton.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }

    public FollowUsPage followUsLink() {
        iFrame();
        scrollJS(1000);
        return PageFactory.initElements(driver, FollowUsPage.class);
    }

    // By: Shams Uddin

}
