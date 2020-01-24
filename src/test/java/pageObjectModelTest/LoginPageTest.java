package pageObjectModelTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageObjectModel.utils.Driver;

public class LoginPageTest extends Driver {

    @Test
    public void inputValidEmailPassword() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();
        loginPage.inputEmail("ashik@gmail.com");
        loginPage.inputPassword("lsfjalf");
        Thread.sleep(5000);

    }
}
