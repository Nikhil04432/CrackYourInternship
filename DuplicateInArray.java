import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateInArray{
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int ele : arr){
            if(!map.containsKey(ele)){
                map.put(ele,0);
                list.add(ele);
            }
        }
        
        return list;
    }
}