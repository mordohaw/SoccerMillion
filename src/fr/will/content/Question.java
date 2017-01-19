package fr.will.content;

public class Question {
	public static final String fin = " ?";
	private String theme;
	private String content;
	private Answer questionAnswers[]=new Answer[5];
	private int level;
	private int num;
	
	public Question(String theme,String content, Answer[] tabAnswer, int difficulty){
		this.content=content+fin;
		this.questionAnswers=tabAnswer;
		this.theme=theme;
		this.level=difficulty;
	}
	
	public String getTheme() {
		return theme;
	}

}