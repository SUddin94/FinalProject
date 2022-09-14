package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ElectronicsPage {
    WebDriver driver= BaseClass.driver;
    @FindBy(linkText = "Electronics ") private WebElement electronics;
    @FindBy(linkText = "Camera & photo ") private  WebElement CamerasAndPhotos;
    @FindBy(linkText = "Nikon D5500 DSLR") private  WebElement NikonCamera;
    public  ElectronicsPage CheckPrice (){
        driver.switchTo().frame(0);
        electronics.click();
        CamerasAndPhotos.click();
        NikonCamera.click();
        driver.switchTo().frame(0);
       WebElement NikonPrice = driver.findElement(By.id("price-value-14"));
       boolean price=false;
       if (NikonPrice.getText().equals("$670.00"))
           price=true;
        Assert.assertTrue(price);
        return this;
    }
}
