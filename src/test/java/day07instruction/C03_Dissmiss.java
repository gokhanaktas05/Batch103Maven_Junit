package day07instruction;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C03_Dissmiss extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın
        // ve result mesajının "You clicked: Cancel" oldugunu test edin.
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
//        2. butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
//        uyarıdaki Cancel butonuna tıklayın
        driver.switchTo().alert().dismiss();//CANCEL secenegine tikliyoruz
//        ve result mesajının “You clicked: Cancel” oldugunu test edin.

    }
}

