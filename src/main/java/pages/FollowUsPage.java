package pages;

import base.BaseClass;
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

    @FindBy(linkText = "Facebook") private WebElement facebookLink;
    @FindBy(linkText = "Twitter") private WebElement twitterLink;
    @FindBy(linkText = "YouTube") private WebElement youtubeLink;

    public FollowUsPage links(){
        facebookLink.click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> windowHandleList = new ArrayList(windowHandles);
        driver.switchTo().window(windowHandleList.get(1));
        driver.close();
        driver.switchTo().window(windowHandleList.get(0));
        twitterLink.click();
        driver.switchTo().window(windowHandleList.get(1));
        driver.close();
        driver.switchTo().window(windowHandleList.get(0));
        youtubeLink.click();
        driver.switchTo().window(windowHandleList.get(0));
        driver.close();
        driver.switchTo().window(windowHandleList.get(0));
        return this;
    }

    // By: Shams Uddin

}
