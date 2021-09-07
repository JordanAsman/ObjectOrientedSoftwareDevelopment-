package polymorphism;

import java.util.ArrayList;

public class PersonMain
{

	private ArrayList<Student> students;
	private ArrayList<Employee> employees;
	private Physician doctor;
	private ArrayList<Person> people;

	public PersonMain()
	{
		this.students = new ArrayList<Student>();
		this.employees = new ArrayList<Employee>();
		this.people = new ArrayList<Person>();
	}

	public static void main(String[] args)
	{
		PersonMain app = new PersonMain();
		app.initializePeople();

		double totalAge = app.reportAgeForPeople(app.people);
		//totalAge += app.reportAgeForEmployees(app.employees);
		//System.out.println(app.doctor);
		//totalAge += app.doctor.getAge();
		int numberOfPersons = app.people.size();
		System.out.printf("%nAverage age = %.3f years%n%n", totalAge / numberOfPersons);

		app.reportWorkForPeople(app.people);
		//app.reportWorkForEmployees(app.employees);
		//app.doctor.work();
	}

	public void initializePeople()
	{
		this.people.add(new Student("Tom", 19, "Rose-Hulman", 3.57));
		this.people.add(new Student("Mary", 21, "Purdue", 3.7));
		this.people.add(new Employee("Donna", 35, 0, 0));
		this.people.add(new Employee("Ray", 65, 90235674, 176500));
		this.people.add(new Physician("Leah", 43, 276500));
	}

	public void reportWorkForPeople(ArrayList<Person> people)
	{
		for (Person p : people)
		{
			p.work();
		}
	}

//	public void reportWorkForEmployees(ArrayList<Employee> employees)
//	{
//		for (Employee e : employees)
//		{
//			e.work();
//		}
//	}

	public int reportAgeForPeople(ArrayList<Person> people)
	{
		int totalAge = 0;
		for (Person p : people)
		{
			System.out.println(p);
			totalAge += p.getAge();
		}
		return totalAge;
	}

//	public int reportAgeForEmployees(ArrayList<Employee> employees)
//	{
//		int totalAge = 0;
//		for (Employee e : employees)
//		{
//			System.out.println(e);
//			totalAge += e.getAge();
//		}
//		return totalAge;
//	}

}
