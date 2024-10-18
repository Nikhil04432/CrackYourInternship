public class SingleNumber  {
    int getSingle(int arr[]) {
        int ans = 0;
        
        for(int i : arr){
            ans ^= i;
        }
        
        return ans;
    }
}