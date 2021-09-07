/**
 * Author : Jordan Asman
 */

import java.util.ArrayList;

public class Team
{
	// fields
	private String teamName;
	private ArrayList<Double> grade;
	
	/**
	 * 
	 * makes a new team object
	 * @param teamName
	 * @param n
	 */
	public Team(String teamName,ArrayList<Student> studNames)
	{
		this.grade = new ArrayList<Double>();
		this.teamName = teamName;
		for(int i = 0;i<studNames.size();i++)
		{
			Student k = new Student(studNames.get(i).getName());
		}
	}
	
	/**
	 * adds a grade to a team
	 * @param grade
	 */
	public void addGrade(double grade)
	{
		this.grade.add(grade);
	}
	
	/**
	 * gets the array list of grades for a team
	 * @return array list of grades
	 */
	public ArrayList<Double> getGrade()
	{
		return this.grade;
	}
	
	/**
	 * gets the team name
	 * @return team name
	 */
	public String getTeamName()
	{
		return this.teamName;
	}
	
	/**
	 * sets the team name
	 * @param teamName
	 */
	public void newTeamName(String teamName)
	{
		this.teamName = teamName;
	}
	
	public double getTeamAverage()
	{
		double total = 0.0;
		int count = 0;
		for(int i = 0; i<this.grade.size();i++)
		{
			total+=this.grade.get(i);
			count++;
		}
		double avg = total/count;
		return avg;
	}
}
