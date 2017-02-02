package fr.will.content;

public class Answer {
	private boolean right;
	private String content;
	private boolean cheked=false;

	public Answer(boolean right, String content){
		this.content=content;
		this.right=right;
	}

	public void selectAnswer(){
		this.cheked=true;
	}

	public String getContent() {
		// TODO Auto-generated method stub
		return this.content;
	}

}
