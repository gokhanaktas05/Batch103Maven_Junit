package tekrarpackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

public class Practice03 extends TestBase {
    @Test
    public void test(){

//     -https://jqueryui.com/slider/#colorpicker adrese gidiniz
        driver.get("https://jqueryui.com/slider/#colorpicker");
//     -Kutucuk içindeki rengi önce kırmızı sonra sarı yapınız
        WebElement frame=driver.findElement(By.xpath("//*[@class='demo-frame']"));
        driver.switchTo().frame(frame);
        WebElement yesilTus= driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
        WebElement maviTus= driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-corner-all ui-state-default'])[3]"));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(yesilTus,-175,0);//Genellikle slider' lar için bu method kullanılır
        actions.dragAndDropBy(maviTus,-80,0);
        actions.dragAndDropBy(yesilTus,301,0).release().build().perform();





//     -Sarı olduğunu test edelim
//
    }
}
