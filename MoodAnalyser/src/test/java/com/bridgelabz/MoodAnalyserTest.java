package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		MoodAnalyser moodanalyser = new MoodAnalyser("I'm in Any mood");
		try {
			Assert.assertEquals("HAPPY", moodanalyser.analyseMood());
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I'm in a Sad mood");
		try {
			Assert.assertEquals("SAD", moodAnalyser.analyseMood());
		} catch (MoodAnalyserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMessage_WhenNull_ReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
		}
	}

	@Test
	public void givenMessage_WhenEmpty_ThrowException() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");

		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalyserException e) {
			Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
}
