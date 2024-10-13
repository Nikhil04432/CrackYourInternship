public class DelAlterNode{

    public void deleteAlt(Node head) {
        // Code Here
        
        Node fast = head;
        Node temp = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            temp.next = fast;
            temp = fast;
        }
        
    }
}