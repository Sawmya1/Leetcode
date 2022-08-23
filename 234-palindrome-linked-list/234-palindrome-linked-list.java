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
    ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode nex = null;
        while(head != null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        //find middle of the element
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){//bothtruethenmove
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the list
        slow.next = reverseList(slow.next);
        slow = slow.next; //atcah & move to next
        while(slow != null){
            if(slow.val != head.val)
                return false;
            head = head.next;            
            slow = slow.next;
        }
        return true;        
    }
}