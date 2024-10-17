public class AlternateSplitLL {
    // Function to split a linked list into two alternating lists
    Node[] alternatingSplitList(Node head) {
        if (head == null || head.next == null) {
            return new Node[]{head, null}; // Return if there are fewer than two nodes
        }
        
        // Initialize pointers
        Node odd = head;
        Node even = head.next;
        Node oddHead = odd;
        Node evenHead = even;
        
        while (odd != null && even != null && even.next != null) {
            odd.next = even.next; // Link next odd node
            odd = odd.next;       // Move odd pointer forward
            
            if (odd != null) {
                even.next = odd.next; // Link next even node
                even = even.next;     // Move even pointer forward
            }
        }
        
        if (odd != null) {
            odd.next = null; // Set the end of the odd list to null
        }
        if (even != null) {
            even.next = null; // Set the end of the even list to null
        }
        
        return new Node[]{oddHead, evenHead}; // Return both lists
    }
}
