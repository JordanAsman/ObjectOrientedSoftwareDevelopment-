package polymorphism;

public class Student extends Person
{

	private String name;
	private int age;
	private String school;
	private double gpa;

	public Student(String name, int age, String school, double gpa)
	{
		super(name,age);
		this.school = school;
		this.gpa = gpa;
	}

	public int getAge()
	{
		return super.getAge();
	}

	public String getName()
	{
		return super.getName();
	}

	public void work()
	{
		System.out.println(this.getName() + ": I do not work.  I focus on my studies");

	}

	private String aboutMe()
	{
		return " I attend " + school + " and have a " + this.gpa + " GPA.";
	}

	@Override
	public String toString()
	{
		//String whoAmI = "I am " + this.name + " and I am " + this.age + " years old.";
		return super.toString() + this.aboutMe();
	}

}
