package steps;

import com.codeborne.selenide.Condition;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.$;
import static pages.HomePage.*;

public class HomePageSteps extends BaseSteps {

    @Когда("Пользователь принимает куки")
    public HomePageSteps acceptCookies() {
        clickBy(acceptPrivacyButton);

        return this;
    }

    @Тогда("Куки-попап более не отображается")
    public HomePageSteps cookiePopupInvisible() {
        $(cookiePopup).shouldNotBe(Condition.visible);

        return this;
    }

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
}
