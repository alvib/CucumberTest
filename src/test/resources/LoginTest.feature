# language: ru
@all

Функция: Работа со страницей логина

  @negative
  Структура сценария: Авторизация при невалидных email и пароле
    Когда Пользователь нажимает на кнопку аккаунта
    И Нажимает на кнопку входа в аккаунт
    И Заполняет поле email "<Email>"
    И Заполняет поле пароля "<Password>"
    И Нажимает на кнопку входа
    Тогда Высвечивается сообщение об ошибке "Hold up, there's a problem."
    И Высвечивается сообщение о невалидном email "Please enter a valid email address."
    И Высвечивается сообщение о невалидном пароле "Please enter a password that contains 8-25 characters with at least one letter and one number."

    Примеры:
      | Email       | Password     |
      | sesuh@s4d.t | kjiwyserfght |
      | pos345d@843 | 325645334    |
      | f@rrr       | 123456q      |