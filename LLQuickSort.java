import java.util.Arrays;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }

}

public class LLQuickSort {
    public static Node quickSort(Node node) {
        // Your code here
        Node curr=node;
        int n=0;
        while(curr!=null){
            curr=curr.next;
            n=n+1;
        }
        curr=node;
        int [] arr=new int[n];
        int i=0;
        while(curr!=null){
            arr[i++]=curr.data;
            curr=curr.next;
        }
        Arrays.sort(arr);
        Node head=new Node(arr[0]);
        Node currnew=head;
        for(int j=1;j<arr.length;j++){
            currnew.next=new Node(arr[j]);
            currnew=currnew.next;
        }
        return head;
    }
}