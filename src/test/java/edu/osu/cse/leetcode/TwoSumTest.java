package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class TwoSumTest {

    TwoSum solution = new TwoSum();

    @Test
    public void testTwoSum() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7}, 9));
        assertArrayEquals(new int[]{1, 4}, solution.twoSum(new int[]{2, 7, 11, 15}, 17));
        assertArrayEquals(new int[]{3, 4}, solution.twoSum(new int[]{2, 7, 11, 15}, 26));
    }

}