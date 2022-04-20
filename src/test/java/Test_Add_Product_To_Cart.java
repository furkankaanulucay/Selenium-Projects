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

        try{
            homePage = new HomePage(driver);
            productsPage = new ProductsPage(driver);
            homePage.searchBox().search("termos");
            Thread.sleep(3000);
            Assertions.assertTrue(productsPage.isOnProductPage(), "Not on products page!");
        }
        catch (Exception e){}


    }

    @Test
    @Order(2)
    public void selectProduct(){
        try {
            productDetailPage = new ProductDetailPage(driver);
            productsPage.selectProduct(32);
            Thread.sleep(3000);
            Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Not on a product detail page!");
        }
        catch (Exception e) {}

    }

    @Test
    @Order(3)
    public void addProductToCard(){
        try {
            productDetailPage.addToCard();
            Thread.sleep(3000);
            Assertions.assertTrue(homePage.isProductCountUp(), "Product count did not increase!");
        }
        catch (Exception e) {}
    }

    @Test
    @Order(4)
    public void goToCard(){
        try {
            cardPage = new CardPage(driver);
            homePage.goToCard();
            Assertions.assertTrue(cardPage.checkIfProductDeleted(), "Product was not deleted to card!");
        }
        catch(Exception e){}
    }
}
