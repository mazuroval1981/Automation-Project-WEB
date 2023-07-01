package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Actions;
import utilities.BaseClass;

public class SportPage extends BaseClass {
    public SportPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    @FindBy(css = ".single-events-b-v3")
    private WebElement bet;
    @FindBy(xpath = "//div[@class='batslip-contain-fixed-v3']")
    private WebElement betEventInSlip;
    private By myBetsButtonLocator = By.xpath("//a[contains(text(), 'My Bets')]");

    @Step("{step}")
    public void clickOnElementAtSportPage(String step, WebElement element){
        actions.waitAndClick(step, element);
    }


    public WebElement getBet() {return bet;}
    public WebElement getBetEventInSlip() {return betEventInSlip;}
    public By getMyBetsButtonLocator() {
        return myBetsButtonLocator;
    }
}
