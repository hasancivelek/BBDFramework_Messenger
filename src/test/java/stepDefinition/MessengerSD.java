package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import runnerTest.webPage.MessengerPage;
import utils.BasePage;

public class MessengerSD {

    private MessengerPage messengerPage= new MessengerPage();

    @Given("^I am on messenger page$")
    public void setMessengerPage(){
        messengerPage.clickOnMessengerLink();
        Assert.assertEquals(BasePage.get().getCurrentUrl(), "https://www.messenger.com/");
    }
    @When("^I enter (.+) into (username|password) field on the messenger page$")
    public void enterDataIntoTextField(String value,String textFiled){
        switch (textFiled){
            case "username":
                messengerPage.enterEmail(value);
                break;
            case"password":
                messengerPage.enterPassword(value);

        }

    }
    @And("^I click on login button on messenger page$")
    public void clickOnLoginButton(){
        messengerPage.clickSignInButton();
    }
    @Then("^I verify invalid login message on sign in page$")
    public void verifySignInErrorMessage(){
        Assert.assertEquals(messengerPage.getErrorMessage(),"Incorrect Email");
    }
}
