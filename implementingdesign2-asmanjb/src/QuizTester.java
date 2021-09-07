import java.util.ArrayList;

public class QuizTester
{
	private String prompt;
	private int id;
	
	public QuizTester(int id,String prompt)
	{
		this.id=id;
		this.prompt=prompt;
	}
	
	public int getQuizTesterID()
	{
		return id;
	}
	
	public void updateQuizTesterID(int newId)
	{
		id = newId;
	}
	
	public String getQuizTesterPrompt()
	{
		return prompt;
	}
	
	public void updateQuizTesterPrompt(String newPrompt)
	{
		prompt = newPrompt;
	}
}