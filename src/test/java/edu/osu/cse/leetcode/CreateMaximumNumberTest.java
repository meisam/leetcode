package edu.osu.cse.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by fathi on 1/6/16.
 */
public class CreateMaximumNumberTest {

    CreateMaximumNumber solution = new CreateMaximumNumber();

    @Test
    public void test0() {
        int[] num1 = {3, 6};
        int[] num2 = {9, 1};
        int k = 3;
        int[] expected = {9, 6, 1};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void test1() {
        int[] num1 = {3, 4, 6, 5};
        int[] num2 = {9, 1, 2, 5, 8, 3};
        int k = 5;
        int[] expected = {9, 8, 6, 5, 3};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void test2() {
        int[] num1 = {6, 7};
        int[] num2 = {6, 0, 4};
        int k = 5;
        int[] expected = {6, 7, 6, 0, 4};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void test3() {
        int[] num1 = {3, 9};
        int[] num2 = {8, 9};
        int k = 3;
        int[] expected = {9, 8, 9};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void test4() {
        int[] num1 = {1, 1, 1, 2};
        int[] num2 = {9};
        int k = 2;
        int[] expected = {9, 2};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void test5() {
        int[] num1 = {1, 1, 1, 2};
        int[] num2 = {9};
        int k = 3;
        int[] expected = {9, 1, 2};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void test6() {
        int[] num1 = {1, 1, 1, 2};
        int[] num2 = {9};
        int k = 4;
        int[] expected = {9, 1, 1, 2};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void test7() {
        int[] num1 = {1, 1, 1, 8};
        int[] num2 = {9, 2};
        int k = 4;
        int[] expected = {9, 2, 1, 8};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

    @Test
    public void testTimeLimit() {
        int[] num1 = {6, 4, 7, 8, 6, 5, 5, 3, 1, 7, 4, 9, 9, 5, 9, 6, 1, 7, 1, 3, 6, 3, 0, 8, 2, 1, 8, 0, 0, 7, 3, 9, 3, 1, 3, 7, 5, 9, 4, 3, 5, 8, 1, 9, 5, 6, 5, 7, 8, 6, 6, 2, 0, 9, 7, 1, 2, 1, 7, 0, 6, 8, 5, 8, 1, 6, 1, 5, 8, 4};
        int[] num2 = {3, 0, 0, 1, 4, 3, 4, 0, 8, 5, 9, 1, 5, 9, 4, 4, 4, 8, 0, 5, 5, 8, 4, 9, 8, 3, 1, 3, 4, 8, 9, 4, 9, 9, 6, 6, 2, 8, 9, 0, 8, 0, 0, 0, 1, 4, 8, 9, 7, 6, 2, 1, 8, 7, 0, 6, 4, 1, 8, 1, 3, 2, 4, 5, 7, 7, 0, 4, 8, 4};
        int k = 70;
        int[] expected = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 5, 6, 5, 7, 8, 6, 6, 2, 0, 9, 7, 1, 2, 1, 7, 0, 8, 0, 6, 8, 5, 8, 1, 6, 1, 5, 8, 4, 0, 0, 0, 1, 4, 8, 9, 7, 6, 2, 1, 8, 7, 0, 6, 4, 1, 8, 1, 3, 2, 4, 5, 7, 7, 0, 4, 8, 4};

        int[] actual = solution.maxNumber(num1, num2, k);
        assertArrayEquals(Arrays.toString(actual), expected, actual);
    }

}