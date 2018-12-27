package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTutBy extends BaseTest {

    private MailPage mailPage;

    @Test
    public void mailCountTest() {

        mailPage = mainPage.openMailPage();

        int mailsCount = mailPage.getMailsCount();

        System.out.println("Number of incoming mails = " + mailsCount);

        //Check that count of mails > 0
        Assert.assertTrue(mailsCount > 0, "Mails not found!");
    }
}
