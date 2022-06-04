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

    public void selectMrGenderRadioButton() {
        mrGenderRadioButton.click();
    }

    public void enterFirstName(String firstName) {
        this.firstName.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        this.lastName.sendKeys(lastName);
    }

    public void enterPassword(String password) {
        this.password.sendKeys(password);
    }
}
