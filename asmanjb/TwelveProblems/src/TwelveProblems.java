import java.util.ArrayList;

public class TwelveProblems
{

	/**
	 * Given a particular point in the coordinate plane, compute the point's
	 * distance from the origin (0,0)
	 * 
	 * For example
	 * 
	 * distanceFromOrigin(-1,0) returns 1 distanceFromOrigin(77,77) returns 108.894
	 * distanceFromOrigin(-3,-4) returns 5
	 * 
	 * Google for Java square root to figure out how to do it
	 */
	public static double distanceFromOrigin(double x, double y)
	{
		double sol;
		sol = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return sol;
	}

	/**
	 * Determine if a given positive integer has a 5 in the second rightmost digit
	 * 
	 * For example:
	 * 
	 * 5 returns false 52 returns true 151 returns true 30050 returns true 5000
	 * returns false
	 * 
	 * Hint: you'll want to use the modulus operator % and the division operation /
	 * See section 4.2.3 for details. Don't convert the number to a string!
	 * 
	 * Bonus Hint: you usually should not use an if statement to return a boolean
	 * 
	 * if (x % 2 == 0) { // checks if x is even return true; } else { return false;
	 * }
	 * 
	 * Instead, just return the result of the boolean test directly
	 * 
	 * return x % 2 == 0; //returns true or false
	 * 
	 * @param input
	 * @return
	 */
	public static boolean secondDigit5(int input)
	{
		int k = input/10;
		return(k%5==0 && k%10 != 0);
	}

	/**
	 * Determine if a given string ends with an uppercase letter.
	 * 
	 * For example:
	 * 
	 * endsWithUppercase("dog") returns false endsWithUppercase("doG") returns true
	 * endsWithUppercase("") returns false
	 * 
	 * Note that you can check if a particular char is uppercase like this:
	 * 
	 * char myChar = 'A'; if(Character.isUpperCase(myChar)) {
	 * System.out.println("uppercase!"); }
	 * 
	 * Note that the empty string is considered not to end with an uppercase letter.
	 * 
	 * Requires if statements, strings
	 */
	public static boolean endsWithUpperCaseLetter(String input)
	{
		if(input.length()>0)
		{
			String n = input.substring(input.length()-1);
			return(n.toUpperCase().equals(n));
		}
		return false;
	}

	/**
	 * Returns the first number taken to the power of the second number
	 * 
	 * For example pow(2,3) returns 2^3 or 8
	 * 
	 * DO NOT USE FUNCTIONS in Math (yes, Math.pow is how you would really do it)
	 * Instead, write this code yourself as practice.
	 * 
	 * Don't forget about negative powers! But both parameters are integers, so you
	 * don't need to worry about fractional powers.
	 * 
	 * Hint: if you want to get the reciprocal of an integer, do it like this
	 * 1.0/coolInt not like this 1/coolInt
	 * 
	 * Why? See section 4.2.3 in your book
	 * 
	 * Requires: for loops
	 */
	public static double pow(int num, int power)
	{
		double soln = 1.0;

		if(power>0 || power==0)
		{
			for (int i = 0; i < power; i++)
			{
				soln = soln * (double) num;
			}
			return soln;
		}
		else
		{
			for (int i = 0; i > power ; i--)
			{
				soln = soln * (1/((double)num));
			}
			return soln;
		}
	}

	/**
	 * Given two strings of the same length, returns the index at which the strings
	 * first differ. If the strings are equal the function should return -1.
	 * 
	 * For example: firstDifference("abc", "axy") returns 1 firstDifference("aby",
	 * "abz") returns 2 firstDifference("foo", "bar") returns 0
	 * firstDifference("ninja", "ninja") returns -1 firstDifference("","") returns
	 * -1
	 * 
	 * You don't need to worry about inputs of different lengths.
	 * 
	 * Hint: if you want to compare the two strings to see if they are equal. For
	 * example, something like this:
	 * 
	 * if(one.equals(two)) return -1;
	 * 
	 * Individual characters however, should be compared with == char a =
	 * one.charAt(0); char b = two.charAt(0); if(a == b) { System.out.println("First
	 * characters are equal"); }
	 * 
	 * Requires: for loops or while loops, strings
	 */
	public static int firstDifference(String one, String two)
	{
		int a = 0;
		int b = 0;
		for (int i = 0; i < one.length(); i++)
		{
			if (one.substring(i, i + 1).equals(two.substring(i, i + 1)))
			{
				a++;
			} else
			{
				b++;
			}
		}
		if (a == one.length())
		{
			return -1;
		}
		return one.length() - b;
	}

	/**
	 * Given one string, return the most common character.
	 * 
	 * Example: mostCommonCharacter("aaab") returns 'a'
	 * mostCommonCharacter("abcbcdc") returns 'c'
	 * 
	 * You can assume that your string will not be empty and that one character will
	 * be more common than all the others (i.e. there won't be a tie for the most
	 * common character)
	 * 
	 * Your solution should use a pair of nested for loops. You might be tempted to
	 * use something like python's dictionary here, but we'll save that till later
	 * when we cover hashmaps.
	 * 
	 * Requires: for loops, strings
	 */
	public static char mostCommonCharacter(String input)
	{
		char max = ' ';
		String a ="";
		int maxCount = 0;
		int count = 0;
		
		for(int i=0;i<input.length();i++)
		{
			a =input.substring(i,i+1);
			for(int j=i;j<input.length();j++)
			{
				if(a.contentEquals(input.substring(j,j+1)))
				{
					count++;
				}
				if(count>maxCount)
				{
					maxCount = count;
					max = a.charAt(0);
				}
			}
			count = 0;
		}
		return max;
	}

