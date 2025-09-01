class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int cs = 0;
            for(int j=i;j<nums.length;j++){
            cs += nums[j];
            max = Math.max(cs,max);
            }
        }
        return max;
    }
}