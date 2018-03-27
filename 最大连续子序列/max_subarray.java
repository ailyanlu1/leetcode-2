public class Solution {
    /**
	 * http://www.lintcode.com/zh-cn/problem/maximum-subarray/#
	 * dp[i]为以a[i]为结尾的最大连续子序列和,则原问题转化为d[1...n]的最大值
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int last = 0;
        for(int i = 0;i<nums.length;i++){
            last = Math.max(0, last) + nums[i];
            ans = Math.max(last, ans);
        }
    
        return ans;
        
        // int max = Integer.MIN_VALUE;
        // int sum = 0;
        // for(int i = 0;i<nums.length;i++){
        //     if(sum>=0){
        //         sum += nums[i];
        //     }else{
        //         sum = nums[i];
        //     }
        //     max = Math.max(max,sum);
        // }
        
        // return max;
    }
}