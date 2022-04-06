package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy(){
		MoodAnalyser moodanalyser = new MoodAnalyser("I'm in Any mood");
		Assert.assertEquals("HAPPY",moodanalyser.analyseMood());
	}

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad(){
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in a Sad mood");
		Assert.assertEquals("SAD",moodAnalyser.analyseMood());
	}
}
