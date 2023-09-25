package steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static pages.Login.*;

public class LoginSteps extends BaseSteps {

    @Когда("Заполняет поле email \"{word}\"")
    public LoginSteps inputEmail(String message) {
        fillField(email, message);

        return this;
    }

    @Когда("Заполняет поле пароля \"{word}\"")
    public LoginSteps inputPassword(String message) {
        fillField(password, message);

        return this;
    }

    @Когда("Нажимает на кнопку входа")
    public LoginSteps clickLoginButton() {
        clickBy(loginButton);

        return this;
    }

    @Тогда("Высвечивается сообщение об ошибке {string}")
    public LoginSteps verifyErrorEmailOrPasswordMessage(String expectedErrorMessage) {
        $(wrongEmailOrPasswordMessage).shouldHave(text(expectedErrorMessage));

        return this;
    }

    @Тогда("Высвечивается сообщение об отсутствии email {string}")
    public LoginSteps verifyErrorNoEmailMessage(String expectedErrorMessage) {
        $(noEmailMessage).shouldHave(text(expectedErrorMessage));

        return this;
    }

    @Тогда("Показывается кнопка выхода из аккаунта")
    public LoginSteps showSignOutButton() {
        $(signOutButton).shouldBe(visible, Duration.ofSeconds(15));

        return this;
    }

    @Тогда("Отображается имя пользователя {string}")
    public LoginSteps verifyAccName(String expectedName) {
        $(accountNameText).shouldHave(text(expectedName));

        return this;
    }
}
