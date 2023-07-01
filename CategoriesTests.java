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
@Feature("Categories tests")
public class CategoriesTests extends BaseTest {

    @Parameters("url")
    @Step("Casino games are shown")
    @Test(description = "Casino games are shown")
    @Description("Casino games are shown")
    public void CasinoGamesDisplayFineTest(String url) {
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        assertions.assertElementPresent("Casino games are shown", homePage.getGamesGrid());
        assertions.assertURL("URL is correct", url);
    }

    @Step("Sport is shown")
    @Test(description = "Sport is shown")
    @Description("Sport is shown")
    public void sportDisplaysFineTest() {
        header.clickOnHeaderElement("Open Sport",header.getSportCategory());
        assertions.assertElementPresent("Sport is shown", homePage.getSportIframe());
    }
}
