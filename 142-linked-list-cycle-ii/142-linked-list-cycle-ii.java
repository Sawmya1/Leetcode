public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode entry = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(slow != entry){
                    slow = slow.next;
                    entry = entry.next;
                }
            return entry;
            }
        }
        return null;
 //        ListNode tortoise = head, hare = head;
 //        do{
 //            if(hare == null || hare.next == null)
 //                return null;
 //            tortoise=tortoise.next;
 //            hare=hare.next.next;           
 //        }while(tortoise != hare); //untill true repeat
 // //we can also do hare = head here and replece head with hare in further steps
 //        while(tortoise != head){
 //            tortoise=tortoise.next;
 //            head=head.next;
 //        }
 //        return head;
    }
}