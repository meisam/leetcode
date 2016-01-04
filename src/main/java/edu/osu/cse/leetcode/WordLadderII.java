package edu.osu.cse.leetcode;

import java.util.*;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find all shortest transformation sequence(s) from beginWord to endWord, such that:
 * <p>
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the word list
 * For example,
 * <p>
 * Given:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * Return
 * [
 * ["hit","hot","dot","dog","cog"],
 * ["hit","hot","lot","log","cog"]
 * ]
 * <bold>Note:</bold>
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 *
 * @see <a href="https://leetcode.com/problems/word-ladder-ii">Word Ladder II</a>
 */
public class WordLadderII {

    public List<List<String>> findLadders(String beginWord, String endWord, Set<String> wordList) {

        int n = wordList.size();
        String[] allWords = wordList.toArray(new String[0]);
        boolean[][] adjacencyGraph = new boolean[n][n];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                boolean areAdjacent = differInOneCharacter(allWords[i], allWords[j]);
                adjacencyGraph[i][j] = areAdjacent;
                adjacencyGraph[j][i] = areAdjacent;
            }
        }

        int beginWordIndex = indexOf(beginWord, allWords);
        int endWordIndex = indexOf(endWord, allWords);

        List<List<Integer>> allPaths = allShortestPaths(adjacencyGraph, beginWordIndex, endWordIndex);
        return null;
    }

    private List<List<Integer>> allShortestPaths(boolean[][] adjacencyGraph, int beginIndex, int endIndex) {

        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (beginIndex == endIndex) {
            List<Integer> path = new LinkedList<Integer>();
            path.add(beginIndex);
            result.add(path);
            return result;
        }
        if (adjacencyGraph[beginIndex][endIndex]) {
            List<Integer> path = new LinkedList<Integer>();
            path.add(beginIndex);
            path.add(endIndex);
            result.add(path);
            return result;
        }

        int n = adjacencyGraph.length;
        int[][] pathCost = new int[n][n];
        for (int i = 0; i < n; i++) {
            pathCost[n][n] = 0;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (adjacencyGraph[i][j])
                    pathCost[i][j] = pathCost[j][i] = 1;
            }
        }

        for (int pathLenght = 3; pathLenght < n; pathLenght++) {
            int minPathCost = Integer.MAX_VALUE;

        }
        return null;
    }

    private int indexOf(String word, String[] allWords) {
        for (int i = 0; i < allWords.length; i++) {
            if (word.equals(allWords[i])) {
                return i;
            }
        }
        throw new IllegalStateException(String.format("Cannot find %s in %s", word, Arrays.toString(allWords)));
    }

    private boolean differInOneCharacter(String word1, String word2) {
        if (word1.length() != word1.length())
            return false;
        int mismatchCount = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                mismatchCount++;
            }
            if (mismatchCount > 1) {
                return false;
            }
        }
        return mismatchCount == 1;
    }
}


