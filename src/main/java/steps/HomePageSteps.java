package steps;

import io.cucumber.java.ru.Когда;

import static pages.HomePage.*;

public class HomePageSteps extends BaseSteps {

    @Когда("Пользователь нажимает на кнопку поиска")
    public HomePageSteps clickSearchButton() {
        clickBy(searchButton);

        return this;
    }

    @Когда("Пользователь нажимает на кнопку аккаунта")
    public HomePageSteps clickAccButton() {
        clickBy(accountButton);

        return this;
    }

    @Когда("Нажимает на кнопку входа в аккаунт")
    public LoginSteps clickSignInButton() {
        clickBy(signInButton);

        return new LoginSteps();
    }

    @Когда("Нажимает на кнопку регистрации аккаунта")
    public CreateAccSteps clickSignUpButton() {
        clickBy(signUpButton);

        return new CreateAccSteps();
    }
}
