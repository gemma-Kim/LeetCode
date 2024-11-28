class Solution {
    public int findKthLargest(int[] nums, int k) {
        Integer[] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsBoxed, (a, b) -> b - a);
        return numsBoxed[k-1];
    }
}