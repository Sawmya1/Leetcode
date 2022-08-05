public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode tortoise = head, hare = head;
        do{
            if(hare == null || hare.next == null)
                return null;
            tortoise=tortoise.next;
            hare=hare.next.next;           
        }while(tortoise != hare); //untill true repeat
 //we can also do hare = head here and replece head with hare in further steps
        while(tortoise != head){
            tortoise=tortoise.next;
            head=head.next;
        }
        return head;
    }
}