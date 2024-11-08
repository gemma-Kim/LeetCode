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

        Queue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            
            // Add element to the heap
            queue.add(new int[]{num, frequency});
            
            // If the heap size exceeds k, remove the least frequent element
            if (queue.size() > k) {
                queue.poll();
            }
        }
        
        // Step 3: Extract the elements from the heap
        int[] result = new int[k];
        int idx = 0;
        while (!queue.isEmpty()) {
            result[idx++] = queue.poll()[0];
        }
        
        return result;
        // Queue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(b[1], a[1]));
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     queue.add(new int[]{entry.getKey(), entry.getValue()});
        // }
        // int[] result = new int[k];
        // int idx = 0;
        // while (k > 0) {
        //     int[] v = queue.poll();
        //     System.out.println(v[0]);
        //     result[idx] = v[0];
        //     idx++;
        //     k--;
        // }
        // return result;
        
    }
}