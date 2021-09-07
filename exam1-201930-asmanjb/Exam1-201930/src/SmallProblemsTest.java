import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SmallProblemsTest {

	@Test
	public void testGetEvennessArray() {
		ArrayList<Integer> ex1 = new ArrayList<>();
		int[] a1 =  {1,2,3};
		for ( int a: a1) {
			ex1.add(a);
		}
		
		
		boolean[] ac1 = SmallProblems.getEvennessArray(ex1);
		assertEquals( Arrays.toString(ac1), Arrays.toString( new boolean[] {false, true, false} )   );
		
		
		ArrayList<Integer> ex2 = new ArrayList<>();
		int[] a2 =  {2};
		for ( int a: a2) {
			ex2.add(a);
		}
		boolean[] ac2 = SmallProblems.getEvennessArray(ex2);
		assertEquals( Arrays.toString(ac2), Arrays.toString( new boolean[] {true} )   );
		
		ArrayList<Integer> ex3 = new ArrayList<>();
		int[] a3 =  {};
		boolean[] ac3 = SmallProblems.getEvennessArray(ex3);
		assertEquals( Arrays.toString(ac3), Arrays.toString( new boolean[] {} )   );

		
		ArrayList<Integer> ex4 = new ArrayList<>();
		int[] a4 =  {77};
		for ( int a: a4) {
			ex4.add(a);
		}
		boolean[] ac4 = SmallProblems.getEvennessArray(ex4);
		assertEquals( Arrays.toString(ac4), Arrays.toString( new boolean[] {false} )   );
	
	}

	@Test
	public void testexchangeCharacters() {


		assertEquals("a", SmallProblems.removeThirdLetters("a"));
		
		assertEquals("ab", SmallProblems.removeThirdLetters("ab"));
		
		assertEquals("coe", SmallProblems.removeThirdLetters("code"));
		
		assertEquals("laps", SmallProblems.removeThirdLetters("lamps"));

		assertEquals("prblm", SmallProblems.removeThirdLetters("problem"));
		
		assertEquals("prblms", SmallProblems.removeThirdLetters("problems!"));
	}
	

}
