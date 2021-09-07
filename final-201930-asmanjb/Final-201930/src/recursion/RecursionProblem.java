package recursion;

public class RecursionProblem {

	/**
	 * Problem:
	 * Given a composite integer N, recursively determine if its
	 * largest factor < N is also a composite.  Return true if so, 
	 * false if otherwise.  (Composite numbers are non-prime numbers.)
	 * 
	 * Examples (and test cases):
	 * 
	 * N = 4  false because its only factors are 2 and 2, both prime.
	 * N = 8  true because its largest factor, 4, is also a composite.
	 * N = 45  true because its largest factor, 15, is also a composite.
	 * N = 77  false because its largest factor, 11, is prime.
	 * N = 99  true because its largest factor, 33, is also a composite.
	 * N = 7  false because it is a prime number.
	 * N = 1  false.
	 * 
	 * For this problem, we give you the primary method, which is
	 * not recursive, but which calls a recursive method to find
	 * the largest factor of an integer.  You should change only 
	 * the code in this second, recursive routine, "findLargestFactor":
	 */
	
	public static boolean hasCompositeFactor(int composite) {
		int largestFactor = findLargestFactor(composite, composite/2);
		int largestFactorOfFactor = findLargestFactor(largestFactor, largestFactor/2);
		if (largestFactorOfFactor > 1) {
			return true;
		} else {
			return false;			
		}
	}
	
	public static int findLargestFactor(int myComposite, int factor) {
		if(myComposite <= 1) {
			return 1;
		}
		else {
			if(myComposite % factor == 0) {
				return findLargestFactor(myComposite/factor,factor);
			}
			else {
				return factor;
			}
		}
	}

}
