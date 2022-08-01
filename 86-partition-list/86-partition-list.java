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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);  //declare with 0 pos
        ListNode right = new ListNode(0);
        ListNode leftTail = left;
        ListNode rightTail = right;
        while(head != null){
            if(head.val<x){
                leftTail.next = head;  //head ki value daldo
                leftTail = leftTail.next; //increment
            }
            else{
                rightTail.next = head;
                rightTail = rightTail.next;
            }
            head = head.next;  //increment
        }
        leftTail.next = right.next;
        rightTail.next = null;
         return left.next; //bcz we don't want to start with 0
    }
}