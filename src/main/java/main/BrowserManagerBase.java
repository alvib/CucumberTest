package main;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;

public class BrowserManagerBase {

    public void initDesktopDriver() {
        initDriver();
    }

    private void initDriver() {
        Configuration.pageLoadTimeout = 90000;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;

        Configuration.timeout = 15000;
        Configuration.browserSize = "1200x800";
    }
}
