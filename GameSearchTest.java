import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testsInfo.Data;


@Listeners(TestListenerAdapter.class)
@Epic("WEB")
@Feature("Game search test")
public class GameSearchTest extends BaseTest {

    @Step("Game search test")
    @Test(description = "Game search test")
    @Description("Game search test")
    public void searchFieldTest() {
        header.clickOnHeaderElement("Click on Search on Header", header.getGameSearchFieldOnHeader());
        homePage.inputDataAtHomePage("Type game name", header.getGameSearchFieldOnHeader(), Data.GAME_TO_SEARCH_BOOK_OF_DEAD);
        assertions.assertElementPresent("Correct search result is shown", homePage.getHeaderGameSearchResult());
    }
}
