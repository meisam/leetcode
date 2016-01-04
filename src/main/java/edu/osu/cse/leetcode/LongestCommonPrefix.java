package edu.osu.cse.leetcode;

import java.util.Arrays;

/**
 * </p>
 * rite a function to find the longest common prefix string amongst an array of strings.
 * <p>
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/">Longest Common Prefix</a>
 * {@link }
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        String minStr = strs[0];
        String maxStr = strs[0];

        for (String str : strs) {
            if (str.compareTo(minStr) < 0) {
                minStr = str;
            }

            if (str.compareTo(maxStr) > 0) {
                maxStr = str;
            }
        }

        int limit = Math.min(maxStr.length(), minStr.length());

        int i = 0;

        while (i < limit) {
            if (minStr.charAt(i) == maxStr.charAt(i))
                i++;
            else
                break;
        }

        if (i == 0)
            return "";

        String result = maxStr.substring(0, i);
        return result;
    }

}
