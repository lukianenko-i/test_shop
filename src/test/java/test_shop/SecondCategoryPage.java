package test_shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * конструктор класса, занимающийся инициализацией полей каталога
 **/
public class SecondCategoryPage {

    public WebDriver driver;

    public SecondCategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки каталога
     */
    @FindBy(xpath =  "/html/body/app-root/div/div/rz-super-portal/div/main/section/div[2]/rz-dynamic-widgets/rz-widget-list[1]/section/ul/li[1]/rz-list-tile/div/a[2]")
    public WebElement wareBtn;

    /**
     * метод для нажатия кнопки показа товаров
     */
    public void clickWareBtn() {
        wareBtn.click();
    }

}
