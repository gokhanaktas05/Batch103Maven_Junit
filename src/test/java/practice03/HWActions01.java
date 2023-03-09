package practice03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class HWActions01 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //https://demoqa.com/ url'ine gidin.
        driver.get("https://demoqa.com/");
        //Alerts, Frame & Windows Butonuna click yap
        WebElement kutu = driver.findElement(By.xpath("(//*[@class='card-up'])[6]"));
        //clickWithText("div.card-body>h5","Alerts, Frame & Windows");
        Actions actions=new Actions(driver);
        actions.moveToElement(kutu).perform();
        actions.sendKeys(kutu, Keys.PAGE_DOWN).perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//*[@class='card mt-4 top-card'])[3]")).click();
        //""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
        WebElement text = driver.findElement(By.xpath("//*[text()='Please select an item from left to start practice.']"));
        Assert.assertTrue(text.isDisplayed());
        //Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
        driver.findElement(By.xpath("//*[text()='Browser Windows']")).click();
        //New Tab butonunun görünür olduğunu doğrula
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='tabButton']")).isDisplayed());
        //New Tab butonuna click yap
      WebElement newTab=  driver.findElement(By.xpath("//*[@id='tabButton']"));
      newTab.click();
        //Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
        List<String>allWindows=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(allWindows.get(1));
        //İlk Tab'a geri dön
        driver.switchTo().window(allWindows.get(0));
        ////New Tab butonunun görünür olduğunu doğrula
        Assert.assertTrue(newTab.isDisplayed());

    }
}
