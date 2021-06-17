package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {
    /**
     * Creating the private constructor so this class object is not reachable from outside
     */
    private Driver(){}

    /**
     * Making our driver instance so that it is not reachable from outside of the class
     * we make static,because we want it to run before everything else,and we will use in a static method
     */
    private static WebDriver driver;

    /**
     * Creating re-usable method that will return same driver instance everytime we call it.
     */
    public static WebDriver getDriver(){

    }
}
