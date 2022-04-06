import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage {

    SearchBox searchBox;
    By cardCountLocator = new By.ByClassName("o-header__userInfo--count");
    By cardButtonLocator = By.xpath("/html/body/header/div/div/div[3]/div/a[3]");
    By removeProduct = By.id("removeCartItemBtn0-key-0");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return isDisplayed(cardCountLocator);
    }

    public void goToCard() {
        try {
            click(cardButtonLocator);
            Select select = new Select (driver.findElement(By.id("quantitySelect0-key-0")));
            Thread.sleep(3000);
            select.selectByIndex(1);
            Thread.sleep(5000);
            click(removeProduct);
            Thread.sleep(2500);
        }
        catch(Exception e){

        }
    }
}
