import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testsInfo.Data;


@Listeners(TestListenerAdapter.class)
@Epic("WEB")
@Feature("Dropdown menu tests")
public class DropdownMenuTests extends BaseTest {

    @Parameters({"login", "password"})
    @Step("Dropdown menu My Account")
    @Test(description = "Dropdown menu My Account")
    @Description("Dropdown menu My Account")
    public void myAccountDropdownMenuTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        header.clickOnHeaderElement("Click on dropdown Menu",header.getDrpodownMenu());
        sleep(1500);
        header.clickOnHeaderElement("Click on Account Details", dropdownMenu.getMyAccount());
        assertions.assertElementPresent("Account details display fine", accountDetailsPage.getAccountDetails());
        assertions.assertElementPresent("Account details display fine", accountDetailsPage.getBonuses());
        assertions.assertElementPresent("Account details display fine", accountDetailsPage.getAccountSettings());
    }

    @Parameters({"login", "password"})
    @Step("Dropdown menu My reward points")
    @Test(description = "Dropdown menu My reward points")
    @Description("Dropdown menu My reward points")
    public void myRewardPointsDropdownMenuTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        header.clickOnHeaderElement("Click on dropdown Menu",header.getDrpodownMenu());
        sleep(1500);
        header.clickOnHeaderElement("Click on Rewards Points", dropdownMenu.getMyRewardPoints());
        assertions.assertElementPresent("My reward points display fine", accountDetailsPage.getMyRewardPoints());
    }

    @Parameters({"login", "password"})
    @Step("Dropdown menu Responsible gaming policy")
    @Test(description = "Dropdown menu Responsible gaming policy")
    @Description("Dropdown menu Responsible gaming policy")
    public void responsibleGamingPolicyDropdownMenuTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        header.clickOnHeaderElement("Click on dropdown Menu",header.getDrpodownMenu());
        sleep(1500);
        header.clickOnHeaderElement("Click on Responsible gaming policy", dropdownMenu.getResponsibleGaming());
        assertions.containTextFromElement("Responsible gaming policy display fine", innerPages.getInfoPopupTitle(), Data.RESPONSIBLE_GAMING_TITLE);
    }

    @Parameters({"login", "password"})
    @Step("Dropdown menu Deposit")
    @Test(description = "Dropdown menu Deposit")
    @Description("Dropdown menu Deposit")
    public void depositDropdownMenuTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        header.clickOnHeaderElement("Click on dropdown Menu",header.getDrpodownMenu());
        sleep(1500);
        header.clickOnHeaderElement("Click on Deposit",dropdownMenu.getDeposit());
        assertions.assertElementPresent("Deposit widget is shown", depositForm.getCloseDepositForm());
    }

    @Parameters({"login", "password"})
    @Step("Dropdown menu Cashout")
    @Test(description = "Dropdown menu Cashout")
    @Description("Dropdown menu Cashout")
    public void cashoutDropdownMenuTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        header.clickOnHeaderElement("Click on dropdown Menu",header.getDrpodownMenu());
        sleep(1500);
        header.clickOnHeaderElement("Click on Cashout", dropdownMenu.getCashout());
        assertions.assertElementPresent("Cashout displays fine", accountDetailsPage.getCashout());
    }

    @Parameters({"login", "password"})
    @Step("Dropdown menu Need Help")
    @Test(description = "Dropdown menu Need Help")
    @Description("Dropdown menu Need Help")
    public void needHelpDropdownMenuTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        header.clickOnHeaderElement("Click on dropdown Menu",header.getDrpodownMenu());
        sleep(1500);
        header.clickOnHeaderElement("Click on Cashout",dropdownMenu.getNeedHelp());
        assertions.containTextFromElement("Need Help displays fine", innerPages.getInfoPopupTitle(), Data.HELP_TITLE);
    }

    @Parameters({"login", "password"})
    @Step("Dropdown menu Contact Us")
    @Test(description = "Dropdown menu Contact Us")
    @Description("Dropdown menu Contact Us")
    public void contactUsDropdownMenuTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        header.clickOnHeaderElement("Click on dropdown Menu",header.getDrpodownMenu());
        sleep(1500);
        header.clickOnHeaderElement("Click on Contact Us",dropdownMenu.getContactUs());
        assertions.assertElementPresent("Contact Us form displays fine", innerPages.getContactUsForm());
    }
}
