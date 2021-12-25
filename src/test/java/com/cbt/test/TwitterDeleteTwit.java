package com.cbt.test;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TwitterDeleteTwit {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("https://twitter.com");

        Thread.sleep(3000);

        WebElement signInButton = driver.findElement(By.xpath("//a[@href='/login']"));
        signInButton.click();

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@autocomplete='username']"));
        username.sendKeys("ibrhmucar@icloud.com");

        WebElement nextButton = driver.findElement(By.xpath("(//div[@dir='auto'])[7]"));
        nextButton.click();

        Thread.sleep(3000);

        WebElement nickname = driver.findElement(By.xpath("//input[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-deolkf r-homxoj r-poiln3 r-7cikom r-1ny4l3l r-t60dpp r-1dz5y72 r-fdjqy7 r-13qz1uu']"));
        nickname.sendKeys("noonecandoit001");

        Thread.sleep(5000);

     /*   WebElement clikButton = driver.findElement(By.xpath("(//div[@class='css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[3]"));
        Thread.sleep(5000);
        clikButton.click();*/

        WebElement Login = driver.findElement(By.xpath("(//div[@dir='auto'])[6]"));
        Login.click();
        Thread.sleep(3000);



        WebElement password = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
        password.sendKeys("Ngrm2185.hyt");

        WebElement logInButton = driver.findElement(By.xpath("(//span[@class='css-901oao css-16my406 r-poiln3 r-bcqeeo r-qvutc0'])[6]"));
        logInButton.click();
        Thread.sleep(5000);


        driver.navigate().to("https://twitter.com/noonecandoit001");


        Thread.sleep(3000);
        WebElement deleteButton = driver.findElement(By.xpath("//div[@role='menuitem'][1]"));
        deleteButton.click();



    }





}
