public class MaximumSum  {
    public static long maxSum(int n, int x, int[] arr) {
        int max = -1;  
        int max2 = -1;

  
        for (int i = 0; i < n; i++) {
            int bit = (arr[i] >> (x - 1)) & 1;
            if (bit == 0) {
                max = Math.max(max, arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            int bit = (arr[i] >> (x - 1)) & 1;
            if (bit == 1) {
                max2 = Math.max(max2, arr[i]);
            }
        }


        if (max == -1 || max2 == -1) {
            return -1;  
        }

       
        return max + max2;
    }
}

