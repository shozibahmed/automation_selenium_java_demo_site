package pageObjectModel.utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;
import pageObjectModel.pages.HomePage;
import pageObjectModel.pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class Driver {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected LoginPage loginPage;




    @BeforeMethod
    //passing browser name in TestNG xml file
    @Parameters("browser")
    public void setup(String browser) throws Exception {
        if (browser.equalsIgnoreCase("chrome")) {
            ChromeDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("ff")) {
            FirefoxDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }

         basePage =new BasePage(driver);
       homePage=new HomePage(driver);
       loginPage=new LoginPage(driver);





        //path of html file
        String path=System.getProperty("user.dir");
        String newPath=path.substring(0,path.lastIndexOf("\\"));
        //String htmlPath ="file:\\\\"+ newPath+"\\demo_website\\
        String htmlPath ="file:\\\\"+ path+"\\demo_website\\demo.html";
        driver.navigate().to(htmlPath);

        //driver.navigate().to("file:///C:/Users/Yusuf/Documents/automation_selenium_java_demo_site/demo_website/demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();






    }


    @AfterMethod
    public void tearDwon(){
        driver.close();
        driver.quit();
    }






}
