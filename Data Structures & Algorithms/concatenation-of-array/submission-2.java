class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n = new int[2*nums.length];
        int l = nums.length;
        for(int i=0;i<l;i++){
            n[i]=n[i+l]=nums[i];
        }
        return n;
    }
 }