package test_shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * конструктор класса, занимающийся инициализацией полей главной страницы
 */
public class FirstCategoryPage {
    public WebDriver driver;

    public FirstCategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    /**
     * определение локатора кнопки категории
     */
    @FindBy(xpath = "/html/body/app-root/div/div/rz-main-page/div/aside/rz-main-page-sidebar/div[1]/rz-sidebar-fat-menu/div/ul/li[1]/a")
    public WebElement сategoryBtn;


    /**
     * метод для нажатия кнопки показа категории
     */
    public void clickCategoryBtn() {
        сategoryBtn.click();
    }
}
