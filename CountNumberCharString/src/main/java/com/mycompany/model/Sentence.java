package com.mycompany.model;

public class Word {

    private String word;
    
    public Word() {
        this.word = word;
    }

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("word{");
        sb.append("word=").append(word);
        sb.append('}');
        return sb.toString();
    }

}
