import java.util.*;

class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}


public class Merge2BST {
    public static void main(String[] args) {
        
    }
    
    void inorder(Node root, List<Integer> arr) {
        if (root == null) return;
        inorder(root.left, arr);
        arr.add(root.data);
        inorder(root.right, arr);
    }

    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> arr = new ArrayList<>();
        inorder(root1, arr);
        inorder(root2, arr);
        Collections.sort(arr);
        return arr;
    }

}

