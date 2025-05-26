class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> list = new ArrayList();
        list.add(1);
        result.add(list);
        if (numRows > 1) {
            list = new ArrayList();
            list.add(1);
            list.add(1);
            result.add(list);
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> lastList = result.get(result.size()-1);
            List<Integer> newLastList = new ArrayList();
            newLastList.add(1);
            for (int j = 0; j < lastList.size()-1; j++) {
                Integer a = lastList.get(j) + lastList.get(j+1);
                newLastList.add(a);
            }
            newLastList.add(1);
            result.add(newLastList);
        }
        return result;
    }
}