package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.ru.Дано;
import main.BrowserManagerBase;

import static com.codeborne.selenide.Selenide.open;

public class OpenPageSteps {

    public static BrowserManagerBase browserManager = new BrowserManagerBase();

    @Дано("Пользователь открывает главную страницу")
    public OpenPageSteps openPage() {
        browserManager.initDesktopDriver();
        Configuration.proxyEnabled = false;
        open("https://www.ae.com/us/en");

        return this;
    }
}
