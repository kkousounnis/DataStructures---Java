package com.mycompany.model;

public class Sentence {

    private String word;
    
    public Sentence() {
        this.word = word;
    }

    public Sentence(String word) {
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
