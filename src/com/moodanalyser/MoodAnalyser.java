package com.moodanalyser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyser {
    //Use Case 1: Analyse and respond Happy or Sad mood if a message is given
    public static String moodAnalyse(String message){

        //Taking two patterns Happy and Sad and matching them with message
        Pattern pattern1 = Pattern.compile("Happy");
        Pattern pattern2 = Pattern.compile("Sad");
        Matcher matcher1 = pattern1.matcher(message);
        Matcher matcher2 = pattern2.matcher(message);

        //Initially the mood string is empty
        String mood = "";
        if (matcher1.find()){
            mood = "HAPPY";
        } else if (matcher2.find()){
            mood = "SAD";
        }
        return mood;
    }

    public static void main(String[] args) {
        System.out.println("Analysing the mood of a person.");

        //This will match the string with the pattern and generate the corresponding mood
        //I have written a message regarding my mood
        String mood = moodAnalyse("I am feeling Sad");
        System.out.println("The mood of the person is "+ mood);
    }
}