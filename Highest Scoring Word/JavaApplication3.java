/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author vm2
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        String word1 = "man i need a taxi up to ubud";
        String word2 = "what time are we climbing up to the volcano";
        List<Character> alphabet = alphabet();
        int tmpcalculateWord = 0;
        int calculationWord = 0;
        String result = "";
        String[] eachWord = word2.split(" ");
        for (int i = 0; i < eachWord.length; i++) {
            System.out.println(eachWord[i]);
            for (char c : eachWord[i].toCharArray()) {
                System.out.println(c);
                tmpcalculateWord = tmpcalculateWord + alphabet.indexOf(c);
            }
            if (calculationWord < tmpcalculateWord) {
                calculationWord = tmpcalculateWord;
                result = eachWord[i];
            }
            tmpcalculateWord = 0;
        }
        System.out.println("Result" + result + calculationWord);
        System.out.println(Arrays.asList(alphabet).indexOf('a') + 1);
    }

    private static List<Character> alphabet() {
        //        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        List<Character> alphabet = new ArrayList<>(26);
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');
        return alphabet;
    }

}
