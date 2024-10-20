import java.util.PriorityQueue;

class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
public class SortDoublyLL {
    public DLLNode sortAKSortedDLL(DLLNode head, int k) {
        // Code here
       
       PriorityQueue<Integer> minH = new PriorityQueue<>();
        DLLNode curr = head;
        DLLNode prev = head;

        while (prev != null) {
            if (minH.size() == k + 1 || curr == null) {
                prev.data = minH.poll();
                prev = prev.next;
            } else {
                minH.add(curr.data);
                curr = curr.next;
            }
        }
        return head;
        
    }
}