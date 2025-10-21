package leetcode.zigzagConversion;

class Solution {


    public String convert(String s, int numRows) {

        //Answer Starts here
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[curRow].append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    // 👇 Main method to test the function
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        String output = new Solution().convert(s, numRows);
        System.out.println("Input: " + s);
        System.out.println("Number of Rows: " + numRows);
        System.out.println("Zigzag Conversion: " + output);
    }


}
