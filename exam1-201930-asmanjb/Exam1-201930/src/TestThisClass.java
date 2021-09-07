import java.util.Arrays;

public class TestThisClass
{

	/**
	 * Make sure to create a JUnit Test called TestThisClassTest.java which tests
	 * the following method using at least FOUR different cases. Make sure they are
	 * testing different categories of possibilities.
	 * 
	 * 
	 * 
	 * Given a number, determine how many multiples of two are in it's prime
	 * factorization. In other words, how many times can it be evenly divide by 2.
	 * This should work for positive or negative numbers.
	 * 
	 * For example: countTwoMultiples( 2) -> 1 countTwoMultiples( 1) -> 0
	 *
	 * @param number to count the number multiples of 2
	 * @return number of times the number can be evenly divided by 2
	 */
	public static int countTwoMultiples(int number)
	{
		if (number == 0)
		{
			return 0;
		}
		else if (number == 2)
		{
			return 1;
		}
		else if (number % 2 != 0)
		{
			return 0;
		}
		else
		{
			return 1 + countTwoMultiples(number / 2);
		}

	}
}
