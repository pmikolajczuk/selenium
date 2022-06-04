package pl.mikolaj.selenium.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

    @FindBy(xpath = "//input[@id='id_gender1']")
    private WebElement mrGenderRadioButton;

    @FindBy(id = "customer_firstname")
    private WebElement firstName;

    @FindBy(id = "customer_lastname")
    private WebElement lastName;

    @FindBy(id = "passwd")
    private WebElement password;

    public CreateAccountPage selectMrGenderRadioButton() {
        mrGenderRadioButton.click();
        return this;
    }

    public CreateAccountPage enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public CreateAccountPage enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public CreateAccountPage enterPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }
}
