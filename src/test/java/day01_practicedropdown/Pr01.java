package day01_practicedropdown;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Pr01 {

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() {
//

        driver.get("https://www.google.com/");
//       cookies uyarisini kabul ederek kapatin
//       Sayfa basliginin “Google” ifadesi icerdigini test edin
       String baslik= driver.getTitle();
        Assert.assertTrue(baslik.contains("Google"));
//       Arama cubuguna “Nutella” yazip aratin
       driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Nutella", Keys.ENTER);
//       Bulunan sonuc sayisini yazdirin
       String[]sonuc = driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
       String sonuc2=sonuc[1];
        System.out.println("sonuc2 = " + sonuc2);
//       sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
//       Sayfayi kapatin



    }
}