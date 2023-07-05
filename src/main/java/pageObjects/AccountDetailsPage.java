package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BaseClass;

public class AccountDetailsPage extends BaseClass {
    public AccountDetailsPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "//span[@class='mwc-account-section-title-text ng-binding' and contains(text(), 'Account Details')]")
    private WebElement accountDetails;
    @FindBy(xpath = "//span[@class='mwc-account-section-title-text ng-binding' and contains(text(), 'Bonuses')]")
    private WebElement bonuses;
    @FindBy(xpath = "//span[@class='mwc-account-section-title-text ng-binding' and contains(text(), 'Account Settings')]")
    private WebElement accountSettings;
    @FindBy(xpath = "//div[@class='mwc-section-title--header-web mwc-section-title--aside mwc-section-title' and contains(text(), 'My Reward Points')]")
    private WebElement myRewardPoints;
    @FindBy(xpath = "//div[@class='mwc-section-title--header-web mwc-section-title--aside mwc-section-title' and contains(text(), 'a')]")
    private WebElement cashout;

    public WebElement getAccountDetails() {
        return accountDetails;
    }

    public WebElement getBonuses() {
        return bonuses;
    }

    public WebElement getAccountSettings() {
        return accountSettings;
    }

    public WebElement getMyRewardPoints() {
        return myRewardPoints;
    }

    public WebElement getCashout() {
        return cashout;
    }
}
