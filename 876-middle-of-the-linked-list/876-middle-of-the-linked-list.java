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
    public ListNode middleNode(ListNode head) {
       //int n = head.size();
//         ListNode temp = head;
//         int count = 0;
//         while (temp != null)
//         {
//             count++;
//             temp = temp.next;
//         }

//        int ans = (int) Math.ceil((double)count/2.0);
//         ListNode current = head;
//         int i = 0; 
//         while (current != null)
//         {
//             if (i == ans)
//                 return current;
//             i++;
//             current = current.next;
//         }
//     return head;      
        int countNodes = 0;
        ListNode currNode = head;
        
        // loop to count the number of nodes
        while(currNode != null){
            countNodes++;
            currNode = currNode.next;
        }
        
        currNode = head;
        for(int i = 0; i < countNodes/2; i++)   
            currNode = currNode.next;
        
        return currNode;

    }
}