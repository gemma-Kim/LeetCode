class Solution {
    fun climbStairs(n: Int): Int {
        return bottonToTop(n)
    }

    fun bottonToTop(n: Int): Int {
        if (n === 1) return 1
        if (n === 2) return 2

        val dp = ArrayList<Int>()
        dp.add(1)
        dp.add(2)

        for (i in 2..n-1) {
            dp.add(dp[i-1]+dp[i-2])
        }
        
        return dp[n-1]
    
    }
}