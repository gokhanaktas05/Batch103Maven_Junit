package HomeWork;

public class Homwork01 {
    //Bir class olusturun: IframeOdev
//https://the-internet.herokuapp.com/iframe  sitesine gidiniz
//sayfadaki toplam iframe sayısını bulunuz.
//Sayfa basliginda 'Editor' yazını içerdiğini test edelim.
//Paragrafdaki yaziyi silelim
//Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
//Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edelim
    /*How do you find the number of iframe on a page? Bir sayfadaki toplan iframe sayisini basil buluruz?
            ***Iframe ler iframe tagi kullanılarak oluşturulur. Bu durumda find elements by frame locatorini kullanarak tum iframeleri bulurum
***driver.findElements(By.tagName(“iframe”));
***driver.findElements(By.xpath(“//iframe”));
        ————————————
    Explain how you can switch back from a main page? Tekrar ana sayfaya nasil donersin?
            ***2 farkli yol vardır.
***defaultContent yada parentFrame metotlarını kullarak gecis yapabiliriz.
———————————-
    What is the difference between defaultContent and parentFrame? defaultContent ve parentFrame arasindaki farklar nelerdi?
            *** Oncelikle her ikiside framein misina cikmamizi saglar. Ama defaultContent direk ana sayfaya atlatır, parentFrame ise bir üst seviyeye atlatir
—————————————
    What might be the reason for your test case to fail?Bir test case in fail etme sebepleri neler olabilir?
    Yanlis locator. Cozum : Tekrar elementi locate etmek. Değişken element var ise ona gore dynamic bir xpath yazarız.
    Wait / Syncronization /Bekleme problemi: Cozum : implicit wait de yeterli sure oldugundan emin oluruz. O sureyi arttırabiliriz. 30 saniye verilebilir. Explicit wait kullanilabilir(sonra gore).
    Iframe. Cozum : switch to iframe
    Alert. Cozum : switch to alert
    New window(Yeni pencere) : switch to window*/
}
