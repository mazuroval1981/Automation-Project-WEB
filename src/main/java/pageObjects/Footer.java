package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Actions;
import utilities.BaseClass;

public class Footer extends BaseClass {
    public Footer(WebDriver driver){super(driver);}
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//li[@class='menu-item  footer-terms']/a")
    private WebElement terms;
    @FindBy(xpath = "//div[@class='disclaimer']")
    private WebElement disclaimer;
    @FindBy(xpath = "//li[@class='AGE18']")
    private WebElement underAgeIcon;
    @FindBy(xpath = "//li[@class='PCI']")
    private WebElement pciIcon;
    @FindBy(xpath = "//li[@class='SECTIGO']")
    private WebElement sectigoIcon;
    @FindBy(xpath = "//li[@class='PBPROGRESSPLAY']")
    private WebElement progressplayIcon;
    @FindBy(xpath = "//li[@class='MGA']")
    private WebElement mgaIcon;
    @FindBy(xpath = "//li[@class='GAMBLEAWARE2']")
    private WebElement beGambleAwareIcon;
    @FindBy(xpath = "//li[@class='GAMSTOP2']")
    private WebElement gamStopIcon;

    @Step("{step}")
    public void moveToFooterElement(String step, WebElement element){
        actions.moveToElement(step, element);
    }

    public WebElement getTerms() {
        return terms;
    }

    public WebElement getDisclaimer() {
        return disclaimer;
    }

    public WebElement getUnderAgeIcon() {return underAgeIcon;}

    public WebElement getBeGambleAwareIcon() {return beGambleAwareIcon;}

    public WebElement getMgaIcon() {return mgaIcon;}

    public WebElement getGamStopIcon() {return gamStopIcon;}

    public WebElement getProgressplayIcon() {return progressplayIcon;}

    public WebElement getPciIcon() {return pciIcon;}

    public WebElement getSectigoIcon() {return sectigoIcon;}
}

