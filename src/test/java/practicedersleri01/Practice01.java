package practicedersleri01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice01 {
 WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        //-bu web adresinin sayfa basligini(title) ve adres(url)ini yazdıralım
        String actualTitle= driver.getTitle();
        String actualUrl= driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);
        System.out.println("actualTitle = " + actualTitle);
        //-title ve url'nin "Spend" kelimesinin icerip icermedigini kontrol edelim
        Assert.assertFalse(actualTitle.contains("spend")&&actualUrl.contains("spend"));
        //-Ardindan "trendyol.com" adresine gidelim
        driver.get("https://www.trendyol.com");
        Thread.sleep(2000);
        //-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini kontrol edelim
        String baslik= driver.getTitle();
        Assert.assertTrue(baslik.contains("Sitesi"));
        //-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();
        Thread.sleep(2000);
        //-sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(2000);
        //-Daha sonra trendyol sayfamiza tekrar donelim ve sayfayi kapatalim
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.quit();// birden fazla sayfa calısmıssa quit kullanıkır
        }
    }

