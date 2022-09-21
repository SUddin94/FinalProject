package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class FollowUsPage extends BaseClass {

    public FollowUsPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@target='_blank']") private List<WebElement> Links;
    @FindBy(xpath = "//a[@target='_blank']") private List<WebElement> twitterLink;
    @FindBy(xpath = "//a[@target='_blank']") private List<WebElement> youtubeLink;

    public FollowUsPage links(){
        Links.get(0).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandleList = new ArrayList(windowHandles);
        driver.switchTo().window(windowHandleList.get(1));
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();
        driver.switchTo().window(windowHandleList.get(0));
        driver.switchTo().frame(0);
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Links.get(1).click();
        driver.switchTo().window(windowHandleList.get(0));
        driver.switchTo().frame(0);
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Links.get(2).click();
        driver.switchTo().window(windowHandleList.get(0));
        return this;
    }




}
