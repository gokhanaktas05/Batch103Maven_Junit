package practicedersleri01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Practice02 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
            //fill the firstname
        WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
        firstname.sendKeys("Gokhan", Keys.TAB,"Aktas",Keys.TAB,Keys.SPACE
                ,Keys.TAB,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.SPACE,
        Keys.TAB,"16/08/1986",Keys.TAB,Keys.TAB,Keys.SPACE
                ,Keys.TAB,Keys.TAB,Keys.TAB,Keys.SPACE,Keys.TAB,"Africa",Keys.TAB
                ,Keys.LEFT_CONTROL,Keys.SPACE,Keys.ARROW_RIGHT,Keys.SPACE
                ,Keys.ARROW_RIGHT,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
            //fill the lastname

            //check the gender
            //check the experience
            //fill the date
            //choose your profession -> Automation Tester
            //choose your tool -> Selenium Webdriver
            //choose your continent -> Antartica
            //choose your command  -> Browser Commands
            //click submit button
    }

}
