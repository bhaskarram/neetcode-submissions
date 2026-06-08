class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        
        for (int a = 0; a < n; a++) {
            for (int b = a + 1; b < n; b++) {
                for (int c = b + 1; c < n; c++) {
                    for (int d = c + 1; d < n; d++) {
                        long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                        if (sum == target) {
                            List<Integer> quad = Arrays.asList(nums[a], nums[b], nums[c], nums[d]);
                            Collections.sort(quad);
                            result.add(quad);
                        }
                    }
                }
            }
        }
        
        return new ArrayList<>(result);
    }
}