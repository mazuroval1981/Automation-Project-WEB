package core;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObjects.*;
import utilities.Actions;
import utilities.Assertions;

public class BaseTest {
    protected WebDriver driver;

    public Assertions assertions;
    public HomePage homePage;
    public Header header;
    public LoginForm loginForm;
    public DropdownMenu dropdownMenu;
    public PromotionsPage promotionsPage;
    public SinglePromotionPage singlePromotionPage;
    public Footer footer;
    public InnerPages innerPages;
    public GamesPage gamesPage;
    public RegistrationForm registrationForm;
    public DepositForm depositForm;
    public VIPPage vipPage;
    public AccountDetailsPage accountDetailsPage;
    public FooterRegulationPages footerRegulationPages;
    public Actions actions;
    public SportPage sportPage;


    @Parameters("url")
    @BeforeMethod
    @Step("Preconditions")
    public void setUp(String url) {

        ChromeOptions options = new ChromeOptions();
        //   options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--ignore-certificate-errors");
        driver = new ChromeDriver(options);
        goToWebPage("Go to home page" + url, url);
        driver.manage().window().maximize();
        System.out.println("open page");

        assertions = new Assertions(driver);
        homePage = new HomePage(driver);
        header = new Header(driver);
        loginForm = new LoginForm(driver);
        dropdownMenu = new DropdownMenu(driver);
        promotionsPage = new PromotionsPage(driver);
        singlePromotionPage = new SinglePromotionPage(driver);
        footer = new Footer(driver);
        innerPages = new InnerPages(driver);
        gamesPage = new GamesPage(driver);
        registrationForm = new RegistrationForm(driver);
        depositForm = new DepositForm(driver);
        vipPage = new VIPPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        footerRegulationPages = new FooterRegulationPages(driver);
        actions = new Actions(driver);
        sportPage = new SportPage(driver);
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenshotPNG(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public static void afterTest(WebDriver driver, ITestResult result) {
        String className = String.valueOf(result.getTestClass()).replaceAll("TestClass name=class ", "");
        String testName = result.getName();
        String screenName = className + testName;

        if (ITestResult.FAILURE == result.getStatus()) {
            saveScreenshotPNG(driver);
        }
        driver.quit();
    }

    @Step("{step}")
    public void goToWebPage(String step, String url) {
        driver.get(url);
    }


    @AfterMethod
    public void after(ITestResult result) {
        afterTest(driver, result);
    }

    public void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void refresh() {
        driver.navigate().refresh();
        sleep(1500);
    }

    public void deleteAllCookies() {
        driver.manage().deleteAllCookies();
    }
}

