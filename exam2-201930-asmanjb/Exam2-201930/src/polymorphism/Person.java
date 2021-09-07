package polymorphism;

import java.util.ArrayList;

public abstract class Person 
{
	private String name;
	private int age;
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public abstract void work();
	
	public String toString()
	{
		String whoAmI = "I am " + this.name + " and I am " + this.age + " years old.";
		return whoAmI;
	}
}
