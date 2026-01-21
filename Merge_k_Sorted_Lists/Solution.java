package leetcode.Merge_k_Sorted_Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result= new ListNode();
        List<Integer> resultL= new ArrayList<Integer>();
        for(int i=0;i<lists.length;i++)
        {
            ListNode temp=lists[i];
            while(temp != null)
            {
                resultL.add(temp.val);
                temp=temp.next;
            }

        }
        Collections.sort(resultL);


        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int ele : resultL) {
            curr.next = new ListNode(ele);
            curr = curr.next;
        }

        return dummy.next;
    }
}