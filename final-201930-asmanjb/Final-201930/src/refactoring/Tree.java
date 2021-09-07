package refactoring;

public abstract class Tree 
{
	protected int ageInYears;
	protected int heightInFeet;
	
	public Tree() {
		this.ageInYears = 0;
		this.heightInFeet = 0;
	}
	
	public void grow() {
		this.ageInYears += 1;
		this.heightInFeet = (heightInFeet + 1) * 2;
	}
	public int getHeightInFeet() {
		return this.heightInFeet;
	}
	public int getAge() {
		return this.ageInYears;
	}
	
	@Override
	public String toString() {
		return "" + this.ageInYears;
	}
	
	public int sellAsLumber() {
		return this.getHeightInFeet();
	}
}
