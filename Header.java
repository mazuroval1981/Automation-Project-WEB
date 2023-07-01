package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Actions;
import utilities.BaseClass;


public class Header extends BaseClass {
    public Header(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//button[@class='btn btn__transparent btn__login']")
    private WebElement loginButton;
    @FindBy(xpath = "//button[@class='btn btn__signup']")
    private WebElement registrationButton;
    @FindBy(xpath = "//div[@class='header__balance balance']//button")
    private WebElement depositButton;
    @FindBy(xpath = "//div[@class = 'text-wrapper statusbar__balance']")
    private WebElement account;
    @FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle primary-textcolor']")
    private WebElement drpodownMenu;
    @FindBy(xpath = "//i[@class='icon-promotion-menu']")
    private WebElement promotionsLink;
    @FindBy(xpath = "//i[@class='icon-rewards-menu']")
    private WebElement vipLink;
    @FindBy(xpath = "//ul//a[@class='game-category-0 active']")
    private WebElement category;
    @FindBy(xpath = "//div[@class='mode']//i[@class='icon-sportbook-menu']")
    private WebElement sportCategory;
    @FindBy(xpath = "//div[@class='container-fluid']//a[contains(text(), 'Casino')]")
    private WebElement casinoCategory;
    @FindBy(xpath ="//div[@class='sidebar__header']//a[@class='sidebar-logo']")
    private WebElement logoButton;

    @FindBy(xpath ="//i[@class='icon-home-menu']")
    private WebElement homeButton;
    @FindBy(xpath = "//div[@class='header-search']//input")
    private WebElement gameSearchFieldOnHeader;
    @FindBy(xpath ="//div[@class='mwc-reg-error-message mwc-form-error-message ng-isolate-scope']")
    private  WebElement blockedCountryMessage;


    @Step("{step}")
    public void clickOnHeaderElement(String step, WebElement element){
        actions.waitAndClick(step, element);
    }


    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getDepositButton() {return depositButton;}

    public WebElement getRegistrationButton() {return registrationButton;}

    public WebElement getAccount() {return account;}

    public WebElement getDrpodownMenu() {
        return drpodownMenu;
    }

    public WebElement getPromotionsLink() {return promotionsLink;}

    public WebElement getVipLink() {return vipLink;}

    public WebElement getCategory() {
        return category;
    }

    public WebElement getSportCategory() {return sportCategory;}

    public WebElement getLogoButton() { return logoButton;}

    public WebElement getCasinoCategory() {
        return casinoCategory;
    }

    public WebElement getGameSearchFieldOnHeader() { return gameSearchFieldOnHeader;}

    public WebElement getBlockedCountryMessage() {return blockedCountryMessage;}

    public WebElement getHomeButton() {return homeButton;}
}
