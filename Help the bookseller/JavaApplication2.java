/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vm2
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] listOfArt = {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
        String[] lstOf1stLetter = {"A", "B"};
        int sum = 0;
        Map<String, Integer> result = new HashMap<String, Integer>();
        String result1 = "";
        for (String arr : lstOf1stLetter) {

            for (String list : listOfArt) {

                if (arr.charAt(0) == list.charAt(0)) {

                    String[] number = list.split(" ");
                    sum = sum + Integer.parseInt(number[1]);
                }

            }

            result.put(arr, sum);
            if (!isStringEmpty(result1)) {
                result1 = result1 + " - " + "(" + arr  + " : " +  + sum + ")";
            } else {
                result1 = result1 + "(" + arr  + " : " + sum + ")";
            }

            sum = 0;
        }
        System.out.println(result1);
        // TODO code application logic here
    }

    public static boolean isStringEmpty(String str) {

        // check if the string is empty or not
        // using the isEmpty() method
        // and return the result
        if (str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
