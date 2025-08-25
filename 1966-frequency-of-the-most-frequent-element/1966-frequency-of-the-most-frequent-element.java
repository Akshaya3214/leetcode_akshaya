class Solution {
    public int maxFrequency(int[] nums, int k) {
        int l=0, r=0;
        long sum=0;
        int res=1;
        Arrays.sort(nums);
        for(r=0; r<nums.length; r++){
            sum += nums[r];

            while((long)nums[r] * (r-l+1) - sum > k){
                sum -= nums[l];
                l++;
            }
            res=Math.max(res, r-l+1);
        }
        return res;
        
        
    }
}