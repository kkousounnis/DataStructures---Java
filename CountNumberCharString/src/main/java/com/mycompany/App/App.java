package com.mycompany.App;

import com.mycompany.Controller.CountNumberCharStringController;
import com.mycompany.Controller.DuplicateCharactersController;
import com.mycompany.Controller.VehicleController;
import com.mycompany.model.Sentence;

public class App {
    /**
     * Main class
     */
    public static void main(String[] args) {
        //Write a Java Program to count the number of words in a string using HashMap.
        new CountNumberCharStringController().countNumberCharString(new Sentence(""));

        //Write a Java Program to find the duplicate characters in a string.
        new DuplicateCharactersController().DuplicateCharacters(new Sentence(""));

        //write a Java Program which explains OOP 1)Inheritance, 2)Abstraction, 3) Polymorphism 4) Encapsulation
        new VehicleController().Vehicle();

    }
}
