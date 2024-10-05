 // Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public class PalindromeLL{
    
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;

        // Find the middle of the list while reversing the first half
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            
            // Reverse the first half of the list
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // If the length is odd, move slow pointer one step further
        if (fast != null) {
            slow = slow.next;
        }

        // Compare the reversed first half with the second half
        while (slow != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }
}
