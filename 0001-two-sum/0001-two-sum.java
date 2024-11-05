class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap();
        HashMap<String, Integer> map2 = new HashMap();
        map2.put("1", 1);
        Boolean a = map2.containsValue(0);
        System.out.println(a);
        for (int i = 0; i < nums.length; i++) {
            Integer complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}