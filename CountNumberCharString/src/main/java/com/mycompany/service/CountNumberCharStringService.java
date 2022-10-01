package com.mycompany.service;

import com.mycompany.model.Word;

import java.util.HashMap;

public class CountNumberCharStringService {

    private static final String word1 = "1234djd1238309";

    /**
     * @param word
     */
    public void countNumberCharString(Word word) {
        word.setWord(word1);
        try {
            if (null != word) {

                calculator(word);
            }
        } catch (Exception e) {
            System.out.println("NULL");
        }
    }

    public HashMap<Integer, String> calculator(Word word) {

        return (null);
    }

}
