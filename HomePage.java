package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Actions;
import utilities.Assertions;
import utilities.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);
    Header header = new Header(driver);
    LoginForm loginForm = new LoginForm(driver);
    Assertions assertions = new Assertions(driver);

    private int gamesAmountBeforeMoreGamesClick;
    private int gamesAmountAfterMoreGamesClick;

    @FindBy(xpath = "//div[@class='cookie-disclaimer-banner__law-message']//button")
    private WebElement closeCookieBannerButton;
    @FindBy(xpath = "//div[@class='home-button-btn cta-common']")
    private WebElement closeGameButton;
    @FindBy(xpath = "//div[@class='carousel-buner__buttons']/button")
    private WebElement carouselPrelogin;
    @FindBy(xpath = "//div[@class='carousel-buner__buttons']")
    private WebElement carouselPostlogin;
    @FindBy(xpath = "//div[@class='sportbet-body']")
    private WebElement sportIframe;
    @FindBy(xpath = "//div[@class='search-result__item']")
    private WebElement headerGameSearchResult;
    @FindBy(xpath = "//section[@class='home-section games-carousel'][1]")
    private WebElement gamesGrid;
    @FindBy(xpath = "//img[@alt='Book of Dead']")
    private WebElement bookOfDeadGame;
    @FindBy(xpath = "//a[@title='Demo play' and @href='/casino/games/book-of-dead/']")
    private WebElement bookOfDeadDemoGameButton;
    @FindBy(xpath = "//div[@class='cookie-disclaimer-banner']//a")
    private WebElement cookiePolicy;
    private By cookiePolicyBy = By.xpath("//div[@class='cookie-disclaimer-banner']//a");
    @FindBy(xpath = "//section[@class='home-section games-carousel'][1]//button[@class='btn btn__sm btn-more']")
    private WebElement moreGamesButton;
    private By gameItemLocator = By.xpath("//div[@class='games__item']");

    @FindBy(xpath = " //div[@class='back-to-home-confirm-button']")
    private WebElement exitGameButton;
    @FindBy(xpath = "//div[@class='modal-form__button form__column m__b--0']/button[1]")
    private WebElement confirmLogoutButton;

    @Step("{step}")
    public void clickOnElementAtHomePage(String step, WebElement element){
        actions.waitAndClick(step, element);
    }

    @Step("{step}")
    public void inputDataAtHomePage(String step, WebElement element, String data){
        actions.enterData(step, element, data);}

    @Step("{step}")
    public void switchTabs(String step, int tabNumber){
        actions.switchTabs(step, tabNumber);}

    @Step("{step}")
    public void waitAndClickOrSkipIfNoElement(String step, WebElement element){
        actions.waitAndClickOrSkipIfNoElement(step, element);
    }

    @Step("{step}")
    public void login(String step, String login, String password){
        header.clickOnHeaderElement("Click on 'Login' button", header.getLoginButton());
        loginForm.inputDataToLoginForm("Input login", loginForm.getLoginField(), login);
        loginForm.inputDataToLoginForm("Input password", loginForm.getPasswordField(), password);
        loginForm.clickOnElementAtLoginForm("Click on 'Login' button", loginForm.getLoginButtonAtLoginForm());
        assertions.assertElementPresent("Login is successful", header.getDepositButton());
    }


    @Step("{step}")
    public void clickDirectly(String step, WebElement element){
        actions.clickDirectly(step, element);
    }

    @Step("Get games number displayed before More Games click")
    public void getGamesAmountBeforeMoreGamesButtonClick(By locator){
        gamesAmountBeforeMoreGamesClick = actions.getGamesAmount(locator);
    }

    @Step("Get games number displayed after More Games click")
    public void getGamesAmountAfterMoreGamesButtonClick(By locator){
        gamesAmountAfterMoreGamesClick = actions.getGamesAmount(locator);
    }

    public WebElement getCloseCookieBannerButton() { return closeCookieBannerButton;  }

    public WebElement getCarouselPrelogin() {return carouselPrelogin;}

    public WebElement getSportIframe() {return sportIframe;}

    public WebElement getGamesGrid() { return gamesGrid; }

    public WebElement getBookOfDeadGame() { return bookOfDeadGame; }

    public WebElement getCookiePolicy() { return cookiePolicy; }

    public By getCookiePolicyBy() { return cookiePolicyBy; }

    public WebElement getMoreGamesButton() {return moreGamesButton;}

    public By getGameItemLocator() {return gameItemLocator;}

    public int getGamesAmountBeforeMoreGamesClick() {return gamesAmountBeforeMoreGamesClick;}

    public int getGamesAmountAfterMoreGamesClick() {return gamesAmountAfterMoreGamesClick;}

    public WebElement getCloseGameButton() {return closeGameButton;}

    public WebElement getExitGameButton() {return exitGameButton;}

    public WebElement getHeaderGameSearchResult() {return headerGameSearchResult;}

    public WebElement getConfirmLogoutButton() {return confirmLogoutButton;}

    public WebElement getCarouselPostlogin() {return carouselPostlogin;}
}