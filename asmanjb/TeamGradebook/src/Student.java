/**
 * Author : Jordan Asman
 */

import java.util.ArrayList;

public class Student
{
	// fields
	private String name;
	private int absences = 0;
	private ArrayList<Team> studentTeam;

	/**
	 * makes a new student object
	 * 
	 * @param newName the name of the student
	 */
	public Student(String name)
	{
		this.name = name;
		this.studentTeam = new ArrayList<Team>();
	}

	/**
	 * gets the name of the student
	 * 
	 * @return the name of the student
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * 
	 * adds an absence to the student
	 * @param name
	 */
	public void addAbsences(String name)
	{
		this.absences++;
	}
	
	/**
	 * gets the number of absences for the student
	 * 
	 * @param name
	 * @return number of absences
	 */
	public int getAbsences(String name)
	{
		return this.absences;
	}
	
	/**
	 * adds a team to the student
	 * 
	 * @param t
	 */
	public void addTeam(Team t)
	{
		this.studentTeam.add(t);
	}
	
	/**
	 * gets the list of teams the student is on
	 * 
	 * @return team array list
	 */
	public ArrayList<Team> getTeam()
	{
		return this.studentTeam;
	}
	
	public double getStudentAverage()
	{
		ArrayList<Team> t = this.getTeam();
		int count = 0;
		double total = 0.0;
		for(int i=0;i<t.size();i++)
		{
			ArrayList<Double> g = t.get(i).getGrade();
			for(int j = 0; j<g.size();j++)
			{
				total+=g.get(j);
				count++;
			}
		}
		double avg = total/count;
		return avg;
	}
}
