package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        //youtube git
        driver.navigate().to("https://www.youtube.com/");
        //amazona git
        driver.navigate().to("https://www.amazon.com.tr/");
        //youtube don
        driver.navigate().back();
        //bır sonrakı sayfaya gıt
        driver.navigate().forward();
        //sayfayı yenıle
        driver.navigate().refresh();
        //tam ekran yap
        driver.manage().window().maximize();
        //sanıyelık beklemek ıcın
        Thread.sleep(5000);



        driver.close();


    }
}
