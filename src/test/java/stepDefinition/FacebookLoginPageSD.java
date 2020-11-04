package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import runnerTest.webPage.FacebookLoginPage;
import utils.BasePage;

public class FacebookLoginPageSD {

    FacebookLoginPage facebookLoginPage = new FacebookLoginPage();

    @Given("^I am on Facebook home page$")
    public void onHomePage(){
        Assert.assertEquals(BasePage.get().getCurrentUrl(),"https://www.facebook.com/");
    }

    @When("^I enter (.+) into (username|password) text fields on home screen$")
    public void enterDataUsernameAndPassField(String anyText ,String textFields){

        switch (textFields) {
            case "username":
                facebookLoginPage.enterEmail(anyText);
                break;
            case "password":
                facebookLoginPage.enterPassword(anyText);
                break;

        }
    }
    @And("^I click on login button on home screen$")
    public void clickOnButton(){

        facebookLoginPage.clickLoginButton();
    }
    @Then("^I verify that I am invalid login page$")
    public void verifyInvalidLogin(){
        facebookLoginPage.getErrorMessage();
        Assert.assertEquals(facebookLoginPage.getErrorMessage(), "Log Into Facebook");
    }
}
