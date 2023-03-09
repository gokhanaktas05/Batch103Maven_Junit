package day07instruction;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C05_Iframe extends TestBase {


@Test
public void test01(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

//            Iframe nedir?
//        https://testcenter.techproeducation.com/index.php?page=iframe
   driver.findElement(By.xpath("//p[.='An iframe with a thin black border:']")).getText();

//        Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin oldugunu test edelim
        String anaMetin = driver.findElement(By.xpath("//p[.='An iframe with a thin black border:']")).getText();
//        //tag[.='metin']; Bana bu tagli metni ver
        //tag[text()='metin'];
        String expectedText="black border";
        Assert.assertTrue(anaMetin.contains(expectedText));
//        Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        driver.switchTo().frame(0);//index 0 dan baslar. ilk iframe e switch yapiyoruz

        String icMetin = driver.findElement(By.xpath("//*[.='Applications lists']")).getText();
        String expectedText1="Applications lists";
        Assert.assertEquals(expectedText1,icMetin);
//        Alternatif olarak altdaki secenekler de kullanilabilir
//        Assert.assertTrue(expectedText1.contains(icMetin));
//        Assert.assertTrue(driver.findElement(By.xpath("//*[.='Applications lists']")).isDisplayed());
//        Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
        driver.switchTo().defaultContent();
        String footerText = driver.findElement(By.xpath("(//footer[@class='blog-footer'][1])//p")).getText();
        System.out.println(footerText);
        Assert.assertTrue(footerText.contains("Povered By"));
}
}