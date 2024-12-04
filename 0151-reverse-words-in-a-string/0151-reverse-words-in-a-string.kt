class Solution {
    fun reverseWords(s: String): String {
        val ss = s.trim()
        if (ss.isEmpty()) return ""

        val sb = StringBuilder()
        val words = ss.split("\\s+".toRegex())

        for (i in words.size - 1 downTo 0) {
            sb.append(words[i])
            if (i > 0) sb.append(" ")
        }

        return sb.toString()
    }
}