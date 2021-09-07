
public class Question
{
	private int questionId;
	private String data;
	private Boolean answer;
		
	public Question(int questionId,Boolean answer,String data)
	{
		this.questionId = questionId;
		this.answer=answer;
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
	
	public Boolean getAnswer()
	{
		return answer;
	}
	
	public void updateData(String newData)
	{
		data = newData;
	}
	
	public void updateAnswer(Boolean newAnswer)
	{
		answer = newAnswer;
	}
}
