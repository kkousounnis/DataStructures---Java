package com.mycompany.service;

import com.mycompany.model.Sentence;

import java.util.HashMap;

public class CountNumberCharStringService {

    private static final String word1 = "Hello my name is konstantinos";

    /**
     * @param sentence
     */
    public void countNumberCharString(Sentence sentence) {
        sentence.setWord(word1);
        try {
            if (null != sentence) {
                map(sentence);
            }
        } catch (Exception e) {

        }

    }

    public void map(Sentence sentence) {
        String[] words = sentence.getWord().split(" ");
        HashMap<String, Integer> mapWords = new HashMap<>();
        for (String word : words) {

            int counter = 0;
            for (String identicalword : words) {
                if (word.equals(identicalword)) {
                    counter++;
                }
            }
            mapWords.put(word, counter);

        }
        System.out.println(mapWords);
    }

}
