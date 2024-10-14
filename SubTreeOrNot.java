public class SubTreeOrNot {
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
    
    public static boolean isSubTree(Node root, Node subtree){
        if(root == null){
            return false;
        }
    
        if(root.data == subtree.data){
            if(isIdentical(root,subtree)){
                return true;
            }
        }
    
        return isSubTree(root.left,subtree) || isSubTree(root.right,subtree);
    }

    private static boolean isIdentical(Node root, Node subtree) {
        if(root == null && subtree == null ){
            return true;
        }
        else if( root == null  || subtree == null || root.data != subtree.data ){
            return false;
        }
    
        if(!isIdentical(root.left , subtree.left)){
            return false;
        }
    
        if(!isIdentical(root.right, subtree.right)){
            return false;
        }
    
        return true;
    }
}



