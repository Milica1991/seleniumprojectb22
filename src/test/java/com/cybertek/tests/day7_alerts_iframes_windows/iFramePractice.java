package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class iFramePractice {
    WebDriver driver;
    /*
    1.Open Chrom browser
    2 go to http.....
     */
    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }
    @Test
    public void iframe_test(){
        //#1- changing to iframe by index
        driver.switchTo().frame(0);

        //#2- LOCATE as a Web Element to swich
        //We find and locate <iframe> web element from the page
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area-iframe']"));
        //driver.switchTo().frame(iframe);

        //#3 If <iframe> tag has id or name attribute,we can pass its attribute value as a string into
        // .swichTo().frame() method directly
        driver.switchTo().frame("mce_0_ifr");

        //locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //#4 Assert: "Your content goes here" text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        //locating hader as web element
        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //#5-Assert: an ifame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());


    }
}
