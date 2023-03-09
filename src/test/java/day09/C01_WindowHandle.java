package day09;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C01_WindowHandle extends TestBase {
    @Test
    public void test01(){
        //        https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        String windowHandle= driver.getWindowHandle();
//        Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
      String actual=driver.findElement(By.xpath("//*[.='Opening a new window']")).getText();
      String expected="Opening a new window";
        Assert.assertEquals(expected,actual);
//        Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String actualtitle=driver.getTitle();
        String expectedTitle="The Internet";
        Assert.assertEquals(expectedTitle,actualtitle);
//        Click Here butonuna basın.
        driver.findElement(By.linkText("Click Here")).click();
//        Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.



    }

}
