package pl.mikolaj.selenium.automationpractice.testcases;

import org.junit.jupiter.api.Test;
import pl.mikolaj.selenium.automationpractice.pages.HomePage;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin() {
        HomePage homePage = new HomePage();
        homePage.clickSignInButton();
    }
}
