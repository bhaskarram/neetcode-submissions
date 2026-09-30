class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> distinct = new ArrayList<>();
        List<Integer> freq = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            if (!distinct.contains(nums[i])) {
                distinct.add(nums[i]);
                freq.add(count);
            }
        }

        List<int[]> pairs = new ArrayList<>();
        for (int i = 0; i < distinct.size(); i++) {
            pairs.add(new int[] {distinct.get(i), freq.get(i)});
        }

        pairs.sort((a, b) -> b[1] - a[1]);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pairs.get(i)[0];
        }
        return res;
    }
}
