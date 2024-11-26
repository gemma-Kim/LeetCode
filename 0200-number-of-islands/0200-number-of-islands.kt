class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        var numOfIslands = 0
        if (grid[0].size == 0) return numOfIslands
        for (i in 0..grid.size-1) {
            for (j in 0..grid[0].size-1) {
                if (grid[i][j] == '1') {
                    numOfIslands++
                    dfs(grid, i, j)
                }
            }
        }
        return numOfIslands
    }

    fun dfs(grid: Array<CharArray>, i: Int, j: Int) {
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] == '0') return
        grid[i][j] = '0'
        dfs(grid, i-1, j)
        dfs(grid, i+1, j)
        dfs(grid, i, j-1)
        dfs(grid, i, j+1)
    }
}