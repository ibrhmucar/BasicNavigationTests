package com.cbt.test;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class NewCheckBoxHW1 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

        WebElement passWord = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passWord.sendKeys("test");

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        WebElement checkAllButton = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_btnCheckAll']"));
        checkAllButton.click();

        for(int i=1 ; i<=8 ; i++){
            String rowCheckBoxLocator = "(//input[@type='checkbox'])["+i+"]";
            WebElement rowCheckBox = driver.findElement(By.xpath(rowCheckBoxLocator));
            Assert.assertTrue(rowCheckBox.isSelected(),"The Checkbox not seleceted");
        }

        WebElement unCheckAll = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_btnUncheckAll']"));
        unCheckAll.click();

        for(int i=1 ; i<=8 ; i++) {
            String rowCheckBoxLocator = "(//input[@type='checkbox'])[" + i + "]";
            WebElement rowCheckBox = driver.findElement(By.xpath(rowCheckBoxLocator));
            Assert.assertTrue(!rowCheckBox.isSelected(), "The Checkbox selected");
        }


        WebElement personNumber4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]/../../td[2]"));
        String deletedNames = personNumber4.getText();


        WebElement deletePerson4 = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
        deletePerson4.click();

        WebElement deleteButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$btnDelete']"));
        deleteButton.click();


        ArrayList <String> names = new ArrayList<>();

        for (int i=1 ; i<=7 ; i++) {
            String eachNameLocator = "(//input[@type='checkbox'])[" + i + "]/../../td[2]";
            WebElement eachnameElement = driver.findElement(By.xpath(eachNameLocator));
            String eachname = eachnameElement.getText();
            names.add(eachname);
        }


        System.out.println("names :" + names);
        System.out.println("Deleted name is :" + deletedNames);

        Assert.assertFalse(names.contains(deletedNames), "Row doesn't deleted");

        driver.quit();


    }
}
