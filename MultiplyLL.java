class Node
{
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}

public class MultiplyLL {
    public long multiplyTwoLists(Node first, Node second) {
        long s1 = 0;
        long s2 = 0;
        long mod = 1000000007; // 1e9 + 7
        
        // Convert first linked list into a number
        while (first != null) {
            s1 = (s1 * 10 + first.data) % mod;
            first = first.next;
        }
        
        // Convert second linked list into a number
        while (second != null) {
            s2 = (s2 * 10 + second.data) % mod;
            second = second.next;
        }
        
        // Return the product modulo (1e9 + 7)
        return (s1 * s2) % mod;
    }
}
