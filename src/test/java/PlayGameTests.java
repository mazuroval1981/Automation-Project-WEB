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
@Feature("Playing games")
public class PlayGameTests extends BaseTest {

    @Parameters({"login", "password"})
    @Step("Play real game")
    @Test(description = "Play real game")
    @Description("Real game opens")
    public void playRealTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        homePage.clickOnElementAtHomePage("Click on Book of Dead Play button", homePage.getBookOfDeadGame());
        assertions.assertOneOfElementsIsPresent("Game frame is loaded", gamesPage.getPngIframe(), gamesPage.getGameIframe());
    }

    @Parameters({"login", "password"})
    @Step("Real Game is properly closed")
    @Test(description = "Real Game is properly closed")
    @Description("Real Game is properly closed")
    public void realGameIsProperlyClosedTest(String login, String password) {
        homePage.login("Login", login, password);
        refresh();
        homePage.clickOnElementAtHomePage("Close cookie", homePage.getCloseCookieBannerButton());
        homePage.clickOnElementAtHomePage("Click on Starburst Play button", homePage.getBookOfDeadGame());
        assertions.assertElementPresent("Game frame is loaded", gamesPage.getGameIframe());
        homePage.clickOnElementAtHomePage("Click on Back to Lobby button", homePage.getCloseGameButton());
        homePage.clickOnElementAtHomePage("Click Yes button", homePage.getExitGameButton());
        assertions.assertElementPresent("Loyalty link is shown", header.getVipLink());
    }
}