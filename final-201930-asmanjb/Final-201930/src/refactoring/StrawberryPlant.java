package refactoring;

public class StrawberryPlant implements Plant {

	public static final int STRAWBERRY_HARVEST_VALUE = 10;
	
	public int harvestFruit() {
		return STRAWBERRY_HARVEST_VALUE;
	}
	
	@Override
	public String toString() {
		return "StrawberryPlant";
	}

}
