import base.BaseClass;
import org.testng.annotations.Test;
import pages.ElectronicsPage;

public class ElectronicPageTest extends BaseClass {
    ElectronicsPage electronicsPage;
    @Test
    public void asertPrice(){
        electronicsPage= new ElectronicsPage();
        electronicsPage.CheckPrice();

    }
}
