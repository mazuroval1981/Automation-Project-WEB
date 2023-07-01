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
import testsInfo.Urls;

@Listeners(TestListenerAdapter.class)
@Epic("WEB")
@Feature("Cookie Policy Tests")
@Test(description = "Cookie Policy is presented on all pages and has correct link")
public class CookiePolicyTests extends BaseTest {

    @Step("Click on Cookie Policy")
    @Test(description = "Click on Cookie Policy is opening Privacy pop-up")
    @Description("Click on Cookie Policy is opening Privacy pop-up")
    public void clickCookiePolicyOpensPrivacyPopupTest() {
        assertions.assertElementPresent("Cookie Policy is presented", homePage.getCookiePolicy());
        homePage.clickOnElementAtHomePage("Click on Cookie Policy", homePage.getCookiePolicy());
        sleep(1000);
        assertions.containTextFromElement("Privacy Title is presented", innerPages.getInfoPageTitle(), Data.PRIVACY_POPUP_TITLE);
    }

    @Step("Close Cookie Policy")
    @Test(description = "Click Close on Cookie Policy closes Cookie Policy")
    @Description("Click Close on Cookie Policy closes Cookie Policy")
    public void clickCloseClosesCookiePolicyTest() {
        assertions.assertElementPresent("Cookie Policy is presented", homePage.getCookiePolicy());
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        sleep(300);
        assertions.assertElementIsNotPresent("CookiePolicy is not presented", homePage.getCookiePolicyBy());
    }

    @Parameters("url")
    @Step("Don't close Cookie Policy, go to Promotions page, verify Cookie Policy is presented")
    @Test(description = "Cookie Policy is shown on Promotions page when wasn't closed on Home page")
    @Description("Cookie Policy is shown on Promotions page when wasn't closed on Home page")
    public void cookiePolicyIsPresentedOnPromotionsPageTest(String url) {
        assertions.assertElementPresent("Cookie Policy is presented", homePage.getCookiePolicy());
        header.clickOnHeaderElement("Click on Promotions link", header.getPromotionsLink());
        assertions.assertURL("Promotion page url", url + Urls.PROMOTIONS_PAGE_URL);
        assertions.assertElementPresent("Cookie Policy is presented", homePage.getCookiePolicy());
    }

    @Step("Don't close Cookie Policy, go to Sport page, verify Cookie Policy is presented")
    @Test(description = "Cookie Policy is shown on Sport page when wasn't closed on Home page")
    @Description("Cookie Policy is shown on Sport page when wasn't closed on Home page")
    public void cookiePolicyIsPresentedOnSportPageTest() {
        assertions.assertElementPresent("Cookie Policy is presented", homePage.getCookiePolicy());
        header.clickOnHeaderElement("Click on Sport icon", header.getSportCategory());
        assertions.assertElementPresent("Sport is shown", homePage.getSportIframe());
        assertions.assertElementPresent("Cookie Policy is presented", homePage.getCookiePolicy());
    }
}
