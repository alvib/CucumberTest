package pages;

import jdk.jfr.Description;
import org.openqa.selenium.By;

public class SearchSideBar {

    @Description("Поле для ввода артикула с целью поиска товара")
    public static final By searchField = By.xpath("//input[contains(@class, 'form-control form-input-search')]");

    @Description("Кнопка поиска введенного в поле артикула")
    public static final By searchSideBarButton = By.xpath("//button[@class='btn-link    btn search-btn']");
}
