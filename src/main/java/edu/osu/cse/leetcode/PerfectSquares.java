package edu.osu.cse.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a positive integer n,
 * find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
 * <p>
 * For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.
 *
 * @see <a href="https://leetcode.com/problems/perfect-squares/">Perfect Squares </a>
 * {@link }
 */
public class PerfectSquares {

    public int numSquares(int n) {
        int min = n;
        int[] memo = new int[n + 1];
        return numSquaresWithMemo(n, memo);
    }

    public int numSquaresWithMemo(int n, int[] memo) {
        if (n < 1)
            throw new IllegalArgumentException(n + " is not a valid value");
        // System.out.println(String.format("Exploring numSquares for %d", n));
        if (memo[n] > 0) {
            int min = memo[n];
            // System.out.println(String.format("Found %d -> %d", n, min));
            return min;
        }

        int sqrt = sqrt(n);

        if (sqrt * sqrt == n) {
            // System.out.println(String.format("Storing %d -> %d", n, 1));
            memo[n] = 1;
            return 1;
        }

        int min = n; // n = 1 + 1 + ... + 1 (n times)
        for (int i = sqrt; i >= 1; i--) {
            int currentMin = numSquaresWithMemo(n - i * i, memo) + 1;
            if (currentMin < min) {
                // System.out.println(String.format("New min for %d -> %d (old min = %d)", n, currentMin, min));

                min = currentMin;
            }
        }

        // System.out.println(String.format("Storing %d -> %d", n, min));
        memo[n] = min;
        // System.out.println(String.format("returning %d -> %d", n, min));
        return min;

    }

    public int sqrt(int n) {
        return (int) (Math.floor(Math.sqrt(n)));
    }
}