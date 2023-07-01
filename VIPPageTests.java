import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListenerAdapter.class)
@Epic("WEB")
@Feature("VIP page tests")
public class VIPPageTests extends BaseTest {

    @Step("VIP page opens and displays properly")
    @Test(description = "VIP page opens and displays properly")
    @Description("Checking that VIP displays successfully")
    public void vipPageT1Test() {
        header.clickOnHeaderElement("Click on VIP page link", header.getVipLink());
        assertions.assertElementPresent("VIP Label is shown", vipPage.getVipPageLabel());
    }
}
