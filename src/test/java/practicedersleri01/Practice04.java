package practicedersleri01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practice04 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        // Add Element butonuna 100 defa basınız

         WebElement addButton= driver.findElement(By.xpath("//*[text()='Add Element']"));
        for (int i = 0; i <100 ; i++) {
            addButton.click();
        }
        // 100 defa basıldığını test ediniz
       List< WebElement> clictList=driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        Assert.assertEquals(100,clictList.size());
        // 90 defa delete butonuna basınız
        for (int i = 0; i <90 ; i++) {
        WebElement deletebutton=driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
            deletebutton.click();
        }
        // 90 defa basıldığını doğrulayınız
        List<WebElement>kalanList=driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
       int kalanlar=clictList.size()-90;
       Assert.assertEquals(kalanlar,kalanList.size());
        // Sayfayı kapatınız
        driver.close();
    }
}
