package Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import java.util.concurrent.*;
public class Setup {
     public String  baseur= "https://www.avito.ma/";
     String driverPath = "C:\\Users\\aboucham\\Desktop\\testing\\chromedriver.exe";
    public static WebDriver driver;
     @AfterMethod
     public  void closebaseur ()
     {
        driver.close();
     }
     public  void launchBrowser()
     {
         System.out.println("launching Chrome browser");
         System.setProperty("webdriver.chrome.driver", driverPath);
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(baseur);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     }
    @BeforeTest
    public void lanchSuite() {
        System.out.println("Before suite");
    }
    @AfterTest
    public void FinSuite() {
        System.out.println("after suite");
    }
}
