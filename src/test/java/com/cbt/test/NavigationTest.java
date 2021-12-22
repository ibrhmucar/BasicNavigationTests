package com.cbt.test;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationTest {

    public static void main(String[] args) throws InterruptedException {

        /*
    1. Open browser
    2. Go to website https://google.com
    3. Save the title in a string variable
    4. Go to https://etsy.com
    5. Save the title in a string variable
    6. Navigate back to previous page
    7. Verify that title is same is in step 3
    8. Navigate forward to previous page
    9. Verify that title is same is in step 5*/



       WebDriver driver = BrowserFactory.getDriver("chrome");
        //Open browser
        driver.get("https://google.com");
        String google = driver.getTitle();


        driver.navigate().to("https://etsy.com");
      //  Thread.sleep(3000);
        String etsy = driver.getTitle();

        driver.navigate().back();
       // Thread.sleep(3000);
        String google2 = driver.getTitle();
        StringUtility.getCheck(google, google2);


        driver.navigate().forward();
       // Thread.sleep(3000);
        String etsy2 = driver.getTitle();
        StringUtility.getCheck(etsy, etsy2);

      //  Thread.sleep(2000);
        driver.quit();


        WebDriver driver1 = BrowserFactory.getDriver("safari");
        //Open browser
        driver1.get("https://google.com");
        String google3 = driver1.getTitle();


        driver1.navigate().to("https://etsy.com");
      //  Thread.sleep(3000);
        String etsy4 = driver1.getTitle();

        driver1.navigate().back();
       // Thread.sleep(3000);
        String google4 = driver1.getTitle();
        StringUtility.getCheck(google3, google4);


        driver1.navigate().forward();
      //  Thread.sleep(3000);
        String etsy3 = driver1.getTitle();
        StringUtility.getCheck(etsy3, etsy4);

       // Thread.sleep(2000);
        driver1.quit();


       WebDriver driver2 = BrowserFactory.getDriver("firefox");
        //Open browser
        driver2.get("https://google.com");
        String google10 = driver2.getTitle();


        driver2.navigate().to("https://etsy.com");
      //  Thread.sleep(3000);
        String etsy10 = driver2.getTitle();

        driver2.navigate().back();
        //Thread.sleep(3000);
        String google11 = driver2.getTitle();
        StringUtility.getCheck(google10, google11);


        driver2.navigate().forward();
        //Thread.sleep(3000);
        String etsy11 = driver2.getTitle();
        StringUtility.getCheck(etsy10, etsy11);

        //Thread.sleep(2000);
        driver2.quit();








    }



}
