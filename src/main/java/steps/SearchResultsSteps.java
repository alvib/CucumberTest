package steps;

import com.codeborne.selenide.CollectionCondition;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Selenide.$$;
import static pages.SearchResultsPage.errorResultMessage;
import static pages.SearchResultsPage.resultOfSearchList;

public class SearchResultsSteps extends BaseSteps {

    @Тогда("Открывается страница поиска с {int}-ю элементами")
    public SearchResultsSteps verifyNumberOfProductIsDisplayed (int numProducts) {
        $$(resultOfSearchList).shouldHave(CollectionCondition.size(numProducts));

        return this;
    }

    @Тогда("Показывается сообщение об отсутствии товара")
    public SearchResultsSteps showErrorResultMessage() {
        $$(errorResultMessage).shouldHave(CollectionCondition.texts("Sorry! We couldn't find a match for"));

        return this;
    }
}
