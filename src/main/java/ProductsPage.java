import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {

    By filterOptionLocator = By.id("productFilterOpenButton");
    By productNameLocator = new By.ByClassName("o-productList__item");
    By moreBoxButton = By.id("moreContentButton");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(filterOptionLocator);
    }

    public void selectProduct(int i){
        try {
            click(moreBoxButton);
            Thread.sleep(5000);
            getAllProducts().get(i).click();
        }
        catch (Exception e) {

        }
    }

    private List<WebElement> getAllProducts(){
        return findAll(productNameLocator);
    }
}
