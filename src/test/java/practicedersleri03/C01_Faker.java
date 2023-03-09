package practicedersleri03;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Faker extends TestBase {
    @Test
    public void test01(){
        // 'https://www.facebook.com' sayfasina gidiniz
        driver.get("https://www.facebook.com");
        // yeni hesap olustur butonuna basin
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        // isim kutusunu locate ediniz
        WebElement name= driver.findElement(By.xpath("//*[@name='firstname']"));

        // geriye kalan alanlari TAB ile dolasarak faker bilgilerle formu doldur
        Faker faker=new Faker();
        Actions actions=new Actions(driver);
        actions.click(name);
        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("16").sendKeys("Ağu").sendKeys("1986")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();



    }
}
