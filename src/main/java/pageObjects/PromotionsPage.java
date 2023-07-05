package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Actions;
import utilities.BaseClass;

public class PromotionsPage extends BaseClass {
    public PromotionsPage(WebDriver driver) {super(driver);}
    Actions actions = new Actions(driver);

    @FindBy(css = "promotions-buner__title")
    private WebElement singlePromotion;
    private By singlePromotionBy = By.xpath("//div[@class='card card-grid__promotions']");
    @FindBy(xpath = "//a[@class='openGame']")
    private WebElement playNowButton;
    @FindBy(xpath = "//div[@class='promotions-item'][1]//h5")
    private WebElement seeFullTermsLink;

    @Step("{step}")
    public void clickOnElementOnPromotionsPage(String step, WebElement element){
        actions.waitAndClick(step, element);
    }

    public WebElement getSinglePromotion() { return singlePromotion; }

    public By getSinglePromotionBy() { return singlePromotionBy; }

    public WebElement getPlayNowButton() { return playNowButton; }

    public WebElement getSeeFullTermsLink() { return seeFullTermsLink; }
}
