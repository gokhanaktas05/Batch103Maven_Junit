package tekrarpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(1000);
        // Under the  ORIGINAL CONTENTS click on Alerts
        driver.findElement(By.xpath("//*[@id='alerts']")).click();
        Thread.sleep(1000);
        // print the URL
        System.out.println(driver.getCurrentUrl());
        // navigate back
        driver.navigate().back();
        Thread.sleep(1000);
        // print the URL
        System.out.println(driver.getCurrentUrl());
        // Click on Basic Ajax
        driver.findElement(By.xpath("//*[@id='basicajax']")).click();
        Thread.sleep(1000);
        // print the URL
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        // enter value-> 20 and Enter
        driver.findElement(By.xpath("//*[@id='lteq30']")).sendKeys("20", Keys.ENTER);
        // and then verify Submitted Values is displayed open page

        // close driver

    }
}