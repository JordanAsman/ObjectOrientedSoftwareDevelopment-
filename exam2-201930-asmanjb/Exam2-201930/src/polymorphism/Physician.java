package polymorphism;

public class Physician extends Person
{

	private String name;
	private int age;
	private double salary;

	public Physician(String name, int age, double salary)
	{
		super(name, age);
		this.salary = salary;
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
		String status = String.format("%s: I enjoy medical practice and earn $%.2f monthly.", this.getName(),
				salary / 12);
		System.out.println(status);
	}

//	@Override
//	public String toString()
//	{
//		return "I am " + this.name + " and I am " + this.age + " years old.";
//	}

}
