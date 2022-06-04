package pl.mikolaj.selenium.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//input[@id='email_create']")
    private WebElement createAccEmailInput;

    @FindBy(xpath = "//button[@id='SubmitCreate']")
    private WebElement createAccButton;

    public SignInPage enterCreateAccEmail(String email) {
        createAccEmailInput.sendKeys(email);
        return this;
    }

    public CreateAccountPage submitCreateAccEmail() {
        createAccButton.click();
        return new CreateAccountPage();
    }
}
