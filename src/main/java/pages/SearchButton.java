package pages;

import base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchButton extends BaseClass {
    public SearchButton() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="small-search-box-form")
    private WebElement searchButton;
    public void searchTerm1() {
        searchButton.sendKeys("computer");
        searchButton.click();
    }
}
