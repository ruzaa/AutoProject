package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import drivers.MyDriver;
import org.junit.runner.RunWith;
import pageObject.LoginPage;


@RunWith(Cucumber.class)

public class LoginSteps {
    private MyDriver myDriver;
    LoginPage loginPage = new LoginPage();

    @Before
    public void setup() {
        myDriver = new MyDriver();
        myDriver.initialize();
    }

    @Given("^I have accessed the QuintoAndar site$")
    public void iHaveAccessedTheQuintoAndarSite()  {
        loginPage.opensite();

    }

    @When("^I click in the waffle menu button$")
    public void iClickInTheWaffleMenuButton()  {
       loginPage.openWaffleMenu();
    }

    @Then("^I should see the login button$")
    public void iShouldSeeTheLoginButton()  {
        loginPage.validateWaffleMenu();
    }

    @When("^I click in the login button$")
    public void iClickInTheLoginButton()  {
          loginPage.openLogin();
    }

    @And("^insert a valid mobile country code$")
    public void insertAValidMobileCountryCode()  {
         loginPage.countrycode();
    }

    @And("^insert a valid mobile área code$")
    public void insertAValidMobileAreaCode() {
          loginPage.areacode();
    }

    @And("^insert a valid mobile number$")
    public void insertAValidMobileNumber() {
         loginPage.validnumber();
    }

    @And("^I click in the confirm button$")
    public void iClickInTheConfirmButton(){
        loginPage.confirmbutton();
    }

    @And("^confirm the information in the popup$")
    public void confirmTheInformationInThePopup() {
        loginPage.popup();
    }

    @And("^insert the code received by sms in the AccountKit$")
    public void insertTheCodeReceivedBySmsInTheAccountKit(){
        loginPage.smscode();
    }

    @And("^click in the continue button$")
    public void clickInTheContinueButton() {
        loginPage.continuebutton();
    }

    @Then("^I should be authenticated with success$")
    public void iShouldBeAuthenticatedWithSuccess() {
         loginPage.validateauthentication();
    }
}











