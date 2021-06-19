package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }

        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]"));
        if (submitButton.isDisplayed()) {

            WebElement inputUsername = driver.findElement(By.id("ctl00_MainContent_username"));
            inputUsername.sendKeys("Tester");

            WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
            inputPassword.sendKeys("test" + Keys.ENTER);
        }




        String expectedTitle1 = "Web Orders";
        String actualTitle1 = driver.getTitle();
        //Thread.sleep(3000);

        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }
    }

}

