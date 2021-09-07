package refactoring;

public class OakTree extends Tree {

	public static final int OAK_LUMBER_VALUE_PER_SQUARED_FOOT = 10;
	
	public OakTree() {
		super();
	}

	public String toString() {
		return super.toString() + " year old OakTree";
	}
	
	public int sellAsLumber() {
		return super.sellAsLumber() * super.sellAsLumber() * OAK_LUMBER_VALUE_PER_SQUARED_FOOT;
	}
}
