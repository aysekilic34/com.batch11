package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkSeleniumTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //driver.get("https://www.google.com/");
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize(); //tam ekranyap
        driver.navigate().refresh();  //sayfayı yenıle
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        //driver.close();  //actıgı sayfayı kapatır
        driver.quit(); //hepsını kapatır
    }

}
