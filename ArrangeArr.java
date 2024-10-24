import java.util.ArrayList;

public class ArrangeArr {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n-1; i++){
          if (arr[i] == arr[i+1]){
              arr[i] = 2 * arr[i];
              arr[i+1] = 0;
          }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        int ct = 0;
        for (int num : arr){
            if (num != 0){
                ans.add(num);
                ct++;
            }
        }
        for (; ct<n; ct++){
            ans.add(0);
        }
        return ans;
    }
}