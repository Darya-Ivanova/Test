package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage extends BasePage {

    @FindBy(css = ".mail-NestedList-Item-Info-Extras")
    private WebElement mailCountLabel;

    public MailPage (WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public int getMailsCount() {
        return Integer.valueOf(mailCountLabel.getText());
    }
}
