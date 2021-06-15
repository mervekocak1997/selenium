import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AnaPage {

    static WebDriver driver ;
    private static final By kullaniciname1 = By.id("L-UserNameField");
    private final By sifre1 = By.id("L-PasswordField");


    public AnaPage(WebDriver driver){
        this.driver = driver ;
    }

    public void setName(String nameAsString){
        WebElement nameSpace = driver.findElement(kullaniciname1);
        nameSpace.click();
        nameSpace.sendKeys(nameAsString);
    }

    public void setSifreName (String sifrenameAsString){
        WebElement nameSpace = driver.findElement(sifre1);
        nameSpace.click();
        nameSpace.sendKeys(sifrenameAsString);
    }

    public static String getName(){
    WebElement nameSpace = driver.findElement(kullaniciname1);
    return nameSpace.getAttribute("value");
    }
    public static String getSifreName(){
        WebElement nameSpace = driver.findElement(kullaniciname1);
        return nameSpace.getAttribute("value");
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }

    public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

}
