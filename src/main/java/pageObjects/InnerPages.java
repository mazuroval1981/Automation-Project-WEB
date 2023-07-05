package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BaseClass;

public class InnerPages extends BaseClass {
    public InnerPages(WebDriver driver){super(driver);}

    @FindBy(xpath = "//h1[@class='popup-header text-uppercase']")
    private WebElement infoPopupTitle;
    @FindBy(xpath = "//h1")
    private WebElement infoPageTitle;
    @FindBy(xpath = "//div[@class='content-area']")
    private WebElement infoPageText;
    @FindBy(xpath = "//div[@class='panel__body terms-content']")
    private WebElement termsPageText;
    @FindBy(xpath = "//div[@class='asg--contact-us-wrap']")
    private WebElement contactUsForm;


    public WebElement getInfoPopupTitle() {
        return infoPopupTitle;
    }

    public WebElement getContactUsForm() {
        return contactUsForm;
    }

    public WebElement getInfoPageTitle() { return infoPageTitle; }

    public WebElement getInfoPageText() { return infoPageText; }

    public WebElement getTermsPageText() {return termsPageText;}
}
