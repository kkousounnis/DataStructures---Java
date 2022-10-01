package com.mycompany.App;

import com.mycompany.Controller.CountNumberCharStringController;
import com.mycompany.model.Sentence;

public class App {
    /**
     *
     * Main class
     */
    public static void main(String[] args) {
        //Write a Java Program to count the number of words in a string using HashMap.
        new CountNumberCharStringController().countNumberCharString(new Sentence(""));
    }
}
