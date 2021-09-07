import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class is used to demonstrate a functional design involving Quizzes and
 * Questions which can be updated and displayed
 * 
 */
public class QuizMain
{
	private ArrayList<Quiz> quizzes;
	private ArrayList<Question> questions;
	

	// TODO add instance variables here

	public QuizMain()
	{
		// TODO In order to demonstrate functionality, please follow the TODOs below
		// You will have to create questions and quizzes when a QuizMain is created

		// TODO 1 Create five questions (can be silly/basic questions) use id 1,2,3,4,5
		// ...
		questions = new ArrayList<Question>();
		questions.add(new Question(1,"What is 1 + 1?"));
		questions.add(new Question(2,"What is 2 + 1?"));
		questions.add(new Question(3,"What is 3 + 1?"));
		questions.add(new Question(4,"What is 4 + 1?"));
		questions.add(new Question(5,"What is 5 + 1?"));
		

		// TODO 2 Create three or more quizzes use id 1,2,3...
		// (One quiz should share at least one question with another )
		quizzes = new ArrayList<Quiz>();
		ArrayList<Question> q1 = new ArrayList<Question>();
		q1.add(questions.get(0));
		q1.add(questions.get(3));
		q1.add(questions.get(2));
		// questions 1, 4, and 3
		quizzes.add(new Quiz(1,q1));
		ArrayList<Question> q2 = q1;
		q2.remove(2);
		q2.remove(1);
		q2.add(questions.get(1));
		q2.add(questions.get(4));
		// questions 1, 2, and 5
		quizzes.add(new Quiz(2,q2));
		ArrayList<Question> q3 = q2;
		q3.remove(2);
		q3.add(questions.get(2));
		// questions 1, 2, and 4
		quizzes.add(new Quiz(3,q3));
	}

	public static void main(String[] args)
	{
		// We want to use instance variables of the QuizMain class so we need to
		// construct a QuizMain object
		QuizMain myQuizSimulator = new QuizMain();

		// TODO 3 Display three or more different quizzes
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more original quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);

		// TODO 4 Change two quiz questions
		// A. (One should be shared with two or more quizzes)
		// B. (One should be unique to one quiz)
		myQuizSimulator.handleUpdateQuizQuestion(1, "What is different 1?");
		myQuizSimulator.handleUpdateQuizQuestion(2, "What is different 2?");

		// TODO 5 Display the same three (or more) quizzes
		// A. One that has a unique question which changed
		// B. Two which share a question that has been changed
		System.out.println("--------------------------------------------------");
		System.out.println("Showing three or more changed quizzes:");
		System.out.println("--------------------------------------------------");
		myQuizSimulator.handleDisplayQuiz(1);
		myQuizSimulator.handleDisplayQuiz(2);
		myQuizSimulator.handleDisplayQuiz(3);

	}

	/**
	 * This method should display a quiz in a very similar fashion to the output
	 * provided in example_output.txt, which is located in your repository
	 * 
	 * 
	 * @param quizId
	 */
	public void handleDisplayQuiz(int quizId)
	{
		// TODO complete this method
		System.out.println("Quiz: " + quizId);
		for(int i = 0; i < quizzes.size(); i++)
		{
			if(quizzes.get(i).getQuizId() == quizId)
			{
				quizzes.get(i).display();
			}
		}
	}

	/**
	 * 
	 * This method should replace the data in the question with id=questionId with
	 * the new questionData
	 * 
	 * @param questionId
	 * @param questionData
	 */
	public void handleUpdateQuizQuestion(int questionId, String questionData)
	{
		for(int i = 0; i < questions.size(); i++)
		{
			if(questions.get(i).getQuestionId() == questionId)
			{
				questions.get(i).updateData(questionData);
			}
		}
		// TODO complete this method
	}

}
