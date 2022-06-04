package pl.mikolaj.selenium.automationpractice.testcases;

import org.junit.jupiter.api.Test;
import pl.mikolaj.selenium.automationpractice.pages.CreateAccountPage;
import pl.mikolaj.selenium.automationpractice.pages.HomePage;
import pl.mikolaj.selenium.automationpractice.pages.SignInPage;

public class SignInTest extends BaseTest {

    @Test
    public void testSignIn() {
        HomePage homePage = new HomePage();
        homePage.clickSignInButton();

        SignInPage signInPage = new SignInPage();
        signInPage.enterSignInEmail("abc2@o2.pl");
        signInPage.submitSignInEmail();

        CreateAccountPage createAccountPage = new CreateAccountPage();
        createAccountPage.selectMrGenderRadioButton();
        createAccountPage.enterFirstName("Stefan");
        createAccountPage.enterLastName("Kowalski");
        createAccountPage.enterPassword("pass123");

    }
}
