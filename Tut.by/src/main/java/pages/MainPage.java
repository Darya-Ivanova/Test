package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(css = ".enter")
    private WebElement authorizationButton;

    @FindBy(css = "input[name='login']")
    private WebElement loginInput;

    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;

    @FindBy(css = ".button.auth__enter")
    private WebElement loginButton;

    @FindBy(css = "li.topbar__li:nth-child(3)>a.topbar__link[title='Почта']")
    private WebElement buttonMail;

    public MainPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
        authorizationButton.click();
        loginInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public MailPage openMailPage () {
        buttonMail.click();
        MailPage mailPage = PageFactory.initElements(getDriver(), MailPage.class);
        return mailPage;
    }
}
