package Pages;

import Utils.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage extends BaseTools {
    WebDriver driver;
    @FindBy(xpath = "//span[contains(text(),'Se connecter')]")
    WebElement buttonSecon ;

    public HomePage(WebDriver driver) {
        this.driver = driver ;
         PageFactory.initElements(driver,this);
    }

    //public  void  HomePage ( WebDriver driver)
    //{
     //   this.driver = driver ;
      //  PageFactory.initElements(driver,this);
    //}

    public  String Gettile ()
    {
         String titre ;
         titre=driver.getTitle();
         System.out.println("titre :" + titre);
         return titre;
    }

    public boolean verfiverConnecter ()
    {
        verifierVisilite(driver,buttonSecon,"se connecter",true);
        return buttonSecon.isDisplayed();
    }

    public  void  cliquerSeConnecter ()
    {
        verifierVisilite(driver,buttonSecon,"se connecter",true);
        buttonSecon.click();
    }

}
