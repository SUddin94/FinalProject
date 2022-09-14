import base.BaseClass;
import org.testng.annotations.Test;
import pages.RegisterPage;

public class RegisterPageTest extends BaseClass {

    RegisterPage registerPage;

    @Test
    public void registerPageTest(){
        registerPage = new RegisterPage();
        registerPage.selectGender();
    }
}

