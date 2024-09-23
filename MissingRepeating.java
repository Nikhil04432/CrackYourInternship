import java.util.HashMap;

public class MissingRepeating {
    int[] findTwoElement(int arr[]) {
        int n = arr.length ;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2]; // ans[0] = repeating, ans[1] = missing
        
        // Fill the HashMap with frequencies
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Find the repeating and missing numbers
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                ans[1] = i; // Missing number
            } else if (map.get(i) > 1) {
                ans[0] = i; // Repeating number
            }
        }
        
        return ans;
    }
}