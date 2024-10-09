public class Reorder  {
    
    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null , cur = slow;
        ListNode Next;

        while(cur != null){
            Next = cur.next;  // Update Next first
            cur.next = prev;
            prev = cur;
            cur = Next;
        }


        ListNode first = head, second = prev ;

        while(second.next != null){
            Next = first.next;
            first.next = second;
            first = Next;

            Next = second.next ;
            second.next = first;
            second = Next;
        }
    }
}