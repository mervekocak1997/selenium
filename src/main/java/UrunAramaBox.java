import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrunAramaBox extends AnaPage {

    By searchBoxLocator = By.id("twotabsearchtextbox");
    By submitButtonLocator = By.id("nav-search-submit-button");


    public UrunAramaBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchBoxLocator , text);
        click(submitButtonLocator);
    }
}
