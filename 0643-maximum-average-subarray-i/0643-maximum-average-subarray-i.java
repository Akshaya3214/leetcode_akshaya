class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxsum = 0;
        for(int i=0; i<k; i++){
            maxsum += nums[i];
        }
        double cur_sum=maxsum;

        for(int i=k; i<n; i++){
            cur_sum += nums[i]-nums[i-k];
            maxsum = Math.max(maxsum, cur_sum);
        }
        return maxsum/k;
    }
}