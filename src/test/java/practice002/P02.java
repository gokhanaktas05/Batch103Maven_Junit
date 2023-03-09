package practice002;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class P02 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //- https://html.com/tags/iframe/ adresine gidiniz
        driver.get("https://html.com/tags/iframe/");
        String ilkWindow=driver.getWindowHandle();
        //- youtube videosunu çalıştırınız
        WebElement iframe = driver.findElement(By.cssSelector("iframe[frameborder='0']"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.cssSelector("button[aria-label='Oynat']")).click();
        Thread.sleep(3000);

        //- üç saniye çalıştıktan sonra sayfayı yenileyiniz
        driver.navigate().refresh();

        //- yeni sekmede amazon adresine gidiniz
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");
        String amaznHandle=driver.getWindowHandle();
        //- iphone aratınız
       driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Iphone", Keys.ENTER);

        //- arama sonucu olarak sadece sonuc sayısını yazdırınız
       String []sonuc= driver.findElement(By.xpath("//*[text()='1-16 of 147 results for']")).getText().split(" ");
        System.out.println(sonuc[2]);
        //- ilk sekmeye geri dönüp url'ini konsola yazdıralım
        driver.switchTo().window(ilkWindow);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        //- amazon sayfasını kapatalım
        driver.switchTo().window(ilkWindow).close();
        //- Sonra diğer sekmeyide kapatalım
        driver.switchTo().window(amaznHandle).close();
        //TestBase'deki @After notasyonu çalışacak
    }
}
