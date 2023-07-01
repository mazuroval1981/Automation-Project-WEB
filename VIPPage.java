package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BaseClass;

public class VIPPage extends BaseClass {
    public VIPPage(WebDriver driver){super(driver);}

    @FindBy(xpath = "//section[@class='promotionPage RewardsProgramme']")
    private WebElement vipPageLabel;

    public WebElement getVipPageLabel() {return vipPageLabel;}
}
