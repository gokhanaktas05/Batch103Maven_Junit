package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class P05_Actions extends TestBase {
    @Test
    public void test01(){

//        -http://spicejet.com/ sayfasına gidelim
        driver.get("http://spicejet.com/");
//        -Sayfanın altındaki about us bölümü altındaki fleet linkine tıklayalım
        Actions actions=new Actions(driver);
      WebElement link= driver.findElement(By.linkText("Fleet"));
      actions.moveToElement(link).perform();
      link.click();
//       -Sayfa başlığının Fleet içerdiğini test edelim
        String baslik = driver.findElement(By.xpath("(//*[.='Fleet'])[3]")).getText();
        Assert.assertTrue(baslik.contains("Fleet"));

    }
}
