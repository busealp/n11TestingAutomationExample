package BuseAlp.test;

import BuseAlp.base.BaseTest;
import BuseAlp.base.BasePage;
import BuseAlp.page.CartPage;
import BuseAlp.page.MainPage;
import BuseAlp.page.ProductPage;
import BuseAlp.page.SearchPage;
import org.junit.Test;

public class TestPage extends BaseTest {
    private BasePage basePage;
    private String value = "";

    @Override
    public void setUp() throws Exception {
        super.setUp();
        basePage = new BasePage(driver);
    }

    @org.junit.Test
    public void TestPage() throws InterruptedException {
        new MainPage(driver)
                .clickLoginButton().username("dene.me@gmail.com").password("deneme123").clickLoginButton()
                .checkLogin("Test Kullanicisi")
                .FillSearchBox("Bilgisayar")
                .clickSearchButton();


        new SearchPage(driver)
                .clickNavigationBar(2)

                .clickProduct();
        value = new ProductPage(driver).Price();

        new ProductPage(driver).clickAddToCart().checkPrice(value);

        new CartPage(driver)
                .IncrementProductCount().checkProductCount(2).clickDeleteButton()
                .checkIfCartEmpty("Sepetiniz Boş");
    }
}