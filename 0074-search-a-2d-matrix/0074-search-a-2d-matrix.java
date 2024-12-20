class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = -1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] <= target && matrix[i][matrix[i].length-1] >= target) {
                n = i;
                break;
            } else if (i == matrix.length-1) {
                return false;
            }
        }
        
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[n][i] == target) return true;
        }
        return false;
    }
}