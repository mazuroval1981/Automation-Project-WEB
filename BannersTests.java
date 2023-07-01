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
@Feature("Banners click tests")
public class BannersTests extends BaseTest {


    @Step("Carousel click pre-login")
    @Test(description = "Carousel click pre-login")
    @Description("Carousel click pre-login")
    public void carouselClickPreloginTest() {
        actions.waitAndClick("Click on carousel",homePage.getCarouselPrelogin());
        assertions.assertOneOfElementsIsPresent("Registration widget is shown", loginForm.getLoginField(), registrationForm.getEmailField());
    }
    @Parameters({"login", "password"})
    @Step("Carousel click post-login")
    @Test(description = "Carousel click post-login")
    @Description("Carousel click post-login")
    public void carouselClickPostloginTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        homePage.clickOnElementAtHomePage("Close cookies banner", homePage.getCloseCookieBannerButton());
        header.clickOnHeaderElement("Click on Account Menu", header.getHomeButton());
        header.clickOnHeaderElement("Click on carousel",homePage.getCarouselPostlogin());
        assertions.assertOneOfElementsIsPresent("Deposit is shown", header.getDepositButton());
    }
}
