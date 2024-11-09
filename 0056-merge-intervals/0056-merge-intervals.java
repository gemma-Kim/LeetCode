class Solution {
    private boolean ifOverlap(int[] i1, int[] i2) {
        int i1_end = i1[1];
        int i2_start = i2[0];
        if (i1_end >= i2_start) {
            return true;
        }
        return false;
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList();

        for (int[] interval : intervals) {
            if (!result.isEmpty()) {
                int[] last_e = result.get(result.size()-1);
                if (ifOverlap(last_e, interval)) {
                    
                    int[] new_last_e = new int[]{last_e[0], Math.max(last_e[1], interval[1])};
                    result.set(result.size()-1, new_last_e);
                    continue;
                }
            }
            result.add(interval);
        }

        return result.toArray(new int[result.size()][]);
        // int[][] final_result = new int[result.size()][];
        // for (int i = 0; i < result.size(); i++) {
        //     final_result[i] = result.get(i);
        // }

        // return final_result;
    }
}