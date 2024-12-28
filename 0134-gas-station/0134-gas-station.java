class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int curGas = 0;
        int startIndex = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            curGas += gas[i] - cost[i];

            if (curGas < 0) {
                curGas = 0;
                startIndex = i + 1;
            }
        }

        if (totalGas >= totalCost) {
            return startIndex;
        }
        return -1;
    }
}