package pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class CreateAccPage {

    @Description("Поле для ввода email на странице регистрации")
    public static final By emailField = By.xpath("//input[@placeholder='Email']");

    @Description("Поле для ввода имени на странице регистрации")
    public static final By firstNameField = By.xpath("//input[@placeholder='First Name']");

    @Description("Поле для ввода фамилии на странице регистрации")
    public static final By lastNameField = By.xpath("//input[@placeholder='Last Name']");

    @Description("Поле для ввода пароля на странице регистрации")
    public static final By passwordField = By.xpath("//input[@placeholder='Password']");

    @Description("Поле для повторного ввода пароля на странице регистрации")
    public static final By confirmPasswordField = By.xpath("//input[@placeholder='Confirm Password']");

    @Description("Поле для ввода почт.индекса на странице регистрации")
    public static final By zipCodeField = By.xpath("//input[@placeholder='Zip Code']");

    @Description("Поле для выбора месяца рождения на странице регистрации")
    public static final By monthOfBirthField = By.xpath("//select[@name='month']");

    @Description("Поле для выбора дня рождения на странице регистрации")
    public static final By dayOfBirthField = By.xpath("//select[@name='day']");

    @Description("Кнопка подтверждения условий для регистрации пользователя")
    public static final By acceptConditionsButton = By.xpath("//label[@class = 'aeo-checkbox-label clickable']");

    @Description("Кнопка создания аккаунта на странице регистарции")
    public static final By createUserButton = By.xpath("//button[@name = 'register']");

    @Description("Показывается имя аккаунта после создания пользователя")
    public static final By accName = By.xpath("//div[contains(@class, 'text-bold qa-list-menu-header')]");
}