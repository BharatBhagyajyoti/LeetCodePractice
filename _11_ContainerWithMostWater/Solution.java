package leetcode._11_ContainerWithMostWater;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};

        System.out.println("Max Area (Example 1): " + solution.maxArea(height1)); // Output: 49
        System.out.println("Max Area (Example 2): " + solution.maxArea(height2)); // Output: 1
    }
}

//Solution starts here
public class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currentArea = width * minHeight;

            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer which has the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}

