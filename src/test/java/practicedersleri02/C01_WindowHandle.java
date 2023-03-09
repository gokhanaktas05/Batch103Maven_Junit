package practicedersleri02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.List;

public class C01_WindowHandle extends TestBase {
    @Test
    public void test01(){
        // 1- https://www.amazon.com sayfasına gidin
        driver.get("https://www.amazon.com");
        String ilkWindowHandle=driver.getWindowHandle();
        // 2- nutella icin arama yapın
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Nutella", Keys.ENTER);
        // 3- yeni bir tab'da ilk urunun resmine tıklayınız
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Nutella", Keys.ENTER);
        WebElement ilkUrun= driver.findElement(By.xpath("(//*[@class='s-image'])[1]"));
        ilkUrun.click();
        // 4- yeni tab'da acilan urunun basligini yazdirin
        String baslik= driver.getTitle();
        System.out.println("baslik = " + baslik);
        // 5- ilk sayfaya gecip url'i yazdırın
        driver.switchTo().window(ilkWindowHandle);
        String url=driver.getCurrentUrl();
        System.out.println("url = " + url);

    }
}
