public class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int F = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F += i * nums[i];
        }
        int max_val = F;
        for (int k = 1; k < n; k++) 
        {
            F = F + sum - n * nums[n - k];
            max_val = Math.max(max_val, F);
        }
        return max_val;
    }
}
