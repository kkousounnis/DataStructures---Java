package com.mycompany.model;

public class Sentence {

    private String sentence;
    
    public Sentence() {
        this.sentence = sentence;
    }

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sentence{");
        sb.append("sentence=").append(sentence);
        sb.append('}');
        return sb.toString();
    }

}
