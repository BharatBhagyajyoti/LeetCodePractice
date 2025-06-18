/*
7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

 */


package leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            // Underflow check
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            rev = rev * 10 + rem;
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        // Test cases
        System.out.println(solution.reverse(123)); // Output: 321
        System.out.println(solution.reverse(-123)); // Output: -321
        System.out.println(solution.reverse(120)); // Output: 21
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow)
        System.out.println(solution.reverse(-2147483412)); // Output: -2143847412
    }
}
=======
/*
7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
Example 1:

Input: x = 123
Output: 321

Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21

 */


package leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            // Underflow check
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            rev = rev * 10 + rem;
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        ReverseInteger solution = new ReverseInteger();

        // Test cases
        System.out.println(solution.reverse(123)); // Output: 321
        System.out.println(solution.reverse(-123)); // Output: -321
        System.out.println(solution.reverse(120)); // Output: 21
        System.out.println(solution.reverse(1534236469)); // Output: 0 (overflow)
        System.out.println(solution.reverse(-2147483412)); // Output: -2143847412
    }
}
