public class RoofTop  {
    public int maxStep(int arr[]) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i= 0; i < arr.length -1; i++){
            if(arr[i] < arr[i+1]){
                count++;
            }
            else{
                count = 0;
            }
            max = Math.max(max,count);
        }
        
        return max;
    }
}