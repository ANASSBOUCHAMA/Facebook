package Test;

import Pages.*;
import Utils.*;
import org.testng.*;
import org.testng.annotations.*;

import static Utils.Setup.driver;

public class test1 {

     String Titre  = "Annonces au Maroc | Avito.ma";

     @Test
     public void Verofication ()
     {
         HomePage homePage = new HomePage(driver);
         Assert.assertEquals(homePage.Gettile(),Titre);

         Assert.assertTrue(homePage.verfiverConnecter());
     }
}
