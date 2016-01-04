package edu.osu.cse.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by fathi on 9/19/15.
 */
public class MoveZeroesTest {

    MoveZeroes solution = new MoveZeroes();

    @Test
    public void testMoveZeros() {
        int[] inputArray = new int[] {0, 1, 0, 3, 12};
        solution.moveZeroes(inputArray);
        int[] expectedArray = {1, 3, 12, 0, 0};
        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleElementZero() {
        int[] inputArray = new int[] {0};
        solution.moveZeroes(inputArray);
        int[] expectedArray = {0};
        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleElementNonZero() {
        int[] inputArray = new int[] {1};
        solution.moveZeroes(inputArray);
        int[] expectedArray = {1};
        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testAllZero() {
        int[] inputArray = new int[] {0, 0, 0};
        solution.moveZeroes(inputArray);
        int[] expectedArray = {0, 0, 0};
        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoneZero() {
        int[] inputArray = new int[] {4, 3, 2};
        solution.moveZeroes(inputArray);
        int[] expectedArray = {4, 3, 2};
        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(inputArray);
        assertEquals(expected, actual);
    }


    @Test
    public void testHeadZero() {
        int[] inputArray = new int[] {0, 2, 3, 4};
        solution.moveZeroes(inputArray);
        int[] expectedArray = {2, 3, 4, 0};
        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(inputArray);
        assertEquals(expected, actual);
    }

    @Test
    public void testTailZero() {
        int[] inputArray = new int[] {2, 3, 4, 0, 0, 0, 0};
        solution.moveZeroes(inputArray);
        int[] expectedArray = {2, 3, 4, 0, 0, 0, 0};
        String expected = Arrays.toString(expectedArray);
        String actual = Arrays.toString(inputArray);
        assertEquals(expected, actual);
    }
}