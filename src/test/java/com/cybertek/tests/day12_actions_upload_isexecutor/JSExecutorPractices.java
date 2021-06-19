package com.cybertek.tests.day12_actions_upload_isexecutor;

import com.cybertek.tests.day9_properties.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsExecutor_test1() {
        //Get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtils.sleep(2);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass javaScript functions
        //This method is capable of accepting JS functions and apply that into our Java+Selenium code

        //in each interation it will scrool down 750 pixels
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750");
        }
        js.executeScript("window.scrollBy(0,-750)");
    }



        @Test
        public void scroll_using_jsExecutor_test2(){
            Driver.getDriver().get("http://practice.cybertekschool.com/large");

            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

            //Locating the web elements so we can use in js.executeScript method
            WebElement cybertekSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
            WebElement homeLink= Driver.getDriver().findElement(By.linkText("Home"));

            //use js.executor with different scrolling JavaScript function
            js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);

        }

        }
