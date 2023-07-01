import com.mifmif.common.regex.Generex;
import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testsInfo.Data;
import testsInfo.Urls;

@Listeners(TestListenerAdapter.class)
@Epic("WEB")
@Feature("Registration")
public class RegistrationTests extends BaseTest {

    @Parameters("url")
    @Step("Successful registration")
    @Test(description = "Successful registration")
    @Description("Successful registration can be done")
    public void registrationT1Test(String url) {
        goToWebPage("Go to UK page", url + Urls.UK_IP);
        header.clickOnHeaderElement("Click on Join button", header.getRegistrationButton());
        registrationForm.inputDataToRegistrationForm("Add email", registrationForm.getEmailField(), new Generex(Data.regexEmailForRegistration).random());
        registrationForm.inputDataToRegistrationForm("Add login", registrationForm.getLoginField(), new Generex(Data.regexLoginAndPasswordForRegistration).random());
        registrationForm.inputDataToRegistrationForm("Add password", registrationForm.getPasswordField(), new Generex(Data.regexLoginAndPasswordForRegistration).random());
        registrationForm.clickOnElementAtRegistrationForm("Click Next button", registrationForm.getNextButton());
        assertions.assertElementPresent("Moved to step 2 successfully", registrationForm.getOpenAccountButton());
        registrationForm.inputDataToRegistrationForm("Add First Name", registrationForm.getFirstNameField(), Data.FIRST_NAME);
        registrationForm.inputDataToRegistrationForm("Add Last Name", registrationForm.getLastNameField(), Data.LAST_NAME);
        registrationForm.selectItemByIndexAtRegistrationForm("Select birthday day", registrationForm.getBirthdayDayField(), 1);
        registrationForm.selectItemByIndexAtRegistrationForm("Select birthday month", registrationForm.getBirthdayMonthField(), 1);
        registrationForm.selectItemByIndexAtRegistrationForm("Select birthday year", registrationForm.getBirthdayYearField(), 1);
        registrationForm.inputDataToRegistrationForm("Add Address", registrationForm.getAddressField(), Data.ADDRESS);
        registrationForm.inputDataToRegistrationForm("Add City", registrationForm.getCityField(), Data.CITY);
        registrationForm.inputDataToRegistrationForm("Add Postcode", registrationForm.getZipCodeField(), Data.POSTCODE);
        registrationForm.inputDataToRegistrationForm("Add mobile number", registrationForm.getCellPhoneField(), Data.PHONE_NUMBER);
        registrationForm.clickOnElementAtRegistrationForm("Accept Special Bonus", registrationForm.getTermsCheckbox());
        registrationForm.clickOnElementAtRegistrationForm("Accept Terms", registrationForm.getTermsCheckbox());
        registrationForm.clickOnElementAtRegistrationForm("Click Open Account", registrationForm.getOpenAccountButton());
        sleep(1500);
        assertions.assertOneOfElementsIsPresent("Successful registration banner is shown", header.getDepositButton(), header.getBlockedCountryMessage());
        assertions.assertURL("URL is correct", url + Urls.UK_IP);
    }

    @Parameters("url")
    @Step("Successful registration Germany")
    @Test(description = "Successful registration")
    @Description("Successful registration can be done")
    public void germanyAutoCompleteRegistrationT1Test(String url) {
        goToWebPage("Go to German page", url + Urls.GERMAN_IP);
        header.clickOnHeaderElement("Click on Join button", header.getRegistrationButton());
        registrationForm.inputDataToRegistrationForm("Add email", registrationForm.getEmailField(), new Generex(Data.regexEmailForRegistration).random());
        registrationForm.inputDataToRegistrationForm("Add login", registrationForm.getLoginField(), new Generex(Data.regexLoginAndPasswordForRegistration).random());
        registrationForm.inputDataToRegistrationForm("Add password", registrationForm.getPasswordField(), new Generex(Data.regexLoginAndPasswordForRegistration).random());
        registrationForm.clickOnElementAtRegistrationForm("Click Next button", registrationForm.getNextButton());
        registrationForm.inputDataToRegistrationForm("Add Address", registrationForm.getAddressField(), Data.ADDRESS_GERMANY);
        assertions.assertElementPresent("Autocomplete dropdown list is shown", registrationForm.getGermanAddressAutoComplete());
    }
}

