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
        
        public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                ListNode removeNode = curr.next;
                curr.next = removeNode.next;
                removeNode.next = null;
            } else {
                curr = curr.next;    
            }
        }
        if (head != null && head.val == val) {
            ListNode removeNode = head;
            head = removeNode.next;
            removeNode.next = null;
            
        }
        return head;
    }
}
