package com.cybertek.tests.day4_cssSelector_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P1_cccSelect {
    private static WebElement driver;

    public static void main(String[] args) {


        WebElement homePage = driver.findElement(By.cssSelector("a.nav-link"));
        System.out.println("Home page is displayed: " + homePage.isDisplayed());

        WebElement forgotPasswordHeader = driver.findElement(By.cssSelector("div.example"));
        System.out.println("Forgot password header is displayed: " + forgotPasswordHeader.isDisplayed());

        WebElement emailText = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println("Email text is displayed: " + emailText.isDisplayed());

        WebElement emailInputBox = driver.findElement(By.cssSelector("input[name='email']"));
        System.out.println("Email input box is displayed: " + emailInputBox.isDisplayed());


        WebElement retrivePasswordButton = driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        System.out.println("Retrive password button is displayed: " + retrivePasswordButton.isDisplayed());

        WebElement poweredByCybertekText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println("Powered by cybertek school text is displaced: " + poweredByCybertekText.isDisplayed());

    }

}
