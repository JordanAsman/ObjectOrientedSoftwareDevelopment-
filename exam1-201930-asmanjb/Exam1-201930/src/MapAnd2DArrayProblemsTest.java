import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * This is the test file for MapAnd2DArrayProblems.java.
 * Run JUnit on it to test your answers to those 3 problems.
 * DO NOT change this test file.
 */
public class MapAnd2DArrayProblemsTest {

	/*
	 * objects for doing test cases
	 */
	static ArrayList<String> inputList1 = new ArrayList<>(); // for returnNextPlayer



	// ********************************************************************

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		inputList1.add("A");
		inputList1.add("B");
		inputList1.add("C");
		inputList1.add("D");
		inputList1.add("E");
		inputList1.add("F");
		}

	
	@Test
	public void testFindMostFrequentOccurringLetterMain() {
		String myString = "abcdefgcbabaaefacxcccc"; // for findMostFrequentOccurringLetter
		char fMFOL1Ans = MapAnd2DArrayProblems.findMostFrequentOccurringLetter(myString);
		assertEquals('c', fMFOL1Ans);
	}
	@Test
	public void testFindMostFrequentOccurringLetterNull() {
		String myString = ""; // null string
		char fMFOL2Ans = MapAnd2DArrayProblems.findMostFrequentOccurringLetter(myString);
		assertEquals('\0', fMFOL2Ans);
	}
	@Test
	public void testFindMostFrequentOccurringLetter1Char() {
		String myString = "a"; // one-char string
		char fMFOL3Ans = MapAnd2DArrayProblems.findMostFrequentOccurringLetter(myString);
		assertEquals('a', fMFOL3Ans);
	}
	@Test
	public void testFindMostFrequentOccurringLetterMultAnswers() {		
		String myString = "abcdebaceba"; // multiple choices - picks any that is max
		char fMFOL4Ans = MapAnd2DArrayProblems.findMostFrequentOccurringLetter(myString);
		assertTrue('b' == fMFOL4Ans || 'a' == fMFOL4Ans);
	}

	@Test
	public void testTurnSidewaysMain() {
		String mySquareArray[][] = {{"0","1","2"},{"3","4","5"},{"6","7","8"}}; // for turnSideways
		String[][] TS1Ans = MapAnd2DArrayProblems.turnSideways(mySquareArray);
		String[][] correctAns = {{"0","3","6"},{"1","4","7"},{"2","5","8"}};
		for (int i=0;i<TS1Ans.length;i++) {
			for (int j=0;j<TS1Ans.length;j++) {
				assertEquals(TS1Ans[i][j],correctAns[i][j]);				
			}
		}
	}
	@Test
	public void testTurnSidewaysError() {
		String myErrorArray[][] = {{"0","1"},{"3","4"},{"6","7"}}; // not square
		String[][] TS2Ans = MapAnd2DArrayProblems.turnSideways(myErrorArray);
		String[][] correctAns1 = null;
		boolean outcome = (TS2Ans == correctAns1);
		assertTrue(outcome);
	}
	@Test
	public void testTurnSidewaysOneElement() {
		String mySmallSquareArray[][] = {{"0"}}; // just one element
		String[][] TS3Ans = MapAnd2DArrayProblems.turnSideways(mySmallSquareArray);
		boolean outcome1 = TS3Ans[0][0].equals("0");
		assertTrue(outcome1);
	}

	@Test
	public void testReturnNextPlayerMain1() {
		String TRNP1Test = MapAnd2DArrayProblems.returnNextPlayer(inputList1,"C");
		assertEquals("E", TRNP1Test);
	}
	@Test
	public void testReturnNextPlayerMain2() {
		String TRNP1Test = MapAnd2DArrayProblems.returnNextPlayer(inputList1,"E");
		assertEquals("A", TRNP1Test);
	}
	@Test
	public void testReturnNextPlayerMain3() {
		String TRNP1Test = MapAnd2DArrayProblems.returnNextPlayer(inputList1,"F");
		assertEquals("B", TRNP1Test);
	}
	@Test
	public void testReturnNextPlayerMainError() {
		String TRNP1Test = MapAnd2DArrayProblems.returnNextPlayer(inputList1,"DAVE");
		assertEquals("Error", TRNP1Test);
	}		
	@Test
	public void testReturnNextPlayer2Element() {
		ArrayList<String> inputList2 = new ArrayList<>(); // two-element list
		inputList2.add("A");
		inputList2.add("B");
		String TRNP2Test = MapAnd2DArrayProblems.returnNextPlayer(inputList2,"B");
		assertEquals("B", TRNP2Test);
	}		
	@Test
	public void testReturnNextPlayer1Element() {
		ArrayList<String> inputList3 = new ArrayList<>(); // one-element list
		inputList3.add("A");
		String TRNP3Test = MapAnd2DArrayProblems.returnNextPlayer(inputList3,"A");
		assertEquals("A", TRNP3Test);
	}
	@Test
	public void testReturnNextPlayerVoidList() {
		ArrayList<String> inputList4 = new ArrayList<>(); // empty list
		String TRNP4Test = MapAnd2DArrayProblems.returnNextPlayer(inputList4,"A");
		assertEquals("Error", TRNP4Test);

	}

}
