package fr.will.content;

public abstract class Question {
	public static final String fin = " ?";
	private String theme;
	private Answer questionAnswers[]=new Answer[5];
	private int level;
	
	public Question(String theme, Answer[] tabAnswer, int difficulty){
		this.questionAnswers=tabAnswer;
		this.theme=theme;
		this.level=difficulty;
	}
	
	public String getTheme() {
		return theme;
	}

}