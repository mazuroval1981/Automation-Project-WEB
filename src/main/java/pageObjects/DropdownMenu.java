package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BaseClass;

public class DropdownMenu extends BaseClass {
    public DropdownMenu(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//i[@class='icon-log-out-converted']")
    private WebElement logoutButton;
    @FindBy(xpath = "//ul[@id='account_details']//li[@class='item-myAccount']/a")
    private WebElement myAccount;
    @FindBy(xpath = "//ul[@id='account_details']//li[@class='item-myRewardPoints']/a")
    private WebElement myRewardPoints;
    @FindBy(xpath = "//ul[@id='account_details']//li[@class='item-responsibleGaming']/a")
    private WebElement responsibleGaming;
    @FindBy(xpath = "//ul[@id='account_details']//li[@class='item-deposit']/a")
    private WebElement deposit;
    @FindBy(xpath = "//ul[@id='account_details']//li[@class='item-cashout']/a")
    private WebElement cashout;
    @FindBy(xpath = "//ul[@id='account_details']//li[@class='item-needHelp']/a")
    private WebElement needHelp;
    @FindBy(xpath = "//ul[@id='account_details']//li[@class='item-contactUs']/a")
    private WebElement contactUs;

    public WebElement getLogoutButton() {return logoutButton;}

    public WebElement getMyAccount() {return myAccount;}

    public WebElement getMyRewardPoints() {return myRewardPoints;}

    public WebElement getResponsibleGaming() {return responsibleGaming;}

    public WebElement getDeposit() {return deposit;}

    public WebElement getCashout() {return cashout;}

    public WebElement getNeedHelp() {return needHelp;}

    public WebElement getContactUs() {return contactUs;}
}
