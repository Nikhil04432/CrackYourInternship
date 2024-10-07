import java.util.PriorityQueue;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeKSort {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(ListNode list : lists){
            while(list != null){
                minheap.add(list.val);
                list = list.next;
            }
        }

        ListNode dummy = new ListNode(1);
        ListNode merge = dummy;

        while(!minheap.isEmpty()){
            dummy.next = new ListNode(minheap.remove());
            dummy = dummy.next;
        }

        return merge.next;
    }
}