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
@Feature("Sport Tests")
public class SportTests extends BaseTest {

    @Parameters("url")
    @Step("Sport bet is shown in bet slip")
    @Test(description = "Sport bet is shown in bet slip")
    @Description("Sport bet is shown in bet slip")
    public void sportBetGoesToBetSlipT1Test(String url) {
        goToWebPage("Go to Sport page", url + Urls.SPORT_PAGE_URL);
        sportPage.clickOnElementAtSportPage("Make bet", sportPage.getBet());
        assertions.assertElementPresent("Bet is in bet slip", sportPage.getBetEventInSlip());
    }

    @Parameters("url")
    @Step("My Bets is shown only on Sport page")
    @Test(description = "My Bets is shown only on Sport page")
    @Description("My Bets is shown only on Sport page")
    public void myBetsIsShownOnlyOnSportT1Test(String url) {
        goToWebPage("Go to Sport page", url + Urls.SPORT_PAGE_URL);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        sportPage.clickOnElementAtSportPage("Make bet", sportPage.getBet());
        assertions.assertElementPresent("Bet is in bet slip", sportPage.getBetEventInSlip());
        header.clickOnHeaderElement("Go to Casino", header.getCasinoCategory());
        assertions.assertElementIsNotPresent("My Bets is NOT shown", sportPage.getMyBetsButtonLocator());
    }
}
