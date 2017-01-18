package fr.will.content;

public abstract class Question {
	public static final String fin = " ?";
	private String theme;
	private String questionAnswer;
	private int level;
	
	public Question(String theme, String questionAnswer, int difficulty){
		this.questionAnswer=questionAnswer;
		this.theme=theme;
		this.level=difficulty;
	}
	
	public String getTheme() {
		return theme;
	}

}