import java.util.ArrayList;

class GfgPOTD {
    void rearrange(ArrayList<Integer> arr) {
        // Create new arrays to hold positive and negative numbers
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int ele : arr) {
            if (ele < 0) {
                neg.add(ele);
            } else {
                pos.add(ele);
            }
        }
        
        // Merge the lists in alternate positions
        int i = 0, j = 0, k = 0;
        while (i < pos.size() && j < neg.size()) {
            arr.set(k++, pos.get(i++));  // Set positive number
            arr.set(k++, neg.get(j++));  // Set negative number
        }
        
        // Add remaining positive numbers if any
        while (i < pos.size()) {
            arr.set(k++, pos.get(i++));
        }
        
        // Add remaining negative numbers if any
        while (j < neg.size()) {
            arr.set(k++, neg.get(j++));
        }
    }
}

