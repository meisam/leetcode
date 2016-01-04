package edu.osu.cse.leetcode;

/**
 * Implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * <p>
 * The matching should cover the entire input string (not partial).
 * <p>
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * <p>
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 *
 * @see <a href="https://leetcode.com/problems/regular-expression-matching/">Regular Expression Matching</a>
 * {@link }
 */
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {

        char[] str = s.toCharArray();
        char[] regex = p.toCharArray();

        int n = str.length;
        int m = regex.length;

        // dynamic programming
        // matches[i][j] means that the first i characters in str match the first j characters in regex
        boolean[][] matches = new boolean[n + 1][m + 1];
        matches[0][0] = true;

        for (int i = 1; i <= n; i++) {
            matches[i][0] = false;
        }

        for (int j = 1; j <= m; j++) {
            if (j % 2 == 0) {
                matches[0][j] = matches[0][j - 2] && regex[j-1] == '*';
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                matches[i][j] = (
                        // if the last character of the str matches the last character of regex
                        (regex[j - 1] == str[i - 1] && matches[i - 1][j - 1])
                                ||
                                // if the last character of the regex is a "." dot
                                (regex[j - 1] == '.' && matches[i - 1][j - 1])
                                ||
                                // if regex ends in x* and str ends in x
                                (regex[j - 1] == '*' && (regex[j - 2] == '.' || regex[j - 2] == str[i - 1])
                                        && matches[i - 1][j])
                                ||
                                // if regex ends in x* but str does not end  in x
                                (regex[j - 1] == '*' && (j >= 2 && matches[i][j - 2]))
                );
            }
        }
        return matches[n][m];
    }

}
