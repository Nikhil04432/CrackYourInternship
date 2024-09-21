
class Node {
    int data;
    Node next, random;

    Node(int d)
    {
        data = d;
        next = random = null;

    }
}

public class CloneLL{

    // Function to clone a linked list with next and random pointer.
    Node copyList(Node head) {
        if (head == null) return null;

        // Step 1: Copy each node and insert the copied node after the original node.
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.data);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers to the copied nodes.
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the cloned list from the original list.
        curr = head;
        Node dummy = new Node(0);  // Dummy node to help in separating the list.
        Node copyCurr = dummy;

        while (curr != null) {
            copyCurr.next = curr.next;
            curr.next = curr.next.next;  // Restore the original list.

            curr = curr.next;  // Move to the next original node.
            copyCurr = copyCurr.next;  // Move to the next cloned node.
        }

        // Return the head of the copied list.
        return dummy.next;
    }
}