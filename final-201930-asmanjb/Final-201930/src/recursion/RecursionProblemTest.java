package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

import hashmap.HashMapProblem;

public class RecursionProblemTest {

	@Test
	public void test() {
		assertEquals(false, RecursionProblem.hasCompositeFactor(4));
		assertEquals(true, RecursionProblem.hasCompositeFactor(8));
		assertEquals(true, RecursionProblem.hasCompositeFactor(45));
		assertEquals(false, RecursionProblem.hasCompositeFactor(77));
		assertEquals(true, RecursionProblem.hasCompositeFactor(99));
		assertEquals(false, RecursionProblem.hasCompositeFactor(7));
		assertEquals(false, RecursionProblem.hasCompositeFactor(1));
	}

}
