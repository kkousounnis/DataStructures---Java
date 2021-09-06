/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vm2
 */
public class JavaApplication4 {

    public static void main(String[] args) {
        
        System.out.println(9 % 3);
        System.out.println(6 % 3);
        System.out.println(3 % 3);
        System.out.println(5 % 5);

        System.out.println(15 % 3);
        System.out.println(15 % 5);
        int number = 15;
        boolean isMultipleBy3=false;
        boolean isMultipleBy5=false;

        if (number % 3 == 0) {
            isMultipleBy3 = true;
        }
        if (number % 5 == 0) {
            isMultipleBy5 = true;
        }


    }
}
