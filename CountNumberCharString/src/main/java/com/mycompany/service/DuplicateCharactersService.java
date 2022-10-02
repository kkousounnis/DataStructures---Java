package com.mycompany.service;

import com.mycompany.model.Sentence;

import java.util.ArrayList;
import java.util.List;

public class DuplicateCharactersService {

    private static final String word2 = "abbaaHelbbblo mybb name is konstantinoaaas";

    public void duplicateCharacters(Sentence sentence) {
        sentence.setSentence(word2);
        try {
            if (null != sentence) {
                find(sentence);
            }
        } catch (Exception e) {

        }
    }

    public void find(Sentence sentence) {
        List<Character> characters = getCharacters(sentence);

        for (char c : characters) {
            int counter = 0;
            for (char ch1 : sentence.getSentence().toCharArray()) {
                if (c == ch1) {
                    counter++;
                }
            }

            System.out.println(counter + " times we can see " + "Character :" + c);
        }
    }

    /**
     *
     * @param sentence
     * @return List of charact
     */
    private static List<Character> getCharacters(Sentence sentence) {
        //remove all white spaces from String
        sentence.setSentence(sentence.getSentence().replaceAll("\\s+",""));

        List<Character> characters = new ArrayList<>();
        for (char ch : sentence.getSentence().toCharArray()) {
            if(!characters.contains(ch)){
                characters.add(ch);
            }
        }
        return characters;
    }
}
