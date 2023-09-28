package steps;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.openqa.selenium.support.ui.Select;
import utils.RandomUtils;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static pages.CreateAccPage.*;

public class CreateAccSteps extends BaseSteps {

    @Когда("Заполняет поле email")
    public CreateAccSteps fillRandomEmail() {
        String email = RandomUtils.generateRandomEmail("@gmail.com");

        fillField(emailField, email);

        return this;
    }

    @Когда("Заполняет поле имени {string}")
    public CreateAccSteps fillFirstName(String message) {
        fillField(firstNameField, message);

        return this;
    }

    @Когда("Заполняет поле фалимии {string}")
    public CreateAccSteps fillLastName(String message) {
        fillField(lastNameField, message);

        return this;
    }

    @Когда("Вводит пароль {string}")
    public CreateAccSteps fillPassword(String message) {
        fillField(passwordField, message);

        return this;
    }

    @Когда("Вводит такой же пароль {string}")
    public CreateAccSteps confirmPassword(String message) {
        fillField(confirmPasswordField, message);

        return this;
    }

    @Когда("Заполняет поле почтового индекса {string}")
    public CreateAccSteps fillZipCode(String message) {
        fillField(zipCodeField, message);

        return this;
    }

    @Когда("Выбирает месяц рождения {string}")
    public CreateAccSteps chooseMonthOfBirth(String message) {
        Select select = new Select($(monthOfBirthField));
        select.selectByValue(message);

        return this;
    }

    @Когда("Выбирает день рождения {string}")
    public CreateAccSteps chooseDayOfBirth(String message) {
        Select select = new Select($(dayOfBirthField));
        select.selectByValue(message);

        return this;
    }

    @Когда("Нажимает на чек-бокс о согласии с условиями пользования сайта")
    public CreateAccSteps clickTerms() {
        clickBy(acceptConditionsButton);

        return this;
    }

    @Когда("Нажимает на кнопку создания аккаунта")
    public CreateAccSteps clickCreateAccButton() {
        clickBy(createUserButton);

        return this;
    }

    @Тогда("Высвечивается имя аккаунта {string}")
    public CreateAccSteps showAccName(String expectedName) {
        $(accName).shouldHave(text(expectedName));

        return this;
    }
}
