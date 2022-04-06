import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    By addToCardButtonLocator = By.id("addBasket");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCardButtonLocator);
    }

    public void addToCard() {
        try {
            Thread.sleep(2000);
            click(addToCardButtonLocator);
        }
        catch (Exception e){

        }

    }
}
