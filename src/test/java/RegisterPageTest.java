import base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterPageTest extends BaseClass {

    @Test
    public void registerPageTest(){
        PageFactory.initElements(driver, HomePage.class).registerPage().personalInfo();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // By: Shams Uddin
}

