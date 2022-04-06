import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CardPage cardPage;



    @Test
    @Order(1)
    public void searchProduct(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        homePage.searchBox().search("termos");
        Assertions.assertTrue(productsPage.isOnProductPage(), "Not on products page!");

    }

    @Test
    @Order(2)
    public void selectProduct(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(32);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on a product detail page!");
    }

    @Test
    @Order(3)
    public void addProductToCard(){
        productDetailPage.addToCard();
        Assertions.assertTrue(homePage.isProductCountUp(), "Product count did not increase!");
    }

    @Test
    @Order(4)
    public void goToCard(){
        cardPage = new CardPage(driver);
        homePage.goToCard();
        Assertions.assertTrue(cardPage.checkIfProductAdded(), "Product was not added to card!");
    }
}
