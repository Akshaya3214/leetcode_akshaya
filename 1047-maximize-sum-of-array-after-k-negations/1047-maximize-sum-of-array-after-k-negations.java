class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            if(k>0 && nums[i]<0){
                nums[i] = -nums[i];
                k-=1;
            }   
        }
        Arrays.sort(nums);
        if(k%2==1){
            nums[0]=-nums[0];
        }
        int sum=0;
        for(int i:nums){
            sum += i;
        }
        return sum;
    }
}