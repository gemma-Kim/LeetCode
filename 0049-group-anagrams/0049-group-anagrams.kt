class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map: MutableMap<String, MutableList<String>> = HashMap();
        for (i in 0 until strs.size) {
            val orginChar = strs.get(i);
            val sortedChar = orginChar.toCharArray().sorted().joinToString("")
            val value = map.getOrPut(sortedChar) { mutableListOf() }
            value.add(orginChar)
        }
        val result: MutableList<List<String>> = mutableListOf()
        for (value in map.values) {
            result.add(value)
        }
        return result;
    }
}