
/*
9. Palindrome Number
Given an integer x, return true if x is a
palindrome and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */


package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        PalindromeNumber solution = new PalindromeNumber();

        // Test cases
        int[] testCases = {121, -121, 10, 0, 12321, -101};

        for (int num : testCases) {
            boolean result = solution.isPalindrome(num);
            System.out.println("Is " + num + " a palindrome? " + result);
        }
    }


//Your Answer Starts here
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int rev=0;
        int temp=x;
        while(x !=0)
        {
            int rem= x%10;
            rev= (rev*10)+rem;
            x/=10;
        }
        if(rev==temp)
            return true;

        else
            return false;
    }
}
