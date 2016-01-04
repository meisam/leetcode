package edu.osu.cse.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 */
public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();


    @Test
    public void testFindMedianSortedArrays() throws Exception {
        assertEquals(1, solution.findMedianSortedArrays(array(1), array()), 1e-20);
        assertEquals(2, solution.findMedianSortedArrays(array(1), array(3)), 1e-20);
        assertEquals(2, solution.findMedianSortedArrays(array(1), array(3)), 1e-20);
        assertEquals(2, solution.findMedianSortedArrays(array(1), array(3)), 1e-20);
        assertEquals(3.5, solution.findMedianSortedArrays(array(1), array(2, 3, 4, 5, 6)), 1e-20);
        assertEquals(4, solution.findMedianSortedArrays(array(1), array(2, 3, 4, 5, 6, 7)), 1e-20);
        assertEquals(5, solution.findMedianSortedArrays(array(10), array(2, 3, 4, 5, 6, 7)), 1e-20);
    }


    int[] array(int... values) {
        return values;
    }
}