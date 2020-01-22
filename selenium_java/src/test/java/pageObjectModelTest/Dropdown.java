package pageObjectModelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pageObjectModel.utils.Driver;

public class Dropdown extends Driver {

    @Test
    public void selectByVisibleText(){

        Select sel=new Select(driver.findElement(By.id("dropdown")));

        sel.selectByVisibleText("Male");
        WebElement male= driver.findElement(By.xpath("//*[@id=\"dropdown\"]//*[contains(text(),\"Male\")]"));
           basePage.highlight(male);
        male.isDisplayed();
       String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);
    }

    @Test
    public void selectByVisibleText2(){

        Select sel=new Select(driver.findElement(By.id("dropdown")));

        sel.selectByVisibleText("Male");
        WebElement male= driver.findElement(By.xpath("//*[@id=\"dropdown\"]//*[contains(text(),\"Male\")]"));
        basePage.highlight(male);
        male.isDisplayed();
        String currentUrl= driver.getCurrentUrl();
        System.out.println(currentUrl);

    }







}
