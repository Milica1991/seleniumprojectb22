package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        //setup the browser driver
        WebDriverManager.chromedriver().setup();

        //1.Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link text Vetification Passed");
        }else{}
        System.out.println("Link text Verification Failed");

        //Expected index.html
        String expectedInHrefValue = "index.html";

        String actualHrefValue = zeroBankLink.getAttribute("href");
        if(actualHrefValue.contains(expectedInHrefValue)){
            System.out.println("HREF attribute value verification PASSED");
        }else {
            System.out.println("HREF attribute value verification FAILED");
        }

       // System.out.println("actualHrefValue = " + actualHrefValue);



    }
}
