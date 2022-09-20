package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ElectronicsPage extends BaseClass {
    public ElectronicsPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath= "//div[2]/ul[1]/li[2]/a") private WebElement electronics;
    @FindBy(linkText = "Camera & photo") private WebElement CamerasAndPhotos;
    @FindBy(xpath= "//div/div[1]/div/div[2]/h2/a") private  WebElement NikonCamera;
    public  void CheckPrice (){
        driver.switchTo().frame(0);
        electronics.click();
        CamerasAndPhotos.click();
        NikonCamera.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
       WebElement NikonPrice = driver.findElement(By.id("price-value-14"));
       boolean price=false;
       if (NikonPrice.getText().equals("$670.00"))
           price=true;
        Assert.assertTrue(price);
    }
}
