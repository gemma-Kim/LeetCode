class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> newStrs = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            String orginStr = new String(strs[i]);
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedChars = new String(chars);
            List<String> value = newStrs.getOrDefault(sortedChars, new ArrayList());
            value.add(orginStr);
            newStrs.put(sortedChars, value);
        }
        List<List<String>> result = new ArrayList();
        for (List<String> value : newStrs.values()) {
            result.add(value);
        }
        return result;
    }
}