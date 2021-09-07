package recursion;

import java.util.HashMap;

/**
 * 
 * These problems should ALL be solved recursively - not with the use of rarely
 * used library functions, or by adding for loops or while loops that would
 * replace the recursion, or by observing some way that a direct formula could
 * be used as an alternative.
 * 
 * You can use a recursive helper function on any problem if that makes it
 * easier for you.
 * 
 * Solve any 3 of these 4 problems for full credit. No bonus points for doing
 * the 4th. :)
 *
 * The 3 problems you solve in this section are worth 6 points each, total of
 * 18.
 * 
 * The file RecursionTest.java is a JUnit file with the same test examples as
 * are described here.
 * 
 * --> See Hint: lines for tips on what to do for each problem!
 * 
 */

public class Recursion
{

	/**
	 * 1. Find the sum of the cubes of non-negative integers 0 through n. Do not
	 * change the method signature.
	 *
	 * Examples:
	 *
	 * sumCubes(0) = 0 sumCubes(1) = 1 sumCubes(2) = 1 + 8 = 9 sumCubes(6) = 1 + 8 +
	 * 27 + 64 + 125 + 216 = 441
	 *
	 */
	public static int sumCubes(int number)
	{
		if(number == 0)
		{
			return number;
		}
		else
		{
			return (int) (Math.pow(number, 3) + sumCubes(number - 1));
		}
	}

	/**
	 * 2. "fibonacci Deluxe" - Find the sum of all prior values of f(n), where f(1)
	 * = 1 and f(2) = 1.
	 * 
	 * This is equivalent to solving the mathematical function f(x) = 1 for x <= 2
	 * and 2^(x - 2) otherwise.
	 * 
	 * Do not change the method signature. You can add a for-loop in this problem if
	 * needed, as long as you still use recursion.
	 *
	 * Examples:
	 *
	 * fibDeluxe(1) = 1 (given) fibDeluxe(2) = 1 (given) fibDeluxe(3) = 1 + 1 = 2
	 * fibDeluxe(4) = 1 + 1 + 2 = 4 fibDeluxe(9) = 1 + 1 + 2 + 4 + 8 + 16 + 32 + 64
	 * = 128
	 *
	 */
	public static int fibDeluxe(int number)
	{
		if(number <= 0)
			return 0;
		if(number == 1)
			return 1;
		else
			return (int)Math.pow(2, (number-1) - 2) + fibDeluxe(number - 1);
//		int sum = 0;
//		for(int i=0;i<number;i++)
//		{
//			if(number <= 2)
//				sum = 1;
//			else
//				sum += fibHelper(i);
//		}
//		return sum;
		// TO DO: Your code here.
		// Hint: You can take advantage of knowing how to compute
		// the answer mathematically. If you do this, use recursion
		// instead of Math.pow to do that calculation.
	}
	
//	public static int fibHelper(int number)
//	{
//		if(number <= 0)
//		{
//			return 0;
//		}
//		else if(number ==1)
//		{
//			return 1;
//		}
//		else
//		{
//			return fibDeluxe(number - 1) + fibDeluxe(number - 2);
//		}
//	}

	/**
	 * 3. This function returns an array of length 2, consisting of the most common
	 * (first element) and least common (second) elements in the array of ints given
	 * as input.
	 *
	 * Examples:
	 *
	 * testMostLeast1 = {1,2,3,4,3,4,5,5,4}; commons(testMostLeast1) = {4,1} (4 is
	 * most common int, 1 is least) testMostLeast2 = {1,2,2};
	 * commons(testMostLeast2) = {2,1} testMostLeast3 = {1}; commons(testMostLeast3)
	 * = {1,1} testMostLeast4 = {1,2,2,1,2,1}; commons(testMostLeast4) = {1,1} or
	 * {2,2} or {1,2} or (2,1} testMostLeast5 = {}; commons(testMostLeast5) =
	 * {-2147483648,2147483647} (min Int and max Int for not-found)
	 *
	 */
	public static int[] commons(int[] inputArray)
	{
		int[] result = { -2147483648, 2147483647 };
		// TO DO: Your code here.
		// Hint: You may find a helper method useful.
		// A for-loop can be used, as long as you also use recursion.
//		if(inputArray.length == 0)
//		{
//			result[0] = inputArray[0];
//			result[1] = inputArray[1];
//			return result;
//		}
//		else
//		{
//			for(int i = 1; i<inputArray.length;i++)
//			{
//				if(inputArray[0] == inputArray[i])
//				{
//					
//				}
//			}
//		}
		return result;
	}

	/**
	 * 4. Find the final "the" in a String: This function returns the index of first
	 * letter of the last occurrence of the word "the" in a string. It counts if
	 * "the" is embedded in another word. "The" can be upper or lower case, or a
	 * combination.
	 *
	 * Examples:
	 *
	 * lastThe("The cat in the hat.") = 11 (index of first letter of last "the")
	 * lastThe("Last the is buried in the word themfinethingstheyis.") = 45
	 * lastThe("None to find here.") = -1 (not found condition) lastThe("How about
	 * at the end? the") = 22
	 *
	 */
	public static int lastThe(String checkString)
	{
		checkString = checkString.toLowerCase();
		if(!checkString.contains("the")) 
		{
			return -1;
		}
		if(checkString.length() <= 2)
		{
			return -1;
		}
//		else if(checkString.contains("the"))
//		{
//			return checkString.indexOf("t") + lastThe(checkString.substring(checkString.indexOf("t")));
//		}
		else
		{
			return lastTheHelper(checkString,0);//checkString.indexOf("T") + lastThe(checkString.substring(checkString.indexOf("T")));
		}
		// TO DO: Your code here
		// Hint: Feel free to invent your own helper, if needed
	}
	
	public static int lastTheHelper(String checkString,int index)
	{
		if(!checkString.contains("the"))
		{
			return index;
		}
		else
		{
			index = checkString.indexOf("the");
			return lastTheHelper(checkString.substring(index+3),index+3);
		}
	}

}
