package refactoring;

import java.util.ArrayList;

public class FarmingMain {
	
	public static final int YEARS_TO_GROW_TREES = 3;
	
	public static void main(String[] args) {
		// TODO reconfigure design to use different organization
		ArrayList<Object> plants = new ArrayList<Object>();
		ArrayList<Tree> trees = new ArrayList<Tree>();
		ArrayList<Plant> fruitPlants = new ArrayList<Plant>();
		
		Tree appleTree = new AppleTree();
		Tree oakTree = new OakTree();
		StrawberryPlant strawberryPlant = new StrawberryPlant();
		
		plants.add(appleTree);
		plants.add(oakTree );
		plants.add(strawberryPlant );
		
		trees.add(appleTree);
		trees.add(oakTree);
		
		fruitPlants.add((Plant) appleTree);
		fruitPlants.add((Plant) strawberryPlant);
		
		//grow all of the trees
		//hint - you might not want to pass in all objects!
		growTrees(trees, YEARS_TO_GROW_TREES );
		
		//harvest all things that can be harvested
		//hint - you might not want to pass in all objects!
		harvestAll(fruitPlants);
		
		//sell all the trees for lumber
		//hint - you might not want to pass in all objects!
		sellAllForLumber(trees);
		

	}

	/**
	 * 
	 * Call grow on all objects in list that can be grown.
	 * 
	 * @param objects
	 * @param years
	 */
	private static void growTrees(ArrayList<Tree> trees, int years) {
		for ( int y=0; y< years; y++) {
			for (Tree t: trees) {
				System.out.println("Growing " + t);
				t.grow();
			}
		}
	}
	
	/**
	 * 
	 * @param objects
	 */	
	private static void sellAllForLumber(ArrayList<Tree> trees) {
		for (Tree t: trees) {
			int money = t.sellAsLumber();
			System.out.println("Selling " + t + " for $" + money + ".");
		}
	}

	/**
	 * Call harvest on all objects in list that can be harvested
	 * 
	 * @param objects
	 */
	private static void harvestAll(ArrayList<Plant> fruitPlants) {
		for (Plant f: fruitPlants) {
			int money = f.harvestFruit();
			System.out.println("Harvesting " + f + " for $" + money + ".");
		}
	
	}
}
