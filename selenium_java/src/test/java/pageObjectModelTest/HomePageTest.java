package pageObjectModelTest;

import org.testng.annotations.Test;
import pageObjectModel.utils.Driver;

public class HomePageTest extends Driver {

    @Test
    public void test(){

        homePage.clickDrop();
    }
}
