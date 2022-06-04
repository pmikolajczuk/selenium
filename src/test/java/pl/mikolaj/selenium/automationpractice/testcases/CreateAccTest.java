package pl.mikolaj.selenium.automationpractice.testcases;

import org.junit.jupiter.api.Test;
import pl.mikolaj.selenium.automationpractice.pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateAccTest extends BaseTest {

    @Test
    public void testCreateAccFailure() {
        assertTrue(
                new HomePage()
                    .clickSignInButton()
                    .enterCreateAccEmail("abc2@o2.pl")
                    .submitCreateAccEmail()
                    .enterFirstName("Stefan")
                    .enterLastName("Kowalski")
                    .enterPassword("pass123")
                    .pressRegisterButton()
                    .isRegistrationErrorMessage()
        );

    }
}
