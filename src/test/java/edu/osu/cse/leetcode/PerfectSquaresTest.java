package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 9/9/15.
 */
public class PerfectSquaresTest {

    PerfectSquares solution = new PerfectSquares();

    @Test
    public void testNumSquares() throws Exception {
        assertEquals(1, solution.numSquares(1));
        assertEquals(2, solution.numSquares(2));
        assertEquals(3, solution.numSquares(3));
        assertEquals(1, solution.numSquares(4));
        assertEquals(2, solution.numSquares(5));
        assertEquals(3, solution.numSquares(6));
        assertEquals(4, solution.numSquares(7));
        assertEquals(2, solution.numSquares(8));
        assertEquals(1, solution.numSquares(9));
        assertEquals(2, solution.numSquares(10));
        assertEquals(3, solution.numSquares(11));
        assertEquals(3, solution.numSquares(12));
        assertEquals(2, solution.numSquares(13));
        assertEquals(3, solution.numSquares(14));
        assertEquals(4, solution.numSquares(15));
        assertEquals(1, solution.numSquares(16));
        assertEquals(2, solution.numSquares(17));
        assertEquals(2, solution.numSquares(18));
        assertEquals(3, solution.numSquares(19));

        assertEquals(2, solution.numSquares(50));
        assertEquals(3, solution.numSquares(99));
        assertEquals(1, solution.numSquares(100));
        assertEquals(1, solution.numSquares(10000));
        assertEquals(2, solution.numSquares(100000));
        assertEquals(3, solution.numSquares(7777));
    }

    @Test
    public void testSqr() throws Exception {

        for (int i = 0; i < 1 << 16 - 1; i++) {
            int sqrt = solution.sqrt(i * i);
            assertEquals(String.format("%d , %d", i, sqrt), i * i, sqrt * sqrt);
        }
    }
}