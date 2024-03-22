package pages;

import constants.Values;
import core.SeleniumDriverPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import properties.ConfigProvider;

public class SinglePage extends SeleniumDriverPage {
    @FindBy(xpath = "//input[@class='header-search__input']")
    private WebElement searchField;

    @FindBy(xpath = "//a[@class = 'header-cart sticky-header__controls-item']")
    private WebElement buttonBasket;

    @FindBy(xpath = "//article[@class='product-card product-card product'][1]//div[@class='button action-button blue'][1]")
    private WebElement buttonBuyBook;


    @FindBy(xpath = "//button[@class = 'button cart-sidebar__order-button blue']")
    private WebElement buttonCheckoutOrder;


    public SinglePage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public SinglePage addBookToBasket() {
        searchField.clear();
        searchField.sendKeys(Values.NAME_BOOK, Keys.ENTER);
        buttonBuyBook.click();
        buttonBasket.click();
        buttonCheckoutOrder.click();
        return new SinglePage();
    }
}