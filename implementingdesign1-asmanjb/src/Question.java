/**
 * 
 * TODO This class should documented with a purpose!
 *
 * 
 */
public class Question
{
	private int questionId;
	private String data;
	
	public Question(int questionId,String data)
	{
		this.questionId = questionId;
		this.data = data;
	}
	
	public int getQuestionId()
	{
		return questionId;
	}
	
	public String getData()
	{
		return data;
	}
	
	public void updateData(String newData)
	{
		data = newData;
	}
}
