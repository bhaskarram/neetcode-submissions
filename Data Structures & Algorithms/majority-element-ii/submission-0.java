class Solution {
    public List<Integer> majorityElement(int[] nums)  {
        int n = nums.length;
        
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        
        for (int num : nums) {
            if (count1 > 0 && num == candidate1) {
                count1++;
            } else if (count2 > 0 && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        List<Integer> result = new ArrayList<>();
                int verify1 = 0, verify2 = 0;
        for (int num : nums) {
            if (num == candidate1) verify1++;
            else if (num == candidate2) verify2++;
        }
        
        if (verify1 > n / 3) result.add(candidate1);
        if (candidate1 != candidate2 && verify2 > n / 3) result.add(candidate2);
        
        return result;
    }
}