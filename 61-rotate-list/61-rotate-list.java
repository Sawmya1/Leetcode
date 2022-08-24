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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        ListNode cur = head;
        int len = 1;
        //len calculate
        while(cur.next != null){
            len++;
            cur = cur.next;
        }
        cur.next = head;
        k = len - k % len;
        while(k-- > 0) cur = cur.next;
        head = cur.next; //circular
        cur.next = null;
        return head;
    }
}