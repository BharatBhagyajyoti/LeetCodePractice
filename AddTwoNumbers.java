package leetcode;
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy head node to simplify result list creation
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0; // Get the current digit from l1 (or 0 if null)
            int y = (l2 != null) ? l2.val : 0; // Get the current digit from l2 (or 0 if null)
            int sum = x + y + carry;

            carry = sum / 10;                 // Calculate the carry for the next iteration
            current.next = new ListNode(sum % 10); // Create a new node with the digit part of sum
            current = current.next;           // Move to the next node

            if (l1 != null) l1 = l1.next;     // Move to the next node in l1
            if (l2 != null) l2 = l2.next;     // Move to the next node in l2
        }

        return dummyHead.next;

    }
}
=======
package leetcode;
/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 */


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy head node to simplify result list creation
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0; // Get the current digit from l1 (or 0 if null)
            int y = (l2 != null) ? l2.val : 0; // Get the current digit from l2 (or 0 if null)
            int sum = x + y + carry;

            carry = sum / 10;                 // Calculate the carry for the next iteration
            current.next = new ListNode(sum % 10); // Create a new node with the digit part of sum
            current = current.next;           // Move to the next node

            if (l1 != null) l1 = l1.next;     // Move to the next node in l1
            if (l2 != null) l2 = l2.next;     // Move to the next node in l2
        }

        return dummyHead.next;

    }
}

