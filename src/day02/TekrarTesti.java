package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını
        //   doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa
        //   doğru URL'yi yazdırın.
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        //5. Youtube sayfasina geri donun
        //6. RefrSayfayi yenileyin
        //7. Amazon sayfasina donun
        //8. Sayfayi tamsayfa yapin
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //   doğru başlığı(Actual Title) yazdırın.
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        //11.Sayfayi kapatin


        //---2
        driver.navigate().to("https://www.youtube.com/");
        String actuallResult=driver.getTitle();
        String expectedResult="youtube";
        if (actuallResult.equals(expectedResult)){
            System.out.println("Youtube title testi PASS");
        }else{
            System.out.println("Youtube title testi FAİLED");
            System.out.println("Actual Title : " + actuallResult);
        }

        //--3
        String actualYoutubeURL=driver.getCurrentUrl();
        String arananKelime="youtube" ;
        if (actualYoutubeURL.contains(arananKelime))  {
            System.out.println("URL icerik testi PASS");
        } else {
            System.out.println("URL icerik testi FAILED");
            System.out.println("URL " + arananKelime + " icermiyor");
        }
        //--4
        driver.navigate().to("https://www.amazon.com.tr/");
        //--5
        driver.navigate().back();
        //--6
        driver.navigate().refresh();
        //--7
        driver.navigate().forward();
        //--8
        driver.manage().window().maximize();
        //--9
        String actuallAmazonTitle=driver.getTitle();
        String arananAmazonKelime="Amazon";
        if (actuallAmazonTitle.contains(arananAmazonKelime)){
            System.out.println("Amazon baslık testi PASS");
        }else{
            System.out.println("Amazon baslık testi FAİLED");
            System.out.println("Title"+ arananAmazonKelime+ "icermiyor");
        }
        //--10

        String actuallAmazonURL=driver.getCurrentUrl();
        String expectedAmazonURL="https://www.amazon.com/";

        if (actuallAmazonURL.equals(expectedAmazonURL)){
            System.out.println("Amazon URL testi PASS");
        }else{
            System.out.println("Amazon URL testi FAİLED");
            System.out.println("Aktuel amazon URL "+ actuallAmazonURL);
        }

        //--11

        driver.close();

    }
}
