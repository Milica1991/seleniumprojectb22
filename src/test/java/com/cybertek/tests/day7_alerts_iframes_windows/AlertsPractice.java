package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setMethod() {
        driver= WebDriverFactory.getDriver("chrom");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript alerts");
    }
    @Test
    public void information_alert_test(){
        //Locating the button for alert to click
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        //3. Click to "Click for JS Alert" buton
        informationAlertButton.click();
        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        //5. Verify "You sucessfuly clicked an alert" text is displayed



    }
}
