class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()
        for (token in tokens) {
            if (token == "+") {
                stack.push(stack.pop() + stack.pop())
            } else if (token == "*") {
                stack.push(stack.pop() * stack.pop())
            } else if (token == "-") {
                val val1 = stack.pop();
                val val2 = stack.pop();
                stack.push(val2 - val1)
            }  else if (token == "/") {
                val val1 = stack.pop();
                val val2 = stack.pop();
                stack.push(val2 / val1)
            } else {
                stack.push(token.toInt())
            }
        }
        return stack.pop();
    }
}