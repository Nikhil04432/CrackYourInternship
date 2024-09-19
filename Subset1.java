import java.util.ArrayList;
import java.util.List;

public class Subset1 {
    
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
         FindSubset(nums,0,new ArrayList<>());
         return ans;
    }

    public void FindSubset(int[] nums, int index,List<Integer> sub ){
        if(index == nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[index]);
        FindSubset(nums,index+1,sub);
        sub.remove(sub.size()-1);
        FindSubset(nums,index+1,sub);
    }
   
}