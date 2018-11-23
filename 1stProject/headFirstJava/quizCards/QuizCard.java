package headFirstJava.quizCards;

public class QuizCard {

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String question;
	public String answer;
	
	public QuizCard(String text, String text2) {
		question = text;
		answer = text2;
	}

	

}
