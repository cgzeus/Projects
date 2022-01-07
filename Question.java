import java.awt.*;
import javax.swing.*;

public abstract class Question {
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("    "+question+"    ",JLabel.CENTER));
	}
	static int nQuestions = 0;
	static int nCorrect = 0;     //keeps track of number of questions and correct answers	
	String correctAnswer;
	QuestionDialog question;
	void initQuestionDialog() {
		
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	void check() {
		
		String answer = ask();
		nQuestions ++;
		if (answer.equals(correctAnswer)) {	
			JOptionPane.showMessageDialog(null, "Correct!");
			nCorrect ++;
			}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);				
		}
		}
	
	static void showResults() {
		JOptionPane.showMessageDialog(null,nCorrect + " correct questions out of "+ nQuestions);
	}
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	
				}
}
