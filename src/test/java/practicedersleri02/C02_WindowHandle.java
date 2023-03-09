package practicedersleri02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C02_WindowHandle extends TestBase {
    @Test
    public void test2() throws InterruptedException {
        // ...Exercise 2...
        // 1- https://www.amazon.com sayfasina gidelim
        driver.get("https://www.amazon.com");
        String ilkWindowHandle= driver.getWindowHandle();
        // 2- url'in 'amazon' icerdigini test edelim
        String amazonUrl= driver.getCurrentUrl();
        Assert.assertTrue(amazonUrl.contains("amazon"));
        // 3- yeni bir pencere acip https://www.bestbuy.com sayfasina gidelim
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String secondWindowHandle=driver.getWindowHandle();
        // 4- title'in 'Best Buy' icerdigini test edelim
        String secondWindowTittle=driver.getTitle();
        Assert.assertTrue(secondWindowTittle.contains("Best Buy"));
        // 5- ilk sayfaya(amazon) donup sayfada java aratalım
        driver.switchTo().window(ilkWindowHandle);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("java"+ Keys.ENTER);
        // 6- arama sonuclarının 'Java' icerdigini test edelim
        Thread.sleep(3000);
        WebElement aramaSonucu=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String aramaSonucuStr=aramaSonucu.getText();
        Assert.assertTrue(aramaSonucuStr.contains("Java"));
        // 7- ikinci sayfaya(bestbuy) donelim
        driver.switchTo().window(secondWindowHandle);
        // 8- logonun gorundugunu test edelim
        WebElement logo=driver.findElement(By.xpath("(//img[@class='logo'])[1]"));
        Assert.assertTrue(logo.isDisplayed());

    }
}
