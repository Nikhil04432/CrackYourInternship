public class SunFace {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++){
            if(height[i] > max)
            {
                count++;
            }
            max = Math.max(max,height[i]);
        }
        
        return count;
    }
}