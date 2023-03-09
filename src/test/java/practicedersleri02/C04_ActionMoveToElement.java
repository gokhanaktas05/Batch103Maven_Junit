package practicedersleri02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_ActionMoveToElement extends TestBase {
    @Test
    public void test03(){

        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");
        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        Actions actions=new Actions(driver);
        WebElement dil= driver.findElement(By.xpath("//div[text()='EN']"));
        actions.moveToElement(dil).perform();
        // Change country/region butonuna basiniz
        WebElement country=driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]"));

        // United States dropdown'undan 'Turkey (Türkiye)' seciniz
        // Go to website butonuna tiklayiniz
        // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz
    }
}
