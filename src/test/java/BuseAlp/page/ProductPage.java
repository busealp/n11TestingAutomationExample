package BuseAlp.page;

import BuseAlp.base.BasePage;
import org.apache.xpath.objects.XNull;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private static final By ADD_TO_CART = By.xpath(".//div[@class='btnHolder']/a[@class='btn btnGrey btnAddBasket']");
    private static final By CART = By.xpath(".//div[@class='text']/a");
    //private static final By combobox = By.xpath(".//fieldset/select");
    //Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
    Select combo;






    public CartPage clickAddToCart(){

        try {
            combo = new Select(driver.findElement(By.xpath(".//fieldset/select")));
        }catch(NoSuchElementException e) {
            combo = null;
        }

        if(combo == null){
            clickElement(ADD_TO_CART);
            Wait(1);
            clickElement(CART);
            return new CartPage(driver);
        }else {
            combo.selectByIndex(1);
            clickElement(ADD_TO_CART);
            Wait(1);
            clickElement(CART);
            return new CartPage(driver);
        }

    }
    public String Price() {
      Wait(1);
        String price = driver.findElement(By.xpath(".//div[@class='newPrice']/ins")).getText();
        return price;
    }
}
