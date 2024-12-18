class Solution {
    fun simplifyPath(path: String): String {
        val pathList = path.split(Regex("/+")).filter{ it.isNotEmpty() }
        val stack = Stack<String>()
        for (p in pathList) {
            if (p.equals("..")) {
                if (stack.isNotEmpty()) stack.pop()
            } else if (p.equals(".")) {

            } else {
                stack.push(p)
            }
        }

        return "/" + stack.joinToString(separator = "/")
    }
}