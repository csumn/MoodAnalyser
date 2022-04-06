package com.bridgelabz;

public class MoodAnalyser {
	public String message;
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyserException {
		try {
			if(message.length() == 0 ){
				throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter VALID mood");
			}
			if (message.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (NullPointerException e){
			throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please Enter VALID Mood");
		}
	}
	public static void main(String[] args) throws MoodAnalyserException {
		MoodAnalyser mood1 = new MoodAnalyser("I'm in any mood ");
		System.out.println(mood1.analyseMood());
		MoodAnalyser mood2 = new MoodAnalyser("I am in Sad Mood");
		System.out.println(mood2.analyseMood());
		MoodAnalyser mood3 = new MoodAnalyser("Iam in Happy Mood");
		System.out.println(mood3.analyseMood());
	}
}
