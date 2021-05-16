package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        //2. Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");

        //3. Click "Home" button
        //1st - locate the web element using class atribute value
        //2nd -click

        Thread.sleep(3000);

        driver.findElement(By.className("nav-link")).click();
        //4. Verify title as expected:
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }



    }
}
