package fr.will.content;

import java.util.ArrayList;

public class Questionnaire {
	public static final int nbQuestion=10;
	public ArrayList<Question> listeQuestions = new ArrayList<>();
	Question Q;
	
	public Questionnaire(){
		listeQuestions.add(createQuestion("Angleterre","Qui a marqué le but du titre de Manchester city en "
				+ "2012 ?"
				, Answer tab[] = {createAnswer(false,"Touré")}, 2));
	}
	
	private Question createQuestion(String theme,String content, Answer[] tabAnswer, int difficulty){
		Q = new Question(theme,content, tabAnswer, difficulty);
		return Q;
	}
	
	private Answer createAnswer(boolean right, String content){
		Answer A=new Answer(right,content);
		return A;
	}
	

}
