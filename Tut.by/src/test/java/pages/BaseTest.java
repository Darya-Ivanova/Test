package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.TestProperties;
import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    private static WebDriver driver;
    protected MainPage mainPage;

    private void getWebDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    @BeforeClass
    public void openMainPageAndLogin() {
        getWebDriver();
        driver.get(TestProperties.getBaseUrl());
        mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.login(TestProperties.getLogin(), TestProperties.getPassword());
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
    }
}
