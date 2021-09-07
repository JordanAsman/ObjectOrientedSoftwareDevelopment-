import java.util.ArrayList;

public class SmallProblems
{

	/**
	 * In this problem an ArrayList of integers is provided. You need to return an
	 * array of booleans such that the length of the array is the same as the size
	 * of the ArrayList and each entry for the array corresponds to whether the
	 * number in the corresponding location in the ArrayList is even or not.
	 * 
	 * For Example: getEvennessArray( <1, 2, 3> ) --> [false, true, false]
	 * getEvennessArray( <1> ) --> [false] getEvennessArray( <> ) --> []
	 * getEvennessArray( <44> ) --> [true]
	 *
	 * @param input - ArrayList of integers
	 * @return - boolean array indicating which numbers are even (true) and not
	 *         (false)
	 */
	public static boolean[] getEvennessArray(ArrayList<Integer> numbers)
	{
		boolean[] answer = new boolean[numbers.size()];
		for(int i = 0; i<answer.length; i++)
		{
			if(numbers.get(i)%2 == 0)
				answer[i]= true;
			else
				answer[i] = false;
		}
		return answer;
	}

	/**
	 * 
	 * Given a string, returns a new string where every third character is excluded.
	 * 
	 * You can assume that the input string will not be null.
	 * 
	 * Examples: exchangeCharacters("a") --> "a" exchangeCharacters("ab") --> "ab"
	 * exchangeCharacters("code") --> "coe" exchangeCharacters("lamps") --> "laps"
	 * exchangeCharacters("problem") --> "prblm" exchangeCharacters("problems!") -->
	 * "prblms"
	 * 
	 * 
	 * @param str string
	 * @return The new string with characters removed
	 */
	public static String removeThirdLetters(String str)
	{
		String answer = "";
		for(int i=0;i<str.length();i++)
		{
			if((i+1)%3 != 0)
			{
				answer+=str.charAt(i);
			}
		}
		// TODO complete this method
		return answer;
	}

}
