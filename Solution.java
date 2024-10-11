


import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        // Code here\
        int n = arr.size();
        HashSet<Integer> set = new HashSet<>();
        
        // Add each element which is not -1 to the set
        for (int i = 0; i < n; i++) {
            if (arr.get(i) != -1) {
                set.add(arr.get(i));
            }
        }
        
        // Navigate through the list, and put arr[i] = i if i is present in the set
        for (int i = 0; i < n; i++) {
            if (set.contains(i)) {
                arr.set(i, i);
            } else {
                arr.set(i, -1);
            }
        }
        
        return arr;
    }
}