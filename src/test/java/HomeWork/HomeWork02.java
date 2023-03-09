package HomeWork;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class HomeWork02 extends TestBase {
    @Test
    public void test01() throws InterruptedException {

//    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");

//        - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
//        - Çizimden sonra clear butonuna basalım
//        - Son olarak sayfayı temizleyiniz
        driver.get("http://szimek.github.io/signature_pad/");
        WebElement yaziTahtasi = driver.findElement(By.xpath("//canvas"));
        Actions actions = new Actions(driver);
        actions.moveToElement(yaziTahtasi).clickAndHold();
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5, 5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(0, 5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5, 0);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(0, -5);
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(5, -5);
        }

        actions.release().build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[text()='Clear']")).click();
    }
}
