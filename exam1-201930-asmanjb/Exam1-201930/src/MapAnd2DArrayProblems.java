import java.util.ArrayList;
import java.util.HashMap;

/**
 * There are 3 problems in this file about maps, arrays, and array lists. Do all
 * 3. They have a test file to test your results. Your goal is to pass as many
 * of these tests as possible, with code that makes sense to solve the general
 * problems. DO NOT change the test file. Each problem has listed how many
 * points it is worth.
 */

public class MapAnd2DArrayProblems
{

	/**
	 * 1. (7 points) Use a hash map to find the most commonly occurring char in a
	 * String. If given a null or empty string, output the char '\0'. Yes, this is
	 * one character.
	 * 
	 * Example: Input is "abcdefgcbabaaefacxcccc", output is char 'c'.
	 * 
	 * Special case examples: Input is "", output is char '\0'. Input is "a", output
	 * is char 'a'. Input is "abcdebaceba", output is either 'a' or 'b'.
	 * 
	 * Note: There are other ways to solve this, but we ask you to use a hash map as
	 * a key part of your solution.
	 * 
	 * Do not change the first line of this method (method signature).
	 */

	public static char findMostFrequentOccurringLetter(String string)
	{
		HashMap<Character,Integer> myMap = new HashMap<Character,Integer>();
		for(int i=0;i<string.length();i++)
		{
			if(myMap.containsKey(string.charAt(i)))
			{
				int x = myMap.get(string.charAt(i));
				myMap.put(string.charAt(i),x+1);
			}
			else
			{
				myMap.put(string.charAt(i), 1);
			}
		}
		char mostFrequent = '\0';
		int mostOften = 0;
		char mostFrequent2 = ' ';
		for(Character key:myMap.keySet())
		{
			if(myMap.get(key) > mostOften)
			{
				mostFrequent = key;
				mostOften = myMap.get(key);
			}
			else if(myMap.get(key) == mostOften)
			{
				mostFrequent2=key;
			}
		}
		if(mostFrequent2 != ' ')
		{
			mostFrequent = (char) (mostFrequent + mostFrequent2);
		}
		// TODO: Enter your code here, and replace the return statement
		return mostFrequent;
	}

	/**
	 * 2. (6 points) Flip a square array of strings, so that its rows are now
	 * columns, in the same order top-to-bottom as they were left-to-right in the
	 * original array. If the input array is not square, return null to signify an
	 * error. "Square" means the same length for both dimensions of the array.
	 * 
	 * Example: Input is { {"0","1","2"}, {"3","4","5"}, {"6","7","8"} }, Output is
	 * { {"0","3","6"}, {"1","4","7"}, {"2","5","8"} }.
	 * 
	 * Special case examples: Input is { {"0","1"}, {"3","4"}, {"6","7"} }, which is
	 * not "square", Output is null. Input is {{"0"}}, a one-element case, Output is
	 * {{"0"}}.
	 * 
	 * Do not change the first line of this method (method signature).
	 */

	public static String[][] turnSideways(String[][] inputArray)
	{
		int row = inputArray.length;
		int col = inputArray[0].length;
		if(row == col)
		{
			String[][] answer = new String[row][col];
		
			for(int r=0;r<row;r++) 
			{
				for(int c=0;c<col;c++)
				{
					answer[r][c] = inputArray[c][r];
				}
			}
		return answer;
		}
		else
			return null;
	}

	/**
	 * 3. (7 points) You are playing a turn-taking game where, every time one player
	 * has a turn, the next player is skipped. The player after them then has a
	 * turn. In the game itself, they sit in a circle, which makes that easy.
	 * 
	 * However, in your computer version of this game, the players are represented
	 * by an array list. Create the method that has, as inputs, this array list of
	 * players, in order, and the name of the player who just had a turn. You should
	 * output the name of the next player who should play, skipping one player. If
	 * the name of the player who just had a turn is not in the array list, you
	 * should return "Error".
	 *
	 * Example: ArrayList has names "A", "B", "C", "D", "E", "F". First case: Player
	 * "C" has just had their turn. Skipping "D", you should return "E". Second
	 * case: Player "E" has just had their turn. You should skip "F" and return "A".
	 * Third case: Player "F" has just had their turn. You should skip "A" and
	 * return "B". Fourth case: Input says player "Dave" has just had their turn.
	 * You should return "Error".
	 * 
	 * Special case examples: ArrayList has only the names "A" and "B", and "A" has
	 * just had their turn. Skipping "B", you should return "A". ArrayList has only
	 * the name "A", and "A" has just had their turn. Skipping "A", you should
	 * return "A". ArrayList is empty, and input says player "A" has just had their
	 * turn. You should return "Error".
	 * 
	 * Do not change the first line of this method (method signature).
	 */

	public static String returnNextPlayer(ArrayList<String> inputList, String whoseTurn)
	{
		String answer ="";
		
		int exists = 0;
		for(int j=0;j<inputList.size();j++)
		{
			if(inputList.get(j).contentEquals(whoseTurn))
			{
				exists++;
			}
		}
		if(exists != 0)
		{
			int count = 0;
			for(int i=0;i<inputList.size();i++)
			{
				if(inputList.size()==1)
				{
					answer = inputList.get(i);
				}
				else
				{
					if(inputList.get(i).equals(whoseTurn))
					{
						if(count==inputList.size()-1)
						{
							answer=inputList.get(1);
						}
						else if(count == inputList.size()-2)
						{
							answer=inputList.get(0);
						}
						else
						{
							answer=inputList.get(i+2);
						}
					}
					else
					{
						count++;
					}
				}
			}
		}
		else
			answer = "Error";
		
		// TODO: Enter your code here, and replace the return statement
		return answer;
	}

}
