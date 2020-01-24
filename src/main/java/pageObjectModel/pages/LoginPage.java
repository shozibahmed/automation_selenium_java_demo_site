package pageObjectModel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    protected WebDriver driver;

    @FindBy(id="email")
     WebElement login_email;
    @FindBy(id="password")
     WebElement login_password;


    public void inputEmail(String email){
        login_email.sendKeys(email);
    }

    public void inputPassword(String password){
        login_password.sendKeys(password);
    }



    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
}
