package com.cybertek.tests.day12_actions_upload_isexecutor;

/*
    We will create similar logic we created in DRiver utility class
    But it will be for String
     */

public class Singleton {

    //Create private constructor
    private Singleton() {
    }

    //we will ensure we create access only through our getter and setter
    private static String word;

    //we allow user to acces to word in the way we want them to have
    public static String getWord() {
        if (word == null) {
            System.out.println("First time call. " + "Assigning value to it now");
            word = "somthing";


        } else {
            System.out.println("Word already has a value");
        }
        return word;


    }

}
