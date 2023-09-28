package pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class Login {

    @Description("Поле для ввода email")
    public static final By email = By.xpath("//input[@name='username']");

    @Description("Поле для ввода пароля")
    public static final By password = By.xpath("//input[@name='password']");

    @Description("Кнопка для входа в аккаунт под email и паролем")
    public static final By loginButton = By.xpath("//button[@name='login']");

    @Description("Сообщение об ошибке при неправильном email/пароле")
    public static final By wrongEmailOrPasswordMessage = By.xpath("//h6[@class='alert-header alert-danger']");

    @Description("Ошибка о пустом поле email")
    public static final By noEmailMessage= By.xpath("//div[contains(@class, 'ember-view help-block qa-error')]");

    @Description("Кнопка выхода из аккаунта")
    public static final By signOutButton = By.xpath("//button[@class='btn btn-secondary    btn-sign-out']");

    @Description("Имя авторизованного пользователя сверху на боковой панели аккаунта")
    public static final By accountNameText = By.xpath("//h2[@class='modal-title']");

    @Description("Сообщение об ошибке при невалидном поле email")
    public static final By invalidEmail = By.xpath("//div[text()='Please enter a valid email address.']");

    @Description("Сообщение об ошибке при невалидном поле пароля")
    public static final By invalidPassword = By.xpath("//div[@data-label-code='error.account.login.passwordInvalid']");
}
