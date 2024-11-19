class Solution {
    public int climbStairs(int n) {
        return climbStairs2(n);
    }

    public int climbStairs1(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs1(n-1) + climbStairs1(n-2);
    }

    public int climbStairs2(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n+1];
        dp[0]= 1;
        dp[1]= 2;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n-1];
    }
}