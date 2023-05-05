package test_shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
*конструктор класса, занимающийся инициализацией полей покупки
*/
public class BuyPage {
    public WebDriver driver;

    public BuyPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки добавления в корзины
     */
    @FindBy(xpath = "//*[@class='buy-button goods-tile__buy-button ng-star-inserted'][1]")
    public WebElement addToBuy;

    /**
     * метод для нажатия кнопки добавления в корзину
     */
    public void clickAddToBuyBtn() {
        addToBuy.click();
    }
}
