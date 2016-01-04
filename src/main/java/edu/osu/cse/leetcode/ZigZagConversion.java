package edu.osu.cse.leetcode;

/**
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <pre>
 * {@code
 *
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * }
 * </pre>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/">ZigZag Conversion</a>
 * {@link }
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        char[] chars = s.toCharArray();
        int n = chars.length;

        StringBuffer result = new StringBuffer(n);

        if (numRows == 2) {
            for (int i = 0; i < chars.length; i += 2) {
                result.append(chars[i]);
            }
            for (int i = 1; i < chars.length; i += 2) {
                result.append(chars[i]);
            }

            return result.toString();
        }

        int charsPerChunk = 2 * numRows - 2;
        int chunkCount = n / charsPerChunk + (n % charsPerChunk == 0 ? 0 : 1);

        char[] convertedChars = new char[numRows * chunkCount * 2];
        boolean[] isFilled = new boolean[numRows * chunkCount * 2];

        int colIndex = 0;
        int rowIndex = 0;
        boolean goingDown = true;
        for (int i = 0; i < n; i++) {
            isFilled[rowIndex * chunkCount * 2 + colIndex] = true;
            convertedChars[rowIndex * chunkCount * 2 + colIndex] = chars[i];
            if (goingDown) {
                if (rowIndex < numRows - 1) {
                    rowIndex++;
                } else {
                    rowIndex--;
                    colIndex++;
                    goingDown = false;
                }
            } else {
                if (rowIndex > 1) {
                    rowIndex--;
                } else {
                    rowIndex = 0;
                    colIndex++;
                    goingDown = true;
                }
            }
        }


        for (int i = 0; i < convertedChars.length; i++) {
            if (isFilled[i]) {
                result.append(convertedChars[i]);
            }
        }
        return result.toString();
    }
}

