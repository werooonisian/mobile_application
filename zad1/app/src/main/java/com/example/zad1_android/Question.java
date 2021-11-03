package com.example.zad1_android;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question
{
    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean trueAnswer)
    {
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }
}
