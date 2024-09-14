public class LongSubArrANDBitwise {
    public int longestSubarray(int[] nums) {
        int ans = 0, count =0, max = 0 ;
       
       for(int i : nums){
            if(i == max ){
                count++;
            }else if(i > max ){
                count = ans = 1;
                max = i;
            }
            else{
                count = 0;
            }

            ans = Math.max(ans, count);
       }
        return ans;
    }
    
}