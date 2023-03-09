package practice002;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class P01 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");
        //Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonWindow= driver.getWindowHandle();
        Thread.sleep(2000);
        //Sayfa title’nin “Amazon” icerdigini test edin
        String title=driver.getTitle();
        Assert.assertTrue(title.contains("Amazon"));
        //Yeni bir tab olusturup, acilan tab’da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://techproeducation.com");
        //Sayfa title’nin “TECHPROEDUCATION” icerip içermediğini test edin
        String titleTech=driver.getTitle();
        Assert.assertFalse(titleTech.contains("TECHPROEDUCATION"));
        //Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        driver.get("https://walmart.com");
        Thread.sleep(2000);
        //Sayfa title’nin “Walmart” icerip içermediğini test edin
        String tittlewalm=driver.getTitle();
        Assert.assertTrue(tittlewalm.contains("Walmart"));
        Thread.sleep(2000);
        //Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin
        driver.switchTo().window(amazonWindow);
        String amzonUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";
        Assert.assertEquals(expectedUrl,amzonUrl);



    }

}
