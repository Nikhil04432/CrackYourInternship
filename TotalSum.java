public class TotalSum  {
  
    int totalCount(int k, int[] arr) {
        // code here
         int count = 0;
         for(int ele : arr){
             count += (ele + k -1) / k;
         }
         return count;
    }
}