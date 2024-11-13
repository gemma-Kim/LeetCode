class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // sorting nums by increasing
        Arrays.sort(nums);
        // add how many counts of each value in nums to priority queue (pq)
        Queue<ArrayList<Integer>> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.get(1), a.get(1)));
        // ArrayList<Integer> = [0: num, 1: counts of nums array]
        ArrayList<Integer> l = new ArrayList<>();
        l.add(nums[0]);
        l.add(1);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                l.set(1, l.get(1) + 1); // 빈도수 증가
            } else {
                pq.add(l); // 현재 숫자와 빈도수 추가
                l = new ArrayList<>(); // 새 리스트로 초기화
                l.add(nums[i]);
                l.add(1);
            }
        }
        pq.add(l); // 마지막 숫자와 빈도수 추가

        // make result int array by while loop with k parameter
        int[] result = new int[k];
        int idx = 0;
        System.out.println(pq);
        while (k > 0) {
            result[idx] = pq.poll().get(0);
            idx++;
            k--;
        }

        return result;

    }
}