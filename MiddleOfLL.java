class Node {
    int data;
     Node next;
     Node(int d)  { data = d;  next = null; }
 }
public class MiddleOfLL {
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        
        if(head == null )  return -1;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow.data;
    }
}
