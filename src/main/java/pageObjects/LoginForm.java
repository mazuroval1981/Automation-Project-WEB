package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Actions;
import utilities.BaseClass;

public class LoginForm extends BaseClass {
    public LoginForm(WebDriver driver) {
        super(driver);
    }
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//input[@type='email']")
    private WebElement loginField;
    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordField;
    @FindBy(xpath = "//div[@class='modal-form__button m__b--4']/button")
    private WebElement loginButtonAtLoginForm;

    @Step("{step}")
    public void clickOnElementAtLoginForm(String step, WebElement element){
        actions.waitAndClick(step, element);
    }

    @Step("{step}")
    public void inputDataToLoginForm(String step, WebElement element, String data){
        actions.enterData(step, element, data);}

    public WebElement getLoginField() {return loginField;}

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButtonAtLoginForm() {
        return loginButtonAtLoginForm;
    }
}
