package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

         // a.google web sayfasına gidin. https://www.google.com/
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //  b. Search(ara) “city bike”
       WebElement searchBox= driver.findElement(By.name("q"));
       String arananKelime="apple";
       searchBox.sendKeys(arananKelime);
       searchBox.submit();

        //c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement arananSonucSayisi=driver.findElement(By.id("result-stats"));
        System.out.println(arananKelime +"  aranan sonuc sayısı  :" + arananSonucSayisi.getText() );

       // d. “Shopping” e tıklayın.
        WebElement alisveris=driver.findElement(By.linkText("Alışveriş"));
        alisveris.click();

       // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement ilkResim=driver.findElement(By.id("srpresultimg_14734803163735815810_1_0"));
        ilkResim.click();

        driver.close();

    }
}
