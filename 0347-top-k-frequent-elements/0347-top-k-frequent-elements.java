class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int f = map.get(num);
                map.put(num, f + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }
        list.sort((a, b) -> Integer.compare(b[1], a[1]));
        List<int[]> resultList = list.subList(0, k);
        int[] result = new int[k];
        int idx = 0;
        for (int[] num : resultList) {
            result[idx] = num[0];
            idx++;
        }
        return result;
        
    }
}