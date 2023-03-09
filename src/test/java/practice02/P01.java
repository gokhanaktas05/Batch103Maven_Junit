package practice02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
public class P01 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //    go to url :http://demo.automationtesting.in/Alerts.html
       driver.get("http://demo.automationtesting.in/Alerts.html");
        //    click  "Alert with OK" and click 'click the button to display an alert box:'
      WebElement alert=  driver.findElement(By.xpath("//*[@onclick='alertbox()']"));
      alert.click();
      Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        //    accept Alert(I am an alert box!) and print alert on console
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
        driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
        Thread.sleep(2000);
        //    cancel Alert  (Press a Button !)
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
        driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@onclick='promptbox()']")).click();
        Thread.sleep(2000);
        //    and then sendKeys 'TechProEducation' (Please enter your name)
        driver.switchTo().alert().sendKeys("gokhan");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        //    finally print on console this message "Hello TechProEducation How are you today"
        System.out.println(driver.findElement(By.xpath("//*[@id='demo1']")).getText());
        //    aseertion these message
        Assert.assertNotEquals("Hello TechProEducation How are you today",driver.findElement(By.xpath("//*[@id='demo1']")).getText());
    }
}
