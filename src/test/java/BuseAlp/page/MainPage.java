package BuseAlp.page;

import BuseAlp.base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {


    private static final By LOGIN_BUTTON = By.cssSelector("a.btnSignIn");
    private static final By SEARCH_FIELD = By.cssSelector("#searchData");
    private static final By SEARCH_BUTTON = By.cssSelector(".searchBtn");
    private static final By CART_BUTTON = By.cssSelector(".myBasket");
    private static final By USER_NAME = By.cssSelector(".menuLink.user");

    public MainPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickLoginButton(){
        clickElement(LOGIN_BUTTON);
        return new LoginPage(driver);
    }

    public MainPage clickSearchField(){
        clickElement(SEARCH_FIELD);
        return this;
    }
    public MainPage FillSearchBox(String FillSearchBox){
        sendKeysToElement(SEARCH_FIELD,FillSearchBox);
        return this;
    }
    public MainPage clickSearchButton(){
        clickElement(SEARCH_BUTTON);
        return this;
    }

    public MainPage clickCartButton(){
        clickElement(CART_BUTTON);
        return this;
    }

    public MainPage checkLogin(String username){
        String text = getElementText(USER_NAME);
        Assert.assertEquals(username, text);
        return this;
    }



}
