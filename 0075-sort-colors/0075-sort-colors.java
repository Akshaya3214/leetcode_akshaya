class Solution {
    public void sortColors(int[] nums) {
        int count0=0, count1=0, count2=0;
        int n=nums.length;

        for(int i : nums){
            if(i==0) count0++;
            else if(i==1) count1++;
            else count2++;
        }
        int index=0;
        while(count0-- > 0) nums[index++]=0;
        while(count1-- > 0) nums[index++]=1;
        while(count2-- > 0) nums[index++]=2;

    }
}