class Solution {
    public int rob(int[] nums) {
        //include, contains the nums[j]
        //exclude, not contains the nums[j]
        int include=0,exclude=0;            
        for(int j=0;j<nums.length;j++){
            int i=include;
            int e=exclude;
            include=e+nums[j];
            exclude=Math.max(i,e);
        }
        return Math.max(include,exclude);
    }
}