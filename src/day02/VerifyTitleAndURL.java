package day02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleAndURL {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        //google git
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //sayfa baslıgının (titlr) "google" oldugunu dogrulayın(verify)
        String actualRasult =driver.getTitle();
        String expectedResult="google";

        if(actualRasult.equals(expectedResult)) {
            System.out.println("page title testi PASS");
        }else {
            System.out.println("page title testi FAILED");
            System.out.println("actual page title :"+ actualRasult);
        }

        //navigate to youtube homepage  "https://www.youtube.com/"
        driver.navigate().to("https://www.youtube.com/");
        String actuallURL=driver.getCurrentUrl();

        //verify ifyoutube homepage url is "www.youtube.com"
        String expectedURL="www.youtube.com";

       if(actuallURL.equals(expectedURL)){
           System.out.println("URL testi PASS");
       }else{
           System.out.println("URL testi FAILED");
           System.out.println("actual URL :" + actuallURL);
       }

        driver.close();




    }
}
