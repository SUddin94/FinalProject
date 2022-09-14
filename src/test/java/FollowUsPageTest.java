import base.BaseClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class FollowUsPageTest extends BaseClass {

    @Test
    public void followUsPageTest(){
        PageFactory.initElements(driver, HomePage.class).followUsLink().links();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // By: Shams Uddin
}
