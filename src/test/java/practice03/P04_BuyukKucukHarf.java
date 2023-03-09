package practice03;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P04_BuyukKucukHarf extends TestBase {
        @Test
        public void name(){
        //google sayfasina gidelim
        driver.get("https://google.com");

        //Buyuk kucuk harf olucak sekilde "HeLlO" yazdiralim
            WebElement searhbox=  driver.findElement(By.xpath("//*[@class='gLFyf']"));
           searhbox  //farklı yöntem,action kullanmadan
                   .sendKeys(Keys.SHIFT,"h",Keys.SHIFT,"e",Keys.SHIFT,"L",Keys.SHIFT,"l",Keys.SHIFT,"O");
    }
}
