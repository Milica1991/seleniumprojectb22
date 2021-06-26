package com.cybertek.tests.day13_actions_pom_design;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T {

    // 4. Verify That User should be able click reset button

       @Test
        public void resetButton () throws InterruptedException {
           WebDriver driver = WebDriverFactory.getDriver("chrome");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

           driver.get("https://qa3.vytrack.com/");
           //enter username
           driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user183");

           //enter password
           driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");

           //click on login
           driver.findElement(By.xpath("//button[@type='submit']")).click();

           //click on fleet menu
           driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]")).click();

           Thread.sleep(2000);

           //click on vehicles
           driver.findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")).click();

           Thread.sleep(2000);
           //click on reset
          driver.findElement(By.xpath("(//i[@class='fa-reset'])[2]")).click();



       }

    }
