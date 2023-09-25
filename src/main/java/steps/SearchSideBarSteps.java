package steps;

import io.cucumber.java.ru.Когда;

import static pages.SearchSideBar.searchField;
import static pages.SearchSideBar.searchSideBarButton;

public class SearchSideBarSteps extends BaseSteps {

    @Когда("Пользователь вводит в поле поиска артикул \"{word}\"")
    public SearchSideBarSteps inputSearchField(String text) {
        fillField(searchField, text);

        return this;
    }

    @Когда("Нажимает на кнопку поиска")
    public SearchSideBarSteps clickSearchSideButton() {
        clickBy(searchSideBarButton);

        return this;
    }
}
