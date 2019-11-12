package BuseAlp.page;

import BuseAlp.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private static final By EMAIL_FIELD = By.cssSelector("#email");
    private static final By PASSWORD_FIELD = By.cssSelector("#password");
    private static final By LOGIN_BUTTON = By.cssSelector("#loginButton");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage clickEmailField(){
        clickElement(EMAIL_FIELD);

        return this;
    }

    public LoginPage clickPasswordField(){
        clickElement(PASSWORD_FIELD);
        return this;
    }

    public MainPage clickLoginButton() {
        clickElement(LOGIN_BUTTON);
        return new MainPage(driver);
    }

    public LoginPage password(String password){
        sendKeysToElement(PASSWORD_FIELD,password);
        return this;
    }

    public LoginPage username(String username) throws InterruptedException {
        Thread.sleep(1000);
        sendKeysToElement(EMAIL_FIELD,username);
        return this;
    }


}
