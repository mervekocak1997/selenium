import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ikincitest extends AnaTest{


    HomePage homePage ;
    UrunlerPage productsPage ;
    UrunDetayPage productDetailPage ;
    CartPage cartPage ;

    @Test
    public void setName(){
        anapage.setName("merve");
        Assertions.assertEquals("merve",AnaPage.getName() , "ifadeler birbirimne eşit değil");
    }
    @Test
    public void setSifreName(){

        anapage.setSifreName("merve1234");
        Assertions.assertEquals("merve1234",AnaPage.getSifreName() , "ifadeler birbirimne eşit değil");

    }


    @Test
    @Order(1)
    public void search_a_product(){
        homePage = new HomePage(driver);
        productsPage = new UrunlerPage(driver);
        //homePage.acceptCookies();
        homePage.searchBox().search("Bilgisayar");//Arama kutucuğuna bilgisayar kelimesi girilir
        Assertions.assertTrue(productsPage.isOnProductPage() , "ürünler sayfasında ürün yok"); //ürün var mı yok mu yoksa bu mesaj gelecek
    }
    @Test
    @Order(2)
    public void select_a_product(){
        productDetailPage = new UrunDetayPage(driver);
        productsPage.selectProduct(3); // Sonuca göre sergilenen ürünlerden rastgele bir ürün (ben 3. ürünü seçtim )seçilir

        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(), "Ürün detay sayfasında yok");//2.sayfanın açıldığı kontrol edilir
    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        UrunDetayPage.addToCart();

        Assertions.assertTrue(homePage.isProductCountUp(), "Ürün sayısı artmadı");
    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();//Seçilen ürün sepete eklenir

        Assertions.assertTrue(cartPage.checkIfProductAdded() , "Ürün sepete eklenmedi"); //Seçilen ürün sepete eklendi mi kontrol edilir
    }


}

