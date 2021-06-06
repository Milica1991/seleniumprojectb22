package com.cybertek.tests.day9_properties;

public class BrowserUtils {
    /*
    Method that will accept int
    Wait for given second duration
      //1sec = 1000 mili seconds
        //1 * 1000 = 1000
     */
    public static void sleep(int second) {
        second*=1000;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
