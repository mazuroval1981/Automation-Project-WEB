package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BaseClass;

public class SinglePromotionPage extends BaseClass {
    public SinglePromotionPage(WebDriver driver) {super(driver);}

    @FindBy(xpath = "//article[@id='tnc']")
    private WebElement termsAndConditions;

    public WebElement getTermsAndConditions() {
        return termsAndConditions;
    }
}
