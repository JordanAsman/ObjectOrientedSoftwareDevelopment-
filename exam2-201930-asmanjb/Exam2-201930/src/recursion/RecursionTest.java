package recursion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;




/**
 * 
 * @author chenowet
 *
 * These are the tests that verify the code you wrote in Recursion.java.
 * They exactly match the examples shown there.
 * Do not change anything in this file, except to comment-out tests
 * for the one problem you choose to omit.
 * 
 */

public class RecursionTest {
    
    static int[] testMostLeast1 = {1,2,3,4,3,4,5,5,4};
    static int[] testMostLeast2 = {1,2,2};
    static int[] testMostLeast3 = {1};
    static int[] testMostLeast4 = {1,2,2,1,2,1};
    static int[] testMostLeast5 = {};
    
    static String testThe1 = "The cat in the hat.";
    static String testThe2 = "Last the is buried in the word themfinethingstheyis.";
    static String testThe3 = "None to find here.";
    static String testThe4 = "How about at the end? the";
    
    // Tests for Problem 1:  
    
    @Test
    public void sumCubes0() {
        int answer0 = Recursion.sumCubes(0);
        assertEquals(0, answer0);
    }
    
    @Test
    public void sumCubes1() {
        int answer1 = Recursion.sumCubes(1);
        assertEquals(1, answer1);
    }
    @Test
    public void sumCubes2() {
        int answer2 = Recursion.sumCubes(2);
        assertEquals(9, answer2);
    }
    @Test
    public void sumCubes6() {
        int answer6 = Recursion.sumCubes(6);
        assertEquals(441, answer6);
    }

    // Tests for Problem 2:  

    @Test
    public void fibDeluxe1() {
        int fibAnswer1 = Recursion.fibDeluxe(1);
        assertEquals(1, fibAnswer1);
    }
    @Test
    public void fibDeluxe2() {
        int fibAnswer2 = Recursion.fibDeluxe(2);
        assertEquals(1, fibAnswer2);
    }
    @Test
    public void fibDeluxe3() {
        int fibAnswer3 = Recursion.fibDeluxe(3);
        assertEquals(2, fibAnswer3);
    }
    @Test
    public void fibDeluxe4() {
        int fibAnswer4 = Recursion.fibDeluxe(4);
        assertEquals(4, fibAnswer4);
    }
    @Test
    public void fibDeluxe9() {
        int fibAnswer9 = Recursion.fibDeluxe(9);
        assertEquals(128, fibAnswer9);
    }
    
    // Tests for Problem 3:  

    @Test
    public void commons1() {
        int[] commonsAnswer1 = Recursion.commons(testMostLeast1);
        assertEquals(4, commonsAnswer1[0]);
        assertEquals(1, commonsAnswer1[1]);
    }
    @Test
    public void commons2() {
        int[] commonsAnswer2 = Recursion.commons(testMostLeast2);
        assertEquals(2, commonsAnswer2[0]);
        assertEquals(1, commonsAnswer2[1]);
    }
    @Test
    public void commons3() {
        int[] commonsAnswer3 = Recursion.commons(testMostLeast3);
        assertEquals(1, commonsAnswer3[0]);
        assertEquals(1, commonsAnswer3[1]);
    }
    @Test
    public void commons4() {
        int[] commonsAnswer4 = Recursion.commons(testMostLeast4);
        boolean most4 = (commonsAnswer4[0] == 1) || (commonsAnswer4[0] == 2);
        boolean least4 = (commonsAnswer4[0] == 1) || (commonsAnswer4[0] == 2);
        assertTrue(most4);
        assertTrue(least4);
    }
    @Test
    public void commons5() {
        int[] commonsAnswer5 = Recursion.commons(testMostLeast5);
        assertEquals(-2147483648, commonsAnswer5[0]);
        assertEquals(2147483647, commonsAnswer5[1]);
    }
   
    // Tests for Problem 4:  

    @Test
    public void lastThe1() {
        int lastTheAnswer1 = Recursion.lastThe(testThe1);
        assertEquals(11, lastTheAnswer1);
    }
    public void lastThe2() {
        int lastTheAnswer2 = Recursion.lastThe(testThe2);
        assertEquals(45, lastTheAnswer2);
    }
    public void lastThe3() {
        int lastTheAnswer3 = Recursion.lastThe(testThe3);
        assertEquals(-1, lastTheAnswer3);
    }
    public void lastThe4() {
        int lastTheAnswer4 = Recursion.lastThe(testThe4);
        assertEquals(22, lastTheAnswer4);
    }
    
}
