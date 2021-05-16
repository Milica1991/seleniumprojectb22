package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {
        //1- setup the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of selenium web driver
        //this is line opens a browser
        WebDriver driver = new ChromeDriver();

        //3- get the page for Tesla.com
        driver.get("https://www.tesla.com");

        driver.getCurrentUrl();


        //refreshing the page using navigations
        driver.navigate().refresh();

        //going to another url using .to() method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title "+driver.getTitle());

        //putting 3 second of waiting
        Thread.sleep(3000);

        //going back using navigations
        driver.navigate().back();

        //Going forward using navigation
        driver.navigate().forward();

        driver.getCurrentUrl();

        driver.manage().window().maximize();
        //this method will close the currently opened browser
        //driver,close will cloes the currenly focused page or tag






    }
}
