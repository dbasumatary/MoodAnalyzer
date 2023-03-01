package com.moodanalyser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoodAnalyser {
    private static String message;

    //Constructor with message as argument
    public MoodAnalyser(String message) {
        this.message = message;
    }

    //UC1: Analyse and respond Happy or Sad mood if a message is given
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


    //UC2: Handle exception if the user provides invalid mood message
    public static String invalidMoodAnalyser(){

        //Initially the mood string is empty
        String mood = "";
        try{
            //Taking two patterns Happy and Sad and matching them with message
            Pattern pattern1 = Pattern.compile("Happy");
            Pattern pattern2 = Pattern.compile("Sad");
            Matcher matcher1 = pattern1.matcher(message);
            Matcher matcher2 = pattern2.matcher(message);
            if (matcher1.find()){
                mood = "Happy";
            } else if (matcher2.find()){
                mood = "Sad";
            }
        }
        // Catch exception if the user provides invalid mood message
        //Here the output mood will be Happy
        catch (NullPointerException e) {
            mood =  "Happy";
        }
        return mood;
    }
    public static void main(String[] args) {
        System.out.println("Analysing the mood of a person if null is given as mood");

        //The input message is given as null
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);

        //This will match the string with the pattern and generate the null input
        String mood = moodAnalyser.invalidMoodAnalyser();
        System.out.println("The mood of the person is "+ mood);
    }

}