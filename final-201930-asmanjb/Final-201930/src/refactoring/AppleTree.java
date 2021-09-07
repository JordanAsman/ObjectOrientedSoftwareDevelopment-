package refactoring;

public class AppleTree extends Tree implements Plant {

	public static final int APPLE_LUMBER_VALUE_PER_FOOT = 1;
	public static final int HARVEST_VALUE_PER_AGE = 5;
	
	public AppleTree() {
		super();
	}

	public String toString() {
		return super.toString() + " year old AppleTree";
	}
	
	public int harvestFruit() {
		return this.getAge() * HARVEST_VALUE_PER_AGE;
	}

	public int sellAsLumber() {
		return super.sellAsLumber() * APPLE_LUMBER_VALUE_PER_FOOT;
	}

}
