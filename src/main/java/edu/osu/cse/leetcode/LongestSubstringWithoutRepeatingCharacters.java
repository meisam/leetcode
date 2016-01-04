package edu.osu.cse.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3.
 * For "bbbbb" the longest substring is "b", with the length of 1. *
 *
 * @see <a href="https://leetcode.com/problems/add-two-numbers">Two Sum</a>
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        if (n == 0) {
            return 0;
        }


        Map<Character, Integer> lastSeen = new HashMap<>(300);
        char[] chars = s.toCharArray();
        int maxLength = 1;
        int startIndex = -1;
        for (int currentIndex = 0; currentIndex < n; currentIndex++) {
            char currentChar = chars[currentIndex];
            if (lastSeen.containsKey(currentChar)) {
                int lastLocation = lastSeen.get(currentChar);
                if (lastLocation > startIndex) {
                    startIndex = lastLocation;
                }
            }
            lastSeen.put(currentChar, currentIndex);
            int length = currentIndex - startIndex;
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }


    public int lengthOfLongestSubstring2(String s) {
        int lastIndices[] = new int[256];
        for(int i = 0; i<256; i++){
            lastIndices[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.printf("s(%d) = %c \n ", i, s.charAt(i));
        }
        int maxLen = 0;
        int curLen = 0;
        int start = 0;
        for(int i = 0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(lastIndices[cur]  < start){
                lastIndices[cur] = i;
                curLen++;
            }
            else{
                int lastIndex = lastIndices[cur];
                start = lastIndex+1;
                curLen = i-start+1;
                lastIndices[cur] = i;
            }

            if(curLen > maxLen){
                System.out.printf("start = %d, i = %d, curLen = %d, maxLen = %d \n",
                        start, i, curLen, maxLen);
                maxLen = curLen;
            }
        }

        return maxLen;
    }
}
