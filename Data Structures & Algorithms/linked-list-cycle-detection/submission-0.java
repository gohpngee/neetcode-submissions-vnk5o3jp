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
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode tortoise = head;
        ListNode rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;

            if (tortoise == rabbit) {
                return true;
            }
        }
        
        return false;
    }
}
