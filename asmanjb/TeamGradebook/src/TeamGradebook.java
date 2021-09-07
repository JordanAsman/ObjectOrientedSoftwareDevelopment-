/**
 * Author : Jordan Asman
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TeamGradebook
{

	private ArrayList<Student> students;
	private ArrayList<Team> teams;
	

	/**
	 * Constructor - initializes the fields of TeamGradebook
	 * 
	 * You'll want to be sure you initialize students and teams here.
	 */
	public TeamGradebook()
	{
		this.students = new ArrayList<Student>();
		this.teams = new ArrayList<Team>();
		// TODO: add initialization code
	}

	/**
	 * Adds a student for grade tracking.
	 * 
	 * You can assume the student name is unique. If the student name is duplicated,
	 * feel free to do whatever you want - error, act buggy, whatever.
	 * 
	 * @param studentName name to add
	 * @return "ok" if successful
	 */
	
	private String handleAddStudent(String studentName)
	{
		Student s = new Student(studentName);
		if(this.students.add(s))
		{
			return "ok";
		}

		return "failed";
	}
	
	/**
	 * Adds an absence to a particular student's record.
	 * 
	 * Absence count should start at 0 and should increase by one everytime
	 * add-absence is called
	 * 
	 * This method should always print ok, unless the student doesn't exist in which
	 * case you can error however you like.
	 * 
	 * HINT: It's probably worthwhile to write a getStudentByName method that
	 * returns the student object from your storage that matches a particular name.
	 * You'll use it for get-average too. But it's not required.
	 * 
	 * 
	 * @param studentName
	 * @return
	 */
	private String handleAddAbsence(String studentName)
	{
		if(students.contains(getStudentByName(studentName)))
		{
			getStudentByName(studentName).addAbsences(studentName);
			return "ok";
		}
		else
			return "error";
	}

	/**
	 * Returns a number of absences in a particular student's record.
	 *
	 * Absence count should start at 0 and should increase by one everytime
	 * add-absence is called
	 * 
	 * To convert the number of absences to a string, do this:
	 * 
	 * String resultAsString = Integer.toString(myNum);
	 * 
	 * 
	 * @param studentName
	 * @return
	 */
	private String handleGetAbsences(String studentName)
	{
		if(students.contains(getStudentByName(studentName)))
		{
			Integer result = getStudentByName(studentName).getAbsences(studentName);
			return Integer.toString(result);
		}
		return "error";
	}

	/**
	 * Adds a team.
	 * 
	 * You can assume the student team name is unique.
	 * 
	 * (for individual assignment): the student names should be students that have
	 * been already added
	 * 
	 * PAIR ASSIGNMENT: implicitly create students if they don't exist
	 * 
	 * @param teamName    name of new team
	 * @param memberNames a list of student names that belong to the team
	 * @return "ok" if success
	 */
	private String handleAddTeam(String teamName, ArrayList<String> memberNames)
	{
		ArrayList<Student> s = new ArrayList<Student>();
		for(int i=0;i<memberNames.size();i++)
		{
			Student stud = getStudentByName(memberNames.get(i));
			if(stud == null)
			{
				stud = new Student(memberNames.get(i));
				students.add(stud);
			}
			s.add(stud);
		}
		Team t = new Team(teamName, s);
		
		for(int i = 0; i<s.size(); i++)
		{
			s.get(i).addTeam(t);
		}
		
		teams.add(t);
		return "ok";
	}

	/**
	 * Returns the student from students with the particular name, null otherwise
	 * (e.g., if the student does not exist).
	 * 
	 * You'll find this method handy when writing addTeam and getAverage.
	 * 
	 * @param name the name of the student for whom to search
	 * @return student object with the name or null
	 */
	public Student getStudentByName(String name)
	{
		for(int i = 0; i<students.size();i++)
		{
			if(students.get(i).getName().contentEquals(name))
			{
				return students.get(i);
			}
		}
		return null;
	}

	public Team getTeamByName(String teamName)
	{
		for(int i = 0; i<teams.size();i++)
		{
			if(teams.get(i).getTeamName().contentEquals(teamName))
			{
				return teams.get(i);
			}
		}
		return null;
	}
	/**
	 * Adds a grade to all the students on the given team.
	 * 
	 * You can assume the team has already been created.
	 * 
	 * @param teamName the team to add the grade to
	 * @param grade    the grade to add
	 * @return "ok" if successful
	 */
	private String handleAddGrade(String teamName, double grade)
	{
		getTeamByName(teamName).addGrade(grade);
		return "ok";
	}

	/**
	 * Returns the average for a particular student as a string.
	 * 
	 * NOTE the result should be ROUNDED to the nearest whole number Check out
	 * Long.toString and Math.round
	 * 
	 * NOTE if a student has no grades, the student's average should be 0
	 * 
	 * @param studentName name of student
	 * @return average grade as string, rounded to nearest whole number
	 */
	private String handleGetAverage(String studentName)
	{
		Student temp = getStudentByName(studentName);
		double avg = temp.getStudentAverage();
		int average = (int) Math.round(avg);
		String stringAvg = Integer.toString(average);
		return stringAvg;
	}

	/**
	 * 
	 * Patners with Thomas Hoevener
	 * 
	 * Returns the team name with the best average on all grades for that team
	 * 
	 * PAIR ASSIGNMENT
	 * 
	 * THIS PART OF THE ASSIGNMENT MAY BE done in pairs with another student. Be
	 * sure to note who you paired with in a comment. You don't have to pair if you
	 * don't want to.
	 * 
	 * NOTE that "best team" is different from the team with the best students. The
	 * average is for the grades FOR THAT TEAM - not including other grades that
	 * students on that team might have.
	 * 
	 * Say, for example, there is a team that had one grade of 100. Then that TEAM's
	 * average should be 100, even if each of the members of the team got grades
	 * with other groups. You'll have to keep track of additional info to determine
	 * each team's average grades.
	 * 
	 * If a team has no grades, it's average should be considered to be 0.
	 * 
	 * If several teams have exactly the same average, any one of them may be
	 * returned as the best group.
	 * 
	 * If no teams exist, you can return an error.
	 * 
	 * @return the name of the team with the best overall average
	 */
	private String handleGetBestTeam()
	{
		double bestAvg = 0.0;
		String bestTeam = "";
		for(int i =0; i<teams.size();i++)
		{
			if(teams.get(i).getTeamAverage() > bestAvg)
			{
				bestAvg = teams.get(i).getTeamAverage();
				bestTeam = teams.get(i).getTeamName();
			}
		}
		if(bestTeam == "")
		{
			return "error";
		}
		return bestTeam;
	}

	/**
	 * Decodes a command and invokes the right method.
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit
	 * 
	 * You don't have to understand how this function works, and you don't have to
	 * change it. But it's not that hard - feel free to figure it out if you like.
	 * 
	 * @param command The command to decode
	 * @return the results of the command. "ok" if success but no result.
	 */
	public String handleCommand(String command)
	{
		Scanner input = new Scanner(command);
		String commandType = input.next();

		if (commandType.equals("add-student"))
		{
			String studentName = input.next();
			input.close();
			return handleAddStudent(studentName);
		}

		if (commandType.equals("add-absence"))
		{
			String studentName = input.next();
			input.close();
			return handleAddAbsence(studentName);
		}

		if (commandType.equals("get-absences"))
		{
			String studentName = input.next();
			input.close();
			return handleGetAbsences(studentName);
		}

		if (commandType.equals("add-team"))
		{
			String teamName = input.next();
			ArrayList<String> memberNames = new ArrayList<String>();
			while (input.hasNext())
			{
				memberNames.add(input.next());
			}
			input.close();
			return handleAddTeam(teamName, memberNames);
		}

		if (commandType.equals("add-grade"))
		{
			String teamName = input.next();
			double grade = input.nextDouble();
			input.close();
			return handleAddGrade(teamName, grade);
		}

		if (commandType.equals("get-average"))
		{
			String studentName = input.next();
			input.close();
			return handleGetAverage(studentName);
		}

		if (commandType.equals("get-best-team"))
		{
			input.close();
			return handleGetBestTeam();
		}

		if (commandType.equals("exit"))
		{
			System.exit(0);
		}

		input.close();
		return "Unknown command " + commandType;
	}

	/**
	 * 
	 * Run the TeamGradebook in console mode (that is, input is to come from the
	 * console).
	 * 
	 * THIS METHOD IS WRITTEN FOR YOU - no need to edit
	 * 
	 * @param args Command line arguments (ignored)
	 */
	public static void main(String[] args)
	{
		TeamGradebook book = new TeamGradebook();
		System.out.println("Welcome to Team gradebook.  Enter commands.  Type 'exit' to end.");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true)
		{
			String commandLine = scanner.nextLine();
			String result = book.handleCommand(commandLine);
			System.out.println(result);
		}

	}

}
