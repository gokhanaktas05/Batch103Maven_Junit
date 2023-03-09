package practice02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class Dropdown extends TestBase {
    @Test
    public void test01(){
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //Dropdown menuyu yazdıralım
        //Amazon sayfasına gidelim
        driver.get("https://amazon.com");

        //Dropdown menuyu yazdıralım
        /*WebElement dropdown = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Baby");
        for (WebElement w:select.getOptions()) {
            System.out.println(w.getText());
        }*/
        List<WebElement>list2=driver.findElements(By.xpath("//*[@id='searchDropdownBox']"));
        /*for (WebElement w:list2){
            System.out.println(w.getText());
        }*/
        list2.forEach(t-> System.out.println(t.getText())); // butun dropdown listesini yazdırdık.
        //Dropdown menuden baby secelim

        driver.findElement(By.xpath("//*[@id='searchDropdownBox']")).sendKeys("Baby",Keys.TAB,"Milk",Keys.ENTER);
        //arama bölümünden milk aratalım
        }
    }

