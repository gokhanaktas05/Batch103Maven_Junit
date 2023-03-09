package practicedersleri01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P08 {
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
}
@Test
    public void test01(){
    // 2- https://www.google.com/ adresine gidin
    driver.get("https://www.google.com/");
    //        3- cookies uyarisini kabul ederek kapatin
    //        4 Sayfa basliginin “Google” ifadesi icerdigini test edin
                String baslik= driver.getTitle();
                Assert.assertTrue(baslik.contains("Google"));
                //Arama cubuguna “Nutella” yazip aratin
                driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("Nutella",Keys.ENTER);
    //        6 Bulunan sonuc sayisini yazdirin.
    String sonuc[]= driver.findElement(By.xpath("//*[@id='result-stats']")).getText().split(" ");
   String sonucSays=sonuc[1];
    System.out.println("sonucSays = " + sonucSays);

    //        7 sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
            sonucSays=sonucSays.replaceAll("\\D","");
            int sonuc2=10000000;
            Assert.assertTrue(Integer.parseInt(sonucSays)>sonuc2);
            driver.close();
}
}
