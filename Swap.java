import java.util.List;

public class Swap {
    public boolean checkSorted(List<Integer> arr) {
        int swaps=0;
        int n=arr.size();
        for(int i=0;i<n;i++){
            int swapIndex=i;
            int swapIndexValue=arr.get(i);
            for(int j=i+1;j<n;j++){
                if(arr.get(j)<arr.get(i) && arr.get(j) < swapIndexValue){
                   swapIndex=j;
                   swapIndexValue=arr.get(j);
                }
            }
            if(swapIndex!=i){
                 arr.set(swapIndex,arr.get(i));
                 arr.set(i,swapIndexValue);
                 swaps++;
            }
            if(swaps > 2)
            return false;
        }
        if(swaps==2 || swaps==0)
        return true;
        
        
        return false;
    }
    
    public boolean isSorted(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i-1)) return false;
        }
        return true;
    }
    
    public void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
    
}

