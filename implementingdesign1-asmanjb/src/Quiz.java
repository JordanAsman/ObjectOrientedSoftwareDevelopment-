import java.util.ArrayList;

/**
 * 
 * TODO This class should documented with a purpose!
 *
 * 
 */
public class Quiz
{
	private int quizId;
 	private ArrayList<Question> quizQuestions;
 	
 	public Quiz(int quizId, ArrayList<Question> quizQuestions)
 	{
 		this.quizId=quizId;
 		this.quizQuestions = quizQuestions;
 	}
 	
 	public void display()
 	{
 		for(int i = 0; i < quizQuestions.size(); i++)
 		{
 			System.out.println("Question[" + quizQuestions.get(i).getQuestionId() + "]: " + quizQuestions.get(i).getData());
 		}
 	}
 	
 	public int getQuizId()
 	{
 		return quizId;
 	}
}
