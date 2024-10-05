{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}

public class ReverseDelete {

    // Function to reverse a circular linked list
    Node reverse(Node head) {
          Node prev = null;
        Node curr = head;
        Node frw = head.next;
        while(frw != head){
            curr.next = prev;
            prev = curr;
            curr = frw;
            frw = frw.next;
        }
        curr.next = prev;
        frw.next = curr;
        return curr;
       
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
      Node temp = head;
        if(head.data == key){
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            return head.next;
        }
        while(temp.next.data!=key && temp.next != head){
            temp = temp.next;
        }
        if(temp.next.data == key) temp.next = temp.next.next;
        return head;
    }
}