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
        Queue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.add(new int[]{entry.getKey(), entry.getValue()});
        }
        int[] result = new int[k];
        int idx = 0;
        while (k > 0) {
            int[] v = queue.poll();
            System.out.println(v[0]);
            result[idx] = v[0];
            idx++;
            k--;
        }
        return result;
        
    }
}