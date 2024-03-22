package tests;

import core.SeleniumDriver;
import org.junit.Test;
import pages.SinglePage;

public class CheckBookInBasketTest extends SeleniumDriver {
    @Test
    public void addToBasketBookTest() {
        SinglePage singlePage = new SinglePage();
        singlePage.addBookToBasket();
    }
}
