package utils;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import main.BrowserManagerBase;
import steps.BaseSteps;

import static com.codeborne.selenide.Selenide.*;
import static pages.HomePage.acceptPrivacyButton;
import static pages.HomePage.cookiePopup;

public class Hooks extends BaseSteps {

    public static BrowserManagerBase browserManagerBase = new BrowserManagerBase();

    @Before (order = 1)
    public void openBrowser() {
        browserManagerBase.initDesktopDriver();

        Configuration.proxyEnabled = false;

        open("https://www.ae.com/us/en");
    }

    @Before (order = 2)
    public void acceptCookies() {

        if ($(acceptPrivacyButton).isDisplayed()) {
            clickBy(acceptPrivacyButton);
        }
    }

    @Before (order = 3)
    public void cookiesNotVisible() {
        $(cookiePopup).shouldNotBe(Condition.visible);
    }
}
