package tekrarpackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Practice04 extends TestBase {
    @Test
    public void test() throws InterruptedException {
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //iphone aratalım
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone"+ Keys.ENTER);
        //Çıkan ürünlerde sadece Apple iPhone yazanları tıklayalım
        List<WebElement>apple=driver.findElements(By.partialLinkText("Apple Iphone"));
        for (int i = 0; i <apple.size() ; i++) {
            apple=driver.findElements(By.partialLinkText("Apple Iphone"));
            apple.get(i).click();
            driver.navigate().back();
        }
        //TEXT İÇİNDE APPLE IPHONE YAZISI GEÇENLERİ ALICAK


    }
}
