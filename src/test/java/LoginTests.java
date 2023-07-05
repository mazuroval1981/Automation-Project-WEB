import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(TestListenerAdapter.class)
@Epic("WEB")
@Feature("Login Tests")
public class LoginTests extends BaseTest {

    @Parameters({"login", "password"})
    @Step("Login")
    @Test(description = "Login")
    @Description("Successful login")
    public void loginTest(String login, String password) {
        header.clickOnHeaderElement("Click on 'Login' button", header.getLoginButton());
        loginForm.inputDataToLoginForm("Input login", loginForm.getLoginField(), login);
        loginForm.inputDataToLoginForm("Input password", loginForm.getPasswordField(), password);
        loginForm.clickOnElementAtLoginForm("Click on 'Login' button", loginForm.getLoginButtonAtLoginForm());
        assertions.assertElementPresent("Assert 'Deposit' button is present", header.getDepositButton());
    }

    @Parameters({"login", "password"})
    @Step("Logout")
    @Test(description = "Logout")
    @Description("Successfully logged out")
    public void logoutTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        header.clickOnHeaderElement("Click on logout button", dropdownMenu.getLogoutButton());
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getConfirmLogoutButton());
        assertions.assertElementPresent("Login button is displayed", header.getLoginButton());
    }
}
