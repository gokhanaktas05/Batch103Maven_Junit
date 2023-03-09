package day07instruction;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C04_PromptAlert extends TestBase {

    @Test
    public void sendkeysMethod() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        //    3. butona tıklayın,
        driver.findElement(By.xpath("//*[@onclick='jsPrompt()']")).click();
        Thread.sleep(2000);
//    uyarıdaki metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("Gokhan");
        Thread.sleep(2000);
//    OK butonuna tıklayın
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
//    ve result mesajında isminizin görüntülendiğini doğrulayın.
        String actualresult=driver.findElement(By.id("result")).getText();
        String expectedresult="Gokhan";
        Assert.assertTrue(actualresult.contains(expectedresult));

    }
}
