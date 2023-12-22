package org.example;

public class choice {
    private final String content;
    private final boolean correct;

    public choice(String content, boolean correct) {
        this.content = content;
        this.correct = correct;
    }
    public choice(String content){
        this(content, false);

    }
    public String getContent(){
        return content;
    }
    public boolean isCorrect(){
        return correct;
    }
}
