package medunna.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    Driver i her cagirdigimizda yeni bir penecere acmamamis icin if block u ile ayaralama yaptik
    yapmis oldugumuz ayaralamada  if(driver==null) ile eger driver a deger atanmamis ise driver i baslat dedik
    driver acik iken tekrar cagirilirsa if block calismayacagindan bu method mevcut driver i tekrar return edecek
    buylece ayni driver uzerinden test senaryomuza devam edebileceğiz
     */
    static WebDriver driver;

    private Driver() {
        /*
        POM de driver clasindaki getDriver methodunun oject olusturularak kullanilmasini engellemek icin
        Singleton Pattern kullanimi benimsenmistir
        Singleton Pattern :( tekli kullanim) Bir classtan oject olusturulmasini engelleyerek o classtan özelliklere erisimi
        singleton yapariz
        Bunu saglamak icin default constructor i private yapariz
         */
    }

    public static WebDriver getDriver(){
        if(driver==null){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.close();
            driver=null;
        }
    }






}

