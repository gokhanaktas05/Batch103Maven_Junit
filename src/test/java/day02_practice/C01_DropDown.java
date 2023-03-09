package day02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.annotation.Target;
import java.time.Duration;
import java.util.List;

public class C01_DropDown {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test01() throws InterruptedException {
        // https://the-internet.herokuapp.com/dropdown adresine gidin.
        // Index kullanarak Option 1 seçin ve sectiginiz option'u yazdırın
        // Value kullanarak Option 2 seçin ve sectiginiz option'u yazdırın
        // Visible Text kullanarak Option 1 seçin ve sectiginiz option'u yazdırın
        // Tüm option'ları yazdırın
        // dropdown'daki optionlarin toplam sayısının 3'e esit oldugunu test edin
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(2000);
        // Index kullanarak Option 1 seçin ve sectiginiz option'u yazdırın
        WebElement down= driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select=new Select(down);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        // Value kullanarak Option 2 seçin ve sectiginiz option'u yazdırın
        WebElement down2= driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select2=new Select(down2);
        select2.selectByValue("2");
        System.out.println(select2.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        // Visible Text kullanarak Option 1 seçin ve sectiginiz option'u yazdırın
        WebElement down3= driver.findElement(By.xpath("//*[@id='dropdown']"));
        Select select3=new Select(down3);
        select3.selectByVisibleText("Option 1");
        System.out.println(select3.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        // Tüm option'ları yazdırın
       List<WebElement > tumOptions= select.getOptions();
       int sayac=1;
        for (WebElement w:tumOptions){
            //System.out.println(w.getText());
            System.out.println(sayac+ ". option"+ w.getText());
            sayac++;
            Thread.sleep(1000);
        }
        // dropdown'daki optionlarin toplam sayısının 3'e esit oldugunu test edin
        int actualsize=3;
        int expectedSize=tumOptions.size();
        Assert.assertEquals(actualsize,expectedSize);
    }

      @After
    public void tearDown(){
   driver.close();

    }
}
