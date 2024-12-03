class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        Integer halfNumsSize = nums.length / 2 + 1;
        for (int num : nums) {
            Integer key = num;
            if (map.containsKey(key)) {
                Integer newV = map.get(key) + 1;
                if (halfNumsSize <= newV) return num;
                map.put(Integer.valueOf(num), newV);
            } else {
                Integer newV = 1;
                if (halfNumsSize <= newV) return num;
                map.put(key, 1);
            }
        }
        return -1;
    }
}