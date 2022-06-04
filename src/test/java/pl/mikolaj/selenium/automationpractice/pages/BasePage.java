package pl.mikolaj.selenium.automationpractice.pages;

import org.openqa.selenium.support.PageFactory;
import pl.mikolaj.selenium.automationpractice.config.WebDriverSingleton;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(WebDriverSingleton.getInstance(), this);

    }
}
