package pl.mikolaj.selenium.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.mikolaj.selenium.config.WebDriverSingleton;
import pl.mikolaj.selenium.utils.Utils;

public class BasePage {

    @FindBy (id="columns")
    private WebElement pageContent;

    public BasePage() {
        PageFactory.initElements(WebDriverSingleton.getInstance(), this);
        Utils.waitForElement(pageContent);
    }
}
