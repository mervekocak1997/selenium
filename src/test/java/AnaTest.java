import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)//random göstermemesi için
//@ExtendWith(TestSonucları.class)
public class AnaTest {
     protected  WebDriver driver;
    AnaPage anapage;

    @BeforeAll
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com/"); //www.gittigidiyor.com sitesi açılır
        driver.manage().window().maximize();
        anapage = new AnaPage(driver);

    }


}