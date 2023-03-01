package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    //Happy mood message should return happy
    @Test
    public void whenGivenMessageIsHappyShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("Happy");
        String mood = moodAnalyser.moodAnalyse("Happy");
        Assert.assertEquals("HAPPY", mood);
    }

    //Sad mood message should return sad
    @Test
    public void whenGivenMessageIsSadShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("Sad");
        String mood = moodAnalyser.moodAnalyse("Sad");
        Assert.assertEquals("SAD", mood);
    }
    @Test
    public void whenGivenNullMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.invalidMoodAnalyser();
        Assert.assertEquals("HAPPY", mood);
    }
}
