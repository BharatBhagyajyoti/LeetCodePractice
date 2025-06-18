
package leetcode;

public class SingleNumber_III {
    /*
    Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
    You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

Example 2:
Input: nums = [-1,0]
Output: [-1,0]

Example 3:
Input: nums = [0,1]
Output: [1,0]

Constraints:

2 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each integer in nums will appear twice, only two integers will appear once.
     */



    public static void main(String[] args) {
        SingleNumber_III solution = new SingleNumber_III();

        int[] nums = {4, 1, 2, 1, 2, 5};

        int[] result = solution.singleNumber(nums);

        System.out.println("The two unique numbers are: [" + result[0] + "," + result[1]+"]");
    }


    //Your Answer starts from here
    public int[] singleNumber(int[] nums) {
        int[] countArr = new int[nums.length];
        int[] single = new int[2];
        int singleIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) { // Fixed the loop variable here
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            countArr[i] = count;
        }

        // Finding numbers that appear only once
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 1 && singleIndex < 2) { // Ensure we only add two unique numbers
                single[singleIndex] = nums[i];
                singleIndex++;
            }
        }

        return single;
    }
}

=======
package leetcode;

public class SingleNumber_III {
    /*
    Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
    You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

Example 2:
Input: nums = [-1,0]
Output: [-1,0]

Example 3:
Input: nums = [0,1]
Output: [1,0]

Constraints:

2 <= nums.length <= 3 * 104
-231 <= nums[i] <= 231 - 1
Each integer in nums will appear twice, only two integers will appear once.
     */



    public static void main(String[] args) {
        SingleNumber_III solution = new SingleNumber_III();

        int[] nums = {4, 1, 2, 1, 2, 5};

        int[] result = solution.singleNumber(nums);

        System.out.println("The two unique numbers are: [" + result[0] + "," + result[1]+"]");
    }


    //Your Answer starts from here
    public int[] singleNumber(int[] nums) {
        int[] countArr = new int[nums.length];
        int[] single = new int[2];
        int singleIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) { // Fixed the loop variable here
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            countArr[i] = count;
        }

        // Finding numbers that appear only once
        for (int i = 0; i < countArr.length; i++) {
            if (countArr[i] == 1 && singleIndex < 2) { // Ensure we only add two unique numbers
                single[singleIndex] = nums[i];
                singleIndex++;
            }
        }

        return single;
    }
}


