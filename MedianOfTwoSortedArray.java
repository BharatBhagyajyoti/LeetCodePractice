
/*
4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 */
package leetcode;


import java.util.ArrayList;
import java.util.Collections;

class MedianOfTwoSortedArray {


    public static void main(String[] args) {
        MedianOfTwoSortedArray solution = new MedianOfTwoSortedArray();

        // Test cases
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }


    //Your Answer starts here
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int l1 = nums1.length;
        int l2 = nums2.length;
        double result;

        // Add elements from nums1 to arrayList
        for (int i = 0; i < l1; i++) {
            arrayList.add(nums1[i]);
        }

        // Add elements from nums2 to arrayList
        for (int i = 0; i < l2; i++) {
            arrayList.add(nums2[i]);
        }

        // Sort the merged list
        Collections.sort(arrayList);

        int size = arrayList.size();
        if (size % 2 == 0) {
            // For even size, average the two middle elements
            int mid = size / 2;
            result = (arrayList.get(mid - 1) + arrayList.get(mid)) / 2.0; // used for floating-point division
        } else {
            // For odd size, take the middle element
            int mid = size / 2;
            result = arrayList.get(mid);
        }

        return result;
    }
}



=======
/*
4. Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 */
package leetcode;


import java.util.ArrayList;
import java.util.Collections;

class MedianOfTwoSortedArray {


    public static void main(String[] args) {
        MedianOfTwoSortedArray solution = new MedianOfTwoSortedArray();

        // Test cases
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + solution.findMedianSortedArrays(nums3, nums4)); // Output: 2.5
    }


    //Your Answer starts here
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int l1 = nums1.length;
        int l2 = nums2.length;
        double result;

        // Add elements from nums1 to arrayList
        for (int i = 0; i < l1; i++) {
            arrayList.add(nums1[i]);
        }

        // Add elements from nums2 to arrayList
        for (int i = 0; i < l2; i++) {
            arrayList.add(nums2[i]);
        }

        // Sort the merged list
        Collections.sort(arrayList);

        int size = arrayList.size();
        if (size % 2 == 0) {
            // For even size, average the two middle elements
            int mid = size / 2;
            result = (arrayList.get(mid - 1) + arrayList.get(mid)) / 2.0; // used for floating-point division
        } else {
            // For odd size, take the middle element
            int mid = size / 2;
            result = arrayList.get(mid);
        }

        return result;
    }
}



