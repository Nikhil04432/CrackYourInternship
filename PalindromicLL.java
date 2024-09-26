import java.util.ArrayList;

class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}

public class PalindromicLL {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
         ArrayList<Integer> list=new ArrayList<Integer>();
        while(head!=null){
            list.add(head.data);
            head=head.next;
        }
        int i=0;
        int j=list.size()-1;
        while(i<j){
            if(!list.get(i).equals(list.get(j)))
                    return false;
            i++;
            j--;
        }
        return true;
        
        
    }
}