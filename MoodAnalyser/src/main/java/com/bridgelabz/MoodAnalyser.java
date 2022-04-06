package com.bridgelabz;

public class MoodAnalyser {
	public String message;
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() {
		if(message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}
	public static void main(String[] args) {
		MoodAnalyser mood1 = new MoodAnalyser("I'm in any mood ");
		System.out.println(mood1.analyseMood());
		MoodAnalyser mood2 = new MoodAnalyser("I am in Sad Mood");
		System.out.println(mood2.analyseMood());
	}
}
