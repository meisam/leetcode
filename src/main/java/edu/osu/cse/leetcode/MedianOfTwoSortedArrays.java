package edu.osu.cse.leetcode;

/**
 * There are two sorted arrays arr1 and arr2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 * {@link }
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int k = (n1 + n2) / 2;
        if ((n1 + n2) % 2 == 1) {
            return kthLargest(k, arr1, 0, n1 - 1, arr2, 0, n2 - 1);
        } else {
            return 0.5 * (kthLargest(k, arr1, 0, n1 - 1, arr2, 0, n2 - 1) +
                    kthLargest(k - 1, arr1, 0, n1 - 1, arr2, 0, n2 - 1));
        }
    }

    /**
     * returns the K-th largest element in both arrays.
     *
     * @param k
     * @param arr1
     * @param start1
     * @param end1
     * @param arr2
     * @param start2
     * @param end2
     * @return
     */
    public double kthLargest(int k, int[] arr1, int start1, int end1, int[] arr2, int start2, int end2) {
        int n1 = end1 - start1 + 1;
        int n2 = end2 - start2 + 1;

        if (n1 <= 0) {
            return arr2[start2 + k];
        }

        if (n2 <= 0) {
            return arr1[start1 + k];
        }

        if (k == 0) {
            return Math.min(arr1[start1], arr2[start2]);
        }

        int midGuess1 = k * n1 / (n1 + n2);
        int midGuess2 = k - midGuess1 - 1;

        int mid1 = Math.min(end1, start1 + midGuess1);
        int mid2 = Math.min(end2, start2 + midGuess2);

        if (arr1[mid1] > arr2[mid2]) {
            k -= (mid2 - start2 + 1);
            start2 = mid2 + 1;
            end1 = mid1;
        } else {
            k -= (mid1 - start1 + 1);
            start1 = mid1 + 1;
            end2 = mid2;
        }

        return kthLargest(k, arr1, start1, end1, arr2, start2, end2);
    }
}

