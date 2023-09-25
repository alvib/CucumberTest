package steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import main.BrowserManagerBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class BaseSteps extends BrowserManagerBase {

    @Step("Нажать по: '{locator}'")
    public BaseSteps clickBy(By locator) {
        sleep(100);

        $(locator).shouldBe(visible).scrollIntoView("{block:\"center\"}").click();

        return this;
    }

    @Step("Ввести текст: '{text}' в поле: '{locator}'")
    public BaseSteps fillField(By locator, String text) {
        sleep(100);

        SelenideElement field = $(locator).shouldBe(visible).scrollIntoView("{block:\"center\"}");
        field.sendKeys(text);

        return this;
    }
}
