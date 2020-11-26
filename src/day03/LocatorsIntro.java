package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsIntro {


    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Kot\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.manage().window().maximize();
         driver.get("http://a.testaddressbook.com");


         //b. Sign in butonuna basin
         //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        signInLinki.click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        //5 sn ye bekleme
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="d">
        WebElement emailTextBox= driver.findElement(By.id("session_email"));
        //<input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        WebElement signInButonu=driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!

        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>
        WebElement kullaniciAdi=driver.findElement(By.className("navbar-text"));
        if (kullaniciAdi.isDisplayed()){
            System.out.println("kullanici adi  testtechproed@gmail.com PASS ");
        }else{
            System.out.println("kullanici adi testtechproed@gmail.com FAİLED");
        }




         //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).

        //<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>
        WebElement adresLinki=driver.findElement(By.linkText("Addresses"));
        if (adresLinki.isDisplayed()){
            System.out.println("adres linki gorundu testi PASS");
        }else{
            System.out.println("adres linki gorundu testi FAİLED");
        }


        WebElement signOutText = driver.findElement(By.linkText("Sign out"));
        if (signOutText.isDisplayed()){
            System.out.println("Sign out gorundu testi PASS");
        } else {
            System.out.println("sign out gorundu testi FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("sayfada " + linkListesi.size() + " tane link var");

        driver.close();





    }
}
