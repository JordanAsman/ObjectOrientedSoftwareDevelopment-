package hashmap;

import java.util.ArrayList;
import java.util.HashMap;



public class HashMapProblem {
	/**
	 * @author Jason Yoder
	 * 
	 * You are given a Hashmap that effectively provides a social media network.
	 * The key is the username of a person, and the value is an ArrayList of 
	 * those that the username follows.
	 * 
	 * You need to identify the username of the person that has the most 
	 * *influence*. 
	 * 
	 * The influence for an individual is their total number of followers. 
	 * (NOT who they follow, the number of people who follow THEM.)
	 * 
	 * 
	 * For example:
	 *                        A follows B and C        B follows A,C and E
	 * findMostInfluential( { A -> [B,C],              B -> [A,C,E] } )  returns C
	 * 		->   C is followed by A and B (2), so C has the most followers
	 * 
	 * findMostInfluential( { A -> [B,C],  B -> [A], C -> [B] } )  returns B
	 * 		-> B has two followers, (A and C each has 1 follower)
	 * 
	 * 
	 * @param A HashMap<String, ArrayList<String>> showing who follows who
	 * @return the username of the most influential person
	 */
	public static String findMostInfluential( HashMap<String, ArrayList<String>> followMap ) {
		int followersCount = 0;
		for(String key : followMap.keySet()) {
			
		}
		return null;
	}
	
	
}
