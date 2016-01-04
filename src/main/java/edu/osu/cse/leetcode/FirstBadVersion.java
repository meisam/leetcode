package edu.osu.cse.leetcode;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately,
 * the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which will return whether version is bad.
 * Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 * @see <a href="https://leetcode.com/problems/first-bad-version/">First Bad Version</a>
 * {@link }
 */
public class FirstBadVersion {

    public boolean[] versions = {false, false, false, false, false, true, true, true, true};

    public int firstBadVersion(int n) {

        if (!isBadVersion(n))
            return 0;

        int start = 1;
        int end = n;
        while (start < end) {
            int guess = (int) ((long) start + (long) end) / 2;
            if (isBadVersion(guess)) {
                end = guess;
            } else {
                start = guess + 1;
            }
        }
        return start;
    }

    public boolean isBadVersion(int n) {
        if (n == 0)
            throw new IllegalArgumentException("version 0 is not acceptable");
        return versions[n - 1];
    }

}
