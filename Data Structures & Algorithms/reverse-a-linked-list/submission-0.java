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

class Solution {
    public ListNode reverseList(ListNode head) {
        // we are starting at head, so 0 from[0,1,2,3]
        ListNode prev = null; // prev pointer
        ListNode curr = head; // 0 is head, current pointer

        // if the current pointer is null, we have gone through
        // the linked list
        while(curr != null){
            // creating a temp to hold our next value from head
            // in this case it's 1. temp = 1, curr.next = 1
            // 2nd iteration: it's 2, temp = 2, curr.next = 2
            ListNode temp = curr.next;
            
            // okay let's visualize it
            // [0] -> [1] -> [2] -> [3]
            // we need to do [0] <- [1]

            // so reverse the pointer would be [1] -> null
            // this is the LINK 
            // when temp = 2, curr.next is 2.
            // means curr (1) is pointing to 2, now it's pointing to 0
            curr.next = prev;

            //let's move prev pointer to curr
            // so prev is pointing at 0
            // curr is pointing at 1
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
