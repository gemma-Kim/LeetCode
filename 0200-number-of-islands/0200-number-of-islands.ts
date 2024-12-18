function numIslands(grid: string[][]): number {
    let numsOfIslands = 0
    if (grid.length == 0) return numsOfIslands

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == '1') {
                numsOfIslands++
                dfs(grid, i, j)
            }
        }
    }
    return numsOfIslands
};

function dfs(grid: string[][], i: number, j: number): void {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] === '0') return;

    grid[i][j] = '0';

    dfs(grid, i - 1, j); 
    dfs(grid, i + 1, j); 
    dfs(grid, i, j - 1); 
    dfs(grid, i, j + 1); 
}