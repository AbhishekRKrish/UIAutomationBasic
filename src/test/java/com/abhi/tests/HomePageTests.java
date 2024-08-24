package com.abhi.tests;

import com.abhi.browser.Driver;
import com.abhi.browser.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class HomePageTests extends BaseTest{

    @Test
    public void testcase() throws Exception {

        DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        DriverManager.getDriver().findElement(By.name("username")).sendKeys("Admin");
        DriverManager.getDriver().findElement(By.name("password")).sendKeys("admin123");
        DriverManager.getDriver().findElement(By.xpath("//button[@type='submit']")).click();

        System.out.println(DriverManager.getDriver().getTitle());
        Thread.sleep(4000);
        String text = DriverManager.getDriver().findElement(By.xpath("//span/h6")).getText();
        if(text.equalsIgnoreCase("Dashboard")){
            System.out.println("Text is found");
        }
        else{
            System.out.println("Text is not found");
        }
    }
}
