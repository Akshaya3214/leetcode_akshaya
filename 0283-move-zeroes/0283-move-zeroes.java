class Solution {
    public void moveZeroes(int[] nums) {
        int left=0;
        int n=nums.length;

        for(int r=0; r<n; r++){
            if(nums[r]!=0){
                int temp=nums[r];
                nums[r]=nums[left];
                nums[left]=temp;
                left++;
            }
        }
        
    
    }
}