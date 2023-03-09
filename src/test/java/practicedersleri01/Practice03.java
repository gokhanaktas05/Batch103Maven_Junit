package practicedersleri01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice03 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        //    Type any number in the first input
        //    Type any number in the second input
        driver.findElement(By.id("number1")).sendKeys("30", Keys.TAB,Keys.TAB,"30",Keys.TAB,Keys.ENTER);
        // Click on Calculate
        // Print the result
        WebElement sonuc= driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("sonuc.getText() = " + sonuc.getText());
        // close driver
       // driver.close();
    }
}
