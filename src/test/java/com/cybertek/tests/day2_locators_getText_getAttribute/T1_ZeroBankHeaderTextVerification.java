package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        //expected:"LOG IN TO ZERO BANK"
        String expectedHeader = "log in to ZeroBank";

        //locate the web element\//get the text of it using getText method
        String actualHeader = driver.findElement(By.tagName("h3")).getText();

        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED!");
        }else{
            System.out.println("Title verification FAILED");
        }

    }
}
