package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {

    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "gender-male") private WebElement genderButton;
    @FindBy(id = "FirstName") private WebElement firstName;
    @FindBy(id = "LastName") private WebElement lastName;
    @FindBy(id = "Email") private WebElement email;
    @FindBy(id = "Password") private WebElement password;
    @FindBy(id = "ConfirmPassword") private WebElement confirmPassword;
    @FindBy(id = "register-button") private WebElement registerButton;

    public void selectGender(){
        genderButton.click();
    }
    public void setFirstName(){
        firstName.sendKeys("Shams");
    }
    public void setLastName(){
        lastName.sendKeys("Uddin");
    }
    public void setEmail(){
        email.sendKeys("finalprojectpnt@gmail.com");
    }
    public void setPassword(){
        password.sendKeys("FinalProject123");
    }
    public void setConfirmPassword(){
        confirmPassword.sendKeys("FinalProject123");
    }
    public void clickRegister(){
        registerButton.click();
    }

}