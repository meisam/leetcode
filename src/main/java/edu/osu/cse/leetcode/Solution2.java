package edu.osu.cse.leetcode;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays.
 * The overall run time complexity should be O(log (m+n)).
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Median of Two Sorted Arrays</a>
 * {@link }
 */
public class Solution2 {
    public String solution(String S, String T) {
        int m = S.length();
        int n = T.length();

        if (Math.abs(n - m) > 1) {
            return "IMPOSSIBLE";
        }

        if (n == m) {
            return swapCharacters(S, T);
        }

        return insertCharacter(S, T);
    }

    private String insertCharacter(String s, String t) {

        int i = 0;
        int j = 0;
        char charToInsert = 0;
        boolean seenAnomaly = false;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == s.charAt(j)) {

            } else {
                if (seenAnomaly)
                    return "IMPOSSIBLE";

                seenAnomaly = true;
                if (s.length() > t.length()) {
                    charToInsert = s.charAt(i);
                    j--;
                } else {
                    charToInsert = t.charAt(j);
                    i--;
                }
            }
            i++;
            j++;
        }
        assert seenAnomaly = true;
        return String.format("INSERT %c", charToInsert);
    }

    private String swapCharacters(String s, String t) {

        int anomalyIndex = -10;
        for (int i = 0; i < s.length(); i++) {
            char currentS = s.charAt(i);
            char currentT = t.charAt(i);

            if (currentS == currentT) {
                continue;
            } else {
                if (anomalyIndex < 0) {
                    anomalyIndex = i;
                } else if (anomalyIndex == i - 1 &&
                        currentS == t.charAt(anomalyIndex) && currentT == s.charAt(anomalyIndex)) {
                    return String.format("SWAP %c %c", currentS, currentT);
                } else {
                    return "IMPOSSIBLE";
                }
            }
        }
        return "NOTHING";
    }
}
