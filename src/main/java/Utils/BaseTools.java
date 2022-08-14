package Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class BaseTools {
    static  int time=  90;
    public  void  verifierVisilite (WebDriver driver , WebElement element , String Name , Boolean logIfTrue)
    {
        String MessageTrue , MessageFalse;
        MessageTrue= "Element"+ element +" visible";
        MessageFalse="Element"+ element +"absent ou invisible";
        WebDriverWait wait =new WebDriverWait(driver,time);
        wait.withMessage(MessageFalse);
        try {
        wait.until(ExpectedConditions.visibilityOf(element));
        if (logIfTrue == true) {
            System.out.println(MessageTrue);
        }
          } catch (TimeoutException t) {
        System.out.println(MessageFalse);
        System.out.println(element.toString());
        throw new NoSuchElementException(MessageFalse);
    }
}
}
