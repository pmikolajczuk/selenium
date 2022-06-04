package pl.mikolaj.selenium.automationpractice.testcases;

import org.junit.jupiter.api.Test;
import pl.mikolaj.selenium.automationpractice.pages.CreateAccountPage;
import pl.mikolaj.selenium.automationpractice.pages.HomePage;
import pl.mikolaj.selenium.automationpractice.pages.SignInPage;

public class SignInTest extends BaseTest {

    @Test
    public void testSignIn() {
        new HomePage()
                .clickSignInButton()
                .enterSignInEmail("abc2@o2.pl")
                .submitSignInEmail()
                .enterFirstName("Stefan")
                .enterLastName("Kowalski")
                .enterPassword("pass123");
    }
}
