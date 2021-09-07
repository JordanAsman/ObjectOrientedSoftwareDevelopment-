package polymorphism;

public class Employee extends Person 
{

	private String name;
	private int age;
	private int empId = 0;
	private double salary;

	public Employee(String name, int age, int employeeID, double salary)
	{
		super(name,age);
		this.empId = employeeID;
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
		if (this.empId > 0)
		{
			System.out.printf("%s: my monthly salary is $%.2f%n", this.getName(), this.salary / 12);
		}
		else
		{
			System.out.println(this.getName() + ": not currently employed.");
		}

	}

	@Override
	public String toString()
	{
//		String whoAmI = "I am " + this.name + " and I am " + this.age + " years old.";
		String status = "";
		
		if (this.empId > 0)
		{
			status = " I am happily employed!!";
		}
		else
		{
			status = " Not currently working.";
		}
		return super.toString() +  status;
	}

}
