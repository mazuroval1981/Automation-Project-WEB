package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Actions;
import utilities.BaseClass;

public class GamesPage extends BaseClass {
    public GamesPage(WebDriver driver){super(driver);}
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//iframe[@id='png-game-container']")
    private WebElement pngIframe;
    @FindBy(xpath = "//div[@id='game-grid']")
    private WebElement gameIframe;


    @Step("{step}")
    public void swipeRight(String step, WebElement element){
        actions.swipeRight(step, element);
    }

    public WebElement getPngIframe() {return pngIframe;}

    public WebElement getGameIframe() {
        return gameIframe;
    }
}
