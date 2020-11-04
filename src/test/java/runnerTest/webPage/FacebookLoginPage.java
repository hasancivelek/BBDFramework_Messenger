package runnerTest.webPage;

import org.openqa.selenium.By;

public class FacebookLoginPage extends ElementUtil{

    private By emailTextField = By.id("email");
    private By passwordTextField = By.id("pass");
    private  By loginButton= By.id("u_0_b");
    private  By getError=By.xpath("//div[contains(text(),'Log Into Facebook')]");

    public  void enterEmail(String enterEmail){
        sendValue(emailTextField,enterEmail);
    }

    public void enterPassword(String enterPassword){
        sendValue(passwordTextField,enterPassword);
    }
   public void clickLoginButton(){
        clickOn(loginButton);
}
    public String getErrorMessage(){

        return getTextFromElement(getError);
    }

}
