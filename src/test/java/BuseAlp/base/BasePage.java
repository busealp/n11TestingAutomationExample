package BuseAlp.base;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.LogManager;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,20,1000);
    }

    public WebElement clickElement(By by) {

        WebElement element = driver.findElement(by);
        element.click();

        return element;
    }

    public List<WebElement> clickElements(By by, int index){
        List<WebElement> elements = driver.findElements(by);
        elements.get(index).click();
        return elements;
    }

    public WebElement clickLogin(By by){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
        return element;
    }

    public List<WebElement> getElements(By by){
        List<WebElement> cartPrice = driver.findElements(by);
        String cartPriceString = cartPrice.get(0).getText();

        return cartPrice;
    }


    public String getElementText(By by){
        WebElement element = driver.findElement(by);
        String text = element.getText();
        System.out.println(text);
        return text;
    }

    public WebElement sendKeysToElement(By by, String value){

        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(value);


        return element;

    }

    public void Wait(int sec){
        try{
            Thread.sleep(sec * 1000);
        }catch(Exception e){
            Assert.fail("explicitWait error: " + e.toString());
        }
    }

}