	/**
	 * Finds the first number in an array divisible by 77 and returns it.
	 * 
	 * If no number is found, the function returns -1
	 * 
	 * Example: firstDivisibleBy77({88,24,154,77}) returns 154
	 * firstDivisibleBy77({5929, 280}) returns 5929 firstDivisibleBy77({1,2,3,4})
	 * returns -1
	 * 
	 * Don't forget about the modulus operator (%)
	 */
	public static int firstDivisibleBy77(int[] numbers)
	{
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] % 77 == 0)
			{
				return numbers[i];
			}
		}

		return -1;
	}

	/**
	 * Creates an array of all the powers of two, up to (and including) the given
	 * exponent starting at 2^0.
	 * 
	 * If the given exponent is less than zero, return an empty array. You can do
	 * this by saying "return new int[0];"
	 * 
	 * For example: powersOfTwo(3) returns {1,2,4,8} powersOfTwo(0) returns {1}
	 * powersOfTwo(-66) returns {}
	 * 
	 * Requires: arrays, for loops
	 */
	public static int[] powersOfTwo(int maxExponent)
	{
		if (maxExponent < 0)
		{
			return new int[0];
		} else
		{
			int k = maxExponent + 1;
			int[] a = new int[k];

			for (int i = 0; i < k; i++)
			{
				a[i] = (int) Math.pow(2, i);
			}
			return a;
		}
	}

	/**
	 * Given two arrays of integers that are the same length, returns a new array
	 * that contains the pairwise max of the corresponding elements of the original
	 * arrays (i.e. the larger of the two numbers in that slot in the original
	 * arrays)
	 * 
	 * For example: maxArray({2,10},{1,200}) returns {2,200} maxArray({-5, 60,
	 * 7},{-10,400,8}) returns {-5,400,8}
	 * 
	 * Requires: arrays, for loops
	 */
	public static int[] maxArray(int[] one, int[] two)
	{
		int[] c = new int[one.length];
		
		for(int i=0;i<one.length;i++)
		{
			if(one[i]>two[i])
			{
				c[i] = one[i];
			}
			else 
			{
				c[i] = two[i];
			}
		}
		return c;
	}

	/**
	 * 
	 * Given two arrays, count the number of times the first array occurs in the
	 * second array. You can assume that the first array is shorter than the second.
	 * 
	 * For example: timesOccur({1,2}, {7,1,2,7,7,7,1,2,7}) returns 2
	 * timesOccur({1,1}, {1,1,1,3} returns 2 (in the 0th and 1st position)
	 * timesOccur({1,2}, {1,3,2,1} returns 0
	 * 
	 * Requires: arrays, nested for loops
	 */
	public static int timesOccur(int[] shorter, int[] longer)
	{
		int count = 0;
		
		for(int i=0;i<longer.length;i++)
		{
			if(longer[i]==shorter[0])
			{
				for(int j=0;j<shorter.length;j++)
				{
					if((i+j < longer.length) && longer[i+j]==shorter[j])
					{
						if(shorter.length-1==j)
						{
							count++;
						}
					}
					else
					{
						break;
					}
				}
			}
		}		
		return count;
	}

	/**
	 * Given an arraylist of strings, return a new list where any time the word
	 * "double" appears in the original list it is doubled in the new list.
	 * 
	 * For example: doubleDouble(["foo","double"]) returns ["foo","double","double"]
	 * doubleDouble(["a","double","b","double","c"]) returns
	 * ["a","double","double","b","double","double","c"]
	 * 
	 * Be careful not to modify the original list. Start by creating a new output
	 * list that holds the results! E.g.
	 * 
	 * ArrayList<String> output = new ArrayList<String>();
	 * 
	 * When you are comparing strings, be sure to use .equals and not == Eg.
	 * if(currentString .equals("double")) { stuff }
	 * 
	 */
	public static ArrayList<String> doubleDouble(ArrayList<String> input)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<input.size();i++)
		{
			list.add(input.get(i));
			if(input.get(i).equals("double"))
			{
				list.add("double");
			}
		}
		return list;
	}

	/**
	 * Given a string, return all 3 character substrings of that string in an
	 * arraylist. That is, first it will return the 1st 3 characters of the string
	 * Then it will return the 2nd 3rd and 4th characters Then it will return the
	 * 3rd 4th and 5th characters etc.
	 * 
	 * For example: threeCharacterStrings("hello") returns ["hel","ell","llo"]
	 * threeCharacterStrings("foo") returns ["foo"] threeCharacterStrings(["ab"])
	 * returns []
	 */
	public static ArrayList<String> threeCharacterStrings(String input)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<input.length()-2;i++)
		{
			list.add(input.substring(i,i+3));
		}
		return list;
	}

}
