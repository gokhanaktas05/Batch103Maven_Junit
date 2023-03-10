package practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class P04 extends TestBase {

    @Test
    public void test01(){

  // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
  // ikinci emojiye tıklayın
      WebElement iframe= driver.findElement(By.xpath("//*[@id='emoojis']"));
      driver.switchTo().frame(iframe);
      driver.findElement(By.xpath("(//*[@data-upgraded=',MaterialRipple'])[2]")).click();
  // tüm ikinci emoji öğelerini tıklayın
       List<WebElement> emojiler= driver.findElements(By.xpath("//*[@id='nature']//img"));
       emojiler.forEach(t->t.click());
  // parent iframe e geri donun
        driver.navigate().refresh();
  // formu doldurun,(Formu istediğiniz metinlerle doldurun)
  //  apply button a basin

    }
}
