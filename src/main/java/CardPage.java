import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CardPage extends BasePage {

    By productNameLocator = new By.ByClassName("m-basket__item");


    public CardPage(WebDriver driver) {
        super(driver);

    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0;
    }

    public List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }
}
