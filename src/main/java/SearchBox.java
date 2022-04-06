import org.openqa.selenium.*;


public class SearchBox extends BasePage{

    By searchBoxLocator = By.xpath("/html/body/header/div/div/div[2]/div/div/div/input");
    By searchBoxButton = new By.ByClassName("o-header__search--btn");

    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text){
        type(searchBoxLocator, text);
        click(searchBoxButton);

    }
}
