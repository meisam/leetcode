package edu.osu.cse.leetcode;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by fathi on 1/5/16.
 */
public class CoinChangeTest {

    CoinChange solution = new CoinChange();

    @Test
    public void test_1_2_3() {
//        assertEquals(1, solution.coinChange(new int[]{1, 2, 3}, 1));
//        assertEquals(1, solution.coinChange(new int[]{1, 2, 3}, 2));
//        assertEquals(1, solution.coinChange(new int[]{1, 2, 3}, 3));
        assertEquals(2, solution.coinChange(new int[]{1, 2, 3}, 4));
    }

    @Test
    public void test_1_4_5() {
        assertEquals(1, solution.coinChange(new int[]{1, 4, 5}, 1));
        assertEquals(2, solution.coinChange(new int[]{1, 4, 5}, 2));
        assertEquals(3, solution.coinChange(new int[]{1, 4, 5}, 3));
        assertEquals(1, solution.coinChange(new int[]{1, 4, 5}, 4));
        assertEquals(1, solution.coinChange(new int[]{1, 4, 5}, 5));
        assertEquals(2, solution.coinChange(new int[]{1, 4, 5}, 6));
        assertEquals(3, solution.coinChange(new int[]{1, 4, 5}, 7));
        assertEquals(2, solution.coinChange(new int[]{1, 4, 5}, 8));
        assertEquals(2, solution.coinChange(new int[]{1, 4, 5}, 9));
        assertEquals(2, solution.coinChange(new int[]{1, 4, 5}, 10));
        assertEquals(3, solution.coinChange(new int[]{1, 4, 5}, 11));
        assertEquals(3, solution.coinChange(new int[]{1, 4, 5}, 12));
        assertEquals(3, solution.coinChange(new int[]{1, 4, 5}, 13));
        assertEquals(3, solution.coinChange(new int[]{1, 4, 5}, 14));
        assertEquals(3, solution.coinChange(new int[]{1, 4, 5}, 15));
        assertEquals(4, solution.coinChange(new int[]{1, 4, 5}, 16));
        assertEquals(4, solution.coinChange(new int[]{1, 4, 5}, 17));
        assertEquals(4, solution.coinChange(new int[]{1, 4, 5}, 18));
        assertEquals(4, solution.coinChange(new int[]{1, 4, 5}, 19));
        assertEquals(4, solution.coinChange(new int[]{1, 4, 5}, 20));
        assertEquals(5, solution.coinChange(new int[]{1, 4, 5}, 21));
        assertEquals(5, solution.coinChange(new int[]{1, 4, 5}, 22));
        assertEquals(5, solution.coinChange(new int[]{1, 4, 5}, 23));
        assertEquals(5, solution.coinChange(new int[]{1, 4, 5}, 24));
        assertEquals(5, solution.coinChange(new int[]{1, 4, 5}, 25));
        assertEquals(6, solution.coinChange(new int[]{1, 4, 5}, 26));
        assertEquals(8, solution.coinChange(new int[]{1, 4, 5}, 40));
        assertEquals(9, solution.coinChange(new int[]{1, 4, 5}, 41));
        assertEquals(9, solution.coinChange(new int[]{1, 4, 5}, 42));
        assertEquals(9, solution.coinChange(new int[]{1, 4, 5}, 43));
        assertEquals(9, solution.coinChange(new int[]{1, 4, 5}, 44));
    }

    @Test
    public void test_4_5() {
        assertEquals(-1, solution.coinChange(new int[]{4, 5}, 6));
        assertEquals(-1, solution.coinChange(new int[]{4, 5}, 7));
        assertEquals(-1, solution.coinChange(new int[]{4, 5}, 11));
    }

    @Test
    public void test_474_83_404_3() {
        assertEquals(8, solution.coinChange(new int[]{474,83,404,3}, 264));
    }
}