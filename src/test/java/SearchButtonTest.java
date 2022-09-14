import base.BaseClass;
import org.testng.annotations.Test;
import pages.SearchButton;

public class SearchButtonTest extends BaseClass {
    SearchButton searchButton;
    @Test
    public void SearchButtonTest(){
        searchButton = new SearchButton();
        searchButton.searchTerm1();
    }
}
