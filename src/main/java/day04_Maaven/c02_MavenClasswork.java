package day04_Maaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c02_MavenClasswork {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//       //1. http://zero.webappsecurity.com sayfasina gidin
       driver.get("http://zero.webappsecurity.com");
////2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@class='icon-signin']")).click();
        Thread.sleep(2000);
////3. Login alanine  "username" yazdirin
        WebElement login= driver.findElement(By.xpath("//*[@id='user_login']"));
        login.sendKeys("username");
        Thread.sleep(2000);
     //4. Password alanine "password" yazdirin
    WebElement password= driver.findElement(By.xpath("//*[@id='user_password']"));
        password.sendKeys("password");
        Thread.sleep(2000);
////5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        driver.navigate().back();
        Thread.sleep(2000);
////6. Online Banking menusunden Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[text()='Online Banking']")).click();
       driver.findElement(By.xpath("//*[@id='pay_bills_link']")).click();
        Thread.sleep(2000);
////7. amount kismina yatirmak istediginiz herhangi bir miktari yazin7
        driver.findElement(By.xpath("//*[@id='sp_amount']")).sendKeys("50");
        Thread.sleep(2000);
////8. tarih kismina "2020-09-10" yazdirin
        driver.findElement(By.xpath("//*[@id='sp_date']")).sendKeys("2020-09-10");
        Thread.sleep(2000);
////9. Pay buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='pay_saved_payees']")).click();
////10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
       WebElement actualSonuc=driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']"));
        String expectedSonuc="The payment was successfully submitted.";
        if (actualSonuc.getText().equals(expectedSonuc)){
            System.out.println("Test Passed");
        }else System.out.println("Test FAİLED");
        driver.close();


    }
}
