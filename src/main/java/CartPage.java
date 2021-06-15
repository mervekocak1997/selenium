import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends AnaPage {

    By productNameLocator = new By.ByCssSelector("a.a-link-normal span.a-size-medium ");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 2 ; //Seçilen ürün sepete eklenir ve Adet arttırılarak ürün adedinin en az 2 olduğu doğrulanır
    }

    private List<WebElement> getProducts(){
        return findAll(productNameLocator);
    }
}
