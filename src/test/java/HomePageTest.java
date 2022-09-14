import base.BaseClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BaseClass {

    HomePage homePage;

    @Test(enabled = true)
    public void homePageTest(){
        homePage = new HomePage();
        homePage.registerPage();
    }

    @Test(enabled = true)
    public void homePageTest2(){
        homePage = new HomePage();
        homePage.loginPage();
    }

    // By: Shams Uddin

}
