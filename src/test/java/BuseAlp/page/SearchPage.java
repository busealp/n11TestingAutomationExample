package BuseAlp.page;

import BuseAlp.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {

        super(driver);
    }


    public SearchPage clickNavigationBar(int a) {

        WebElement element = driver.findElement(By.xpath(".//div[@class='pagination']/a[" + a + "]"));
        System.out.println(element);
        Actions builder = new Actions(driver);
        builder.moveToElement(element);
        builder.moveToElement(element).click().perform();

        return this;
    }

    public SearchPage clickProduct() {

        int listProduct = driver.findElements(By.xpath(".//li[@class='column']/div/div[@class='pro']/a")).size();
        int i = new Random().nextInt(listProduct);

        WebElement element = driver.findElement(By.xpath(".//li[@class='column'][" + i + "]/div/div[@class='pro']/a"));
        Actions builder = new Actions(driver);
        builder.moveToElement(element);
        builder.moveToElement(element).click().perform();
        return this;
    }
}