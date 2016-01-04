package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 9/19/15.
 */
public class MissingNumberTest {

    MissingNumber solution = new MissingNumber();

    @Test
    public void testMissingNumber() {
        assertEquals(0, solution.missingNumber(new int[] {1}));
        assertEquals(1, solution.missingNumber(new int[] {0}));
        assertEquals(2, solution.missingNumber(new int[] {0, 1, 3}));
        assertEquals(0, solution.missingNumber(new int[] {3, 2, 1}));
        assertEquals(3, solution.missingNumber(new int[] {0, 2, 1}));
        assertEquals(2, solution.missingNumber(new int[] {3, 0, 1}));
        assertEquals(1, solution.missingNumber(new int[] {3, 2, 0}));
        assertEquals(0, solution.missingNumber(new int[] {3, 2, 1, 4}));
        assertEquals(0, solution.missingNumber(new int[] {3, 2, 1, 4, 5}));
    }

}