package pl.mikolaj.selenium.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement signInEmailInput;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement createAccountButton;

    public void enterSignInEmail(String email) {
        signInEmailInput.sendKeys(email);
    }

    public void submitSignInEmail() {
        createAccountButton.click();
    }
}