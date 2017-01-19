package fr.will.content;

import java.util.ArrayList;

public class Questionnaire {
	public static final int nbQuestion=10;
	public ArrayList<Question> listeQuestions = new ArrayList<>();
	Question Q;
	
	public Questionnaire(){
		Answer tabQ1[]=new Answer[4];
		
		tabQ1[0] = createAnswer(false,"TourÃ©");
		tabQ1[1] = createAnswer(true,"Aguero");
		tabQ1[2] = createAnswer(false,"Silva");
		tabQ1[3] = createAnswer(false,"Dzeko");
		
		listeQuestions.add(createQuestion("Angleterre","Qui a marqué le but du titre de Manchester city en "
				+ "2012"
				, tabQ1, 2));
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
