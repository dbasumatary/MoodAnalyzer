package com.moodanalyser;

public class MoodAnalyserException extends Exception{
    public MoodAnalyserException(String message){
        super(message);
    }
    enum ExceptionType{
        EnteredNULL,
        EnteredEMPTY
    }
}
