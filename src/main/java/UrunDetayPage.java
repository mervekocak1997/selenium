import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrunDetayPage extends AnaPage {

    static By addToCartButtonLocator = By.id("add-to-cart-button");

    public UrunDetayPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToCartButtonLocator);
    }

    public static void addToCart() {
        //click(addToCartButtonLocator);
    }
}
