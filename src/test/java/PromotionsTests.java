import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testsInfo.Urls;

@Listeners(TestListenerAdapter.class)
@Epic("WEB")
@Feature("Promotion tests")
public class PromotionsTests extends BaseTest {

    @Step("Promotions page opens and displays fine")
    @Test(description = "Promotions page opens and displays fine")
    @Description("Checking that Promotions display successfully")
    public void promotionsTest() {
        header.clickOnHeaderElement("Click on Promotions link", header.getPromotionsLink());
        assertions.assertElementPresent("Single promotions are displayed", promotionsPage.getSinglePromotion());
    }

    @Parameters({"url", "login", "password"})
    @Step("Promotion Card Play Now button click Post Login returns to Home page")
    @Test(description = "Promotion Card Play Now button Post Login returns to Home page")
    @Description("Click on Promotion Card Play Now button Post Login returns to Home page")
    public void promotionCardPlayNowButtonPostloginTest(String url, String login, String password) {
        homePage.login("Login", login, password);
        sleep(5000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        goToWebPage("Go to Promotions page", url + Urls.PROMOTIONS_PAGE_URL);
        sleep(5000);
        promotionsPage.clickOnElementOnPromotionsPage("Click on Play Now button Post Login on Promotion Card", promotionsPage.getPlayNowButton());
        sleep(5000);
        assertions.assertElementIsNotPresent("User left Promotions page", promotionsPage.getSinglePromotionBy());
    }

    @Parameters({"url", "login", "password"})
    @Step("Promotion Card See Full terms link Post Login redirect to the single promotions page")
    @Test(description = "Promotion Card See Full terms link Post Login redirect to the single promotions page")
    @Description("Checking that See Full terms link Post Login redirect to the single promotions page")
    public void promotionCardSeeFullTermsLinkPostloginT1Test(String url, String login, String password) {
        homePage.login("Login", login, password);
        sleep(3000);
        goToWebPage("Go to Promotion Page", url + Urls.PROMOTIONS_PAGE_URL);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        promotionsPage.clickOnElementOnPromotionsPage("Click on See Full Terms Link Post Login on Promotion Card", promotionsPage.getSeeFullTermsLink());
        sleep(3000);
        assertions.assertElementPresent("Terms and conditions are shown", singlePromotionPage.getTermsAndConditions());
    }
}