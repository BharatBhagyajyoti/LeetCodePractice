
/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

 */




package leetcode;

import java.util.HashSet;
import java.util.Set;



/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

 */





public class LongestSubStringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int maxLength = 0;
        int left = 0;
        Set<Character> seenChars = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (seenChars.contains(s.charAt(right))) {
                seenChars.remove(s.charAt(left));
                left++;
            }
            seenChars.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingCharacter solution = new LongestSubStringWithoutRepeatingCharacter();

        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Longest substring length for \"" + s1 + "\": " + solution.lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println("Longest substring length for \"" + s2 + "\": " + solution.lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println("Longest substring length for \"" + s3 + "\": " + solution.lengthOfLongestSubstring(s3)); // Output: 3
    }
}

