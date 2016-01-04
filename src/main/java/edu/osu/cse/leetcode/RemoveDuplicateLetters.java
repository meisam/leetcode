package edu.osu.cse.leetcode;

/**
 * Given a string which contains only lowercase letters, remove duplicate letters so that every letter appear once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
 * <p>
 * Example:
 * Given "bcabc"
 * Return "abc"
 * <p>
 * Given "cbacdcbc"
 * Return "acdb"
 *
 * @see <a href="https://leetcode.com/problems/remove-duplicate-letters/">Remove Duplicate Letters</a>
 * {@link }
 */
public class RemoveDuplicateLetters {

    public String removeDuplicateLetters(String s) {
        int letterCount = 'z' - 'a';
        int[] counts = new int[letterCount];
        int n = s.length();
        int resultLength = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int index = 'z' - c;
            counts[index] += 1;
            if (counts[index] == 1) {
                resultLength++;
            }
        }

        char[] results = new char[resultLength];
        for (int i = 0, index = 0; i < n; i++) {
//            if(counts[index])
        }

        return s;
    }

}
