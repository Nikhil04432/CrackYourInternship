import java.util.ArrayList;

public class SearchRotate{
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int len = arr.size();
        
        for(int i=1;i<=len/2;i++){
            int n = arr.size();
            int last = arr.remove(n-1);
            
            arr.add(0, last);
            int delete = n-i;
            
            arr.remove(delete);
        }
        return arr.get(0);
    }
}