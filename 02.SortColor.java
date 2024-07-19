class Solution {
    public void sortColors(int[] nums) {
        int i = 0;         // for 0
        int j = 0;         // for 1
        int k = nums.length - 1;  // for 2
        // j is also iterator
        while (j <= k) {
            if (nums[j] == 2) {
                swap(nums, j, k);
                k--;
            } else if (nums[j] == 1) {
                j++;
            } else {        // for nums[j] == 0
                swap(nums, j, i);
                i++;
                j++;
            }
        }
    }

    public void swap(int[] nums, int j, int i) {
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }
}
