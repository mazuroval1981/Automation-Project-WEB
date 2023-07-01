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
@Feature("Footer icons tests")

public class FooterIconsTests extends BaseTest {

    @Parameters("url")
    @Step("MGA footer icons are displayed")
    @Test(description = "MGA footer icons are displayed")
    @Description("MGA footer icons are displayed")
    public void mgaFooterIconsTest(String url) {
        goToWebPage("Go to MGA page", url + Urls.MGA_IP);
        sleep(3000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        footer.moveToFooterElement("Scroll to UnderAgeIcon", footer.getUnderAgeIcon());
        assertions.assertElementPresent("Underage link is present", footer.getUnderAgeIcon());
        assertions.assertElementPresent("ProgressPlay link is present", footer.getProgressplayIcon());
        assertions.assertElementPresent("GamblersAnonymous link is present", footer.getBeGambleAwareIcon());
        assertions.assertElementPresent("GameCare link is present", footer.getPciIcon());
        assertions.assertElementPresent("Cetigo link is present", footer.getSectigoIcon());
        assertions.assertElementPresent("MGA link is present", footer.getMgaIcon());
    }

    @Parameters("url")
    @Step("UK footer icons are displayed")
    @Test(description = "UK footer icons are displayed")
    @Description("UK footer icons are displayed")
    public void ukFooterIconsTest(String url) {
        goToWebPage("Go to UK page", url + Urls.UK_IP);
        sleep(3000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        footer.moveToFooterElement("Scroll to UnderAgeIcon", footer.getUnderAgeIcon());
        assertions.assertElementPresent("Underage link is present", footer.getUnderAgeIcon());
        assertions.assertElementPresent("ProgressPlay link is present", footer.getProgressplayIcon());
        assertions.assertElementPresent("BeGambleAware link is present", footer.getBeGambleAwareIcon());
        assertions.assertElementPresent("GameCare link is present", footer.getPciIcon());
        assertions.assertElementPresent("GamStop link is present", footer.getGamStopIcon());
    }

    @Parameters("url")
    @Step("Germany footer icons are displayed")
    @Test(description = "Germany footer icons are displayed")
    @Description("Germany footer icons are displayed")
    public void germanyFooterIconsTest(String url) {
        goToWebPage("Go to Germany page", url + Urls.GERMAN_IP);
        sleep(3000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        footer.moveToFooterElement("Scroll to UnderAgeIcon", footer.getUnderAgeIcon());
        assertions.assertElementPresent("Underage link is present", footer.getUnderAgeIcon());
        assertions.assertElementPresent("ProgressPlay link is present", footer.getProgressplayIcon());
        assertions.assertElementPresent("BeGambleAware link is present", footer.getBeGambleAwareIcon());
        assertions.assertElementPresent("GameCare link is present", footer.getPciIcon());
        assertions.assertElementPresent("MGA link is present", footer.getMgaIcon());
    }

    @Parameters("url")
    @Step("Finland footer icons are displayed")
    @Test(description = "Finland footer icons are displayed")
    @Description("Finland footer icons are displayed")
    public void finlandFooterIconsTest(String url) {
        goToWebPage("Go to Finland page", url + Urls.FINLAND_IP);
        sleep(3000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        footer.moveToFooterElement("Scroll to UnderAgeIcon", footer.getUnderAgeIcon());
        assertions.assertElementPresent("Underage link is present", footer.getUnderAgeIcon());
        assertions.assertElementPresent("GameCare link is present", footer.getPciIcon());
        assertions.assertElementPresent("ProgressPlay link is present", footer.getProgressplayIcon());
        assertions.assertElementPresent("BeGambleAware link is present", footer.getBeGambleAwareIcon());
        assertions.assertElementPresent("MGA link is present", footer.getMgaIcon());
    }

    @Parameters("url")
    @Step("Norway footer icons are displayed")
    @Test(description = "Norway footer icons are displayed")
    @Description("Norway footer icons are displayed")
    public void norwayFooterIconsTest(String url) {
        goToWebPage("Go to Norway page", url + Urls.NORWAY_IP);
        sleep(3000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        footer.moveToFooterElement("Scroll to UnderAgeIcon", footer.getUnderAgeIcon());
        assertions.assertElementPresent("Underage link is present", footer.getUnderAgeIcon());
        assertions.assertElementPresent("GameCare link is present", footer.getPciIcon());
        assertions.assertElementPresent("ProgressPlay link is present", footer.getProgressplayIcon());
        assertions.assertElementPresent("BeGambleAware link is present", footer.getBeGambleAwareIcon());
        assertions.assertElementPresent("MGA link is present", footer.getMgaIcon());
    }

    @Parameters("url")
    @Step("LATAM footer icons are displayed")
    @Test(description = "LATAM footer icons are displayed")
    @Description("LATAM footer icons are displayed")
    public void latamFooterIconsTest(String url) {
        goToWebPage("Go to LATAM page", url + Urls.LATAM_IP);
        sleep(3000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        footer.moveToFooterElement("Scroll to UnderAgeIcon", footer.getUnderAgeIcon());
        assertions.assertElementPresent("Underage link is present", footer.getUnderAgeIcon());
        assertions.assertElementPresent("GameCare link is present", footer.getPciIcon());
        assertions.assertElementPresent("ProgressPlay link is present", footer.getProgressplayIcon());
        assertions.assertElementPresent("BeGambleAware link is present", footer.getBeGambleAwareIcon());
        assertions.assertElementPresent("MGA link is present", footer.getMgaIcon());
    }

    @Parameters("url")
    @Step("Canada footer icons are displayed")
    @Test(description = "Canada footer icons are displayed")
    @Description("Canada footer icons are displayed")
    public void canadaFooterIconsTest(String url) {
        goToWebPage("Go to Canada page", url + Urls.CANADA_IP);
        sleep(3000);
        homePage.clickOnElementAtHomePage("Close Cookie", homePage.getCloseCookieBannerButton());
        footer.moveToFooterElement("Scroll to UnderAgeIcon", footer.getUnderAgeIcon());
        assertions.assertElementPresent("Underage link is present", footer.getUnderAgeIcon());
        assertions.assertElementPresent("GameCare link is present", footer.getPciIcon());
        assertions.assertElementPresent("ProgressPlay link is present", footer.getProgressplayIcon());
        assertions.assertElementPresent("BeGambleAware link is present", footer.getBeGambleAwareIcon());
        assertions.assertElementPresent("MGA link is present", footer.getMgaIcon());
    }

    @Parameters("url")
    @Step("Regulation sites open fine")
    @Test(description = "Regulation sites open fine")
    @Description("Regulation sites open fine")
    public void regulationSitesWorkTest(String url) {
        goToWebPage("Go to MGA page", Urls.MGA);
        assertions.assertElementPresent("MGA page is displayed", footerRegulationPages.getMgaLogo());
        goToWebPage("Go to Progressplay page", Urls.PROGRESSPLAY);
        assertions.assertElementPresent("Progressplay page is displayed", footerRegulationPages.getProgressplayLogo());
        goToWebPage("Go to PCI page", Urls.PCI);
        homePage.waitAndClickOrSkipIfNoElement("Click close cookies", footerRegulationPages.getAcceptCookiesOnPciPage());
        assertions.assertElementPresent("PCI page is displayed", footerRegulationPages.getPciHeader());
        goToWebPage("Go to Begambleawere page", Urls.BEGAMBLEAWERE);
        assertions.assertElementPresent("Begambleawere page is displayed", footerRegulationPages.getBegambleawereLogo());
        goToWebPage("Go to GamStop page", Urls.GAM_STOP);
        homePage.waitAndClickOrSkipIfNoElement("Click Close Cookies", footerRegulationPages.getAcceptCookiesOnGamestopPage());
        assertions.assertElementPresent("GamStop page is displayed", footerRegulationPages.getGamStopLogo());
        goToWebPage("Go to Underage page", url + Urls.UNDERAGE);
        assertions.containTextFromElement("Underage title is shown", innerPages.getInfoPageTitle(), Data.UNDERAGE_TITLE);
    }
}
