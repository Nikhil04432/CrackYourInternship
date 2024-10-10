
public class PreOrder {

    static class Node{
        int data;
        Node left ;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }

    static class BinaryTree {
        static int index = -1;
        static Node buildTree(int[] arr) {
            index++;

            if(arr[index] == -1){
                return null;
            }

            Node newNode = new Node(arr[index]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode; //root
        }

       public static void preOrder(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);

        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

    }
    public static void main(String[] args) {
        int[] arr = {12,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node  a = BinaryTree.buildTree(arr);

        //System.out.println(a.data);
       // BinaryTree.preOrder(a);//
        // BinaryTree.inOrder(a);
        BinaryTree.postOrder(a);
    }
}
