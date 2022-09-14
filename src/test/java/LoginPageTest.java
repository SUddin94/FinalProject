import base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class LoginPageTest extends BaseClass {

    @Test
    public void loginPageTest(){
        PageFactory.initElements(driver, HomePage.class).loginPage().login();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // By: Shams Uddin
}
