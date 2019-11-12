package BuseAlp.base;

import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    protected WebDriver driver;
    public static String baseUrl = "https://www.n11.com";
    public static Dimension browserSize = null;

    @Before
    public void setUp() throws Exception{

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
         System.setProperty("webdriver.chrome.driver", "properties/driver/chromedriver.exe");
            driver = new ChromeDriver(capabilities);

        driver.manage().window().maximize();
        browserSize = driver.manage().window().getSize();
        Thread.sleep(1000);
        driver.get(baseUrl);
    }

}
