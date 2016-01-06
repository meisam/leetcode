package edu.osu.cse.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by fathi on 1/5/16.
 */
public class WiggleSortIITest {
    WiggleSortII solution = new WiggleSortII();

    public void assertWieggly(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (i % 2 == 0) {
                assertTrue(String.format("num[%d] = %d >= %d num[%d] ", i, nums[i], nums[i + 1], i + 1),
                        nums[i] < nums[i + 1]);
            } else {
                assertTrue(String.format("num[%d] = %d <= %d num[%d] ", i, nums[i], nums[i + 1], i + 1),
                        nums[i] > nums[i + 1]);
            }
        }
    }

    @Test
    public void testSortedArray() {
        int[] nums = new int[]{1, 2, 3};
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        assertWieggly(nums);
    }

    @Test
    public void testSortedArray2() {
        int[] nums = new int[]{1, 1, 1, 3, 3};
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        assertWieggly(nums);
    }

    @Test
    public void testArray1() {
        int[] nums = new int[]{1, 5, 1, 1, 6, 4};
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        assertWieggly(nums);
    }

    @Test
    public void testArray2() {
        int[] nums = new int[]{1, 3, 2, 2, 3, 1};
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        assertWieggly(nums);
    }

    @Test
    public void testDifficultArray() {
        int[] nums = new int[]{4,5,5,6};
        solution.wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
        assertWieggly(nums);
    }

}