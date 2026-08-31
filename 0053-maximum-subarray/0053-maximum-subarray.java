class Solution {
    public int maxSubArray(int[] nums) {
     int cursum=0,max=Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        cursum+=nums[i];
        max =Math.max(max,cursum);
        if(cursum<0)
            cursum=0;
     }
        return max;
     
    }
}