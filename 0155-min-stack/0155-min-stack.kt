class MinStack() {
    val s = Stack<Int>();
    val minS = Stack<Int>();

    fun push(`val`: Int) {
        s.push(`val`);    
        if (minS.isEmpty() || minS.peek() >= `val`) minS.push(`val`);
    }

    fun pop() {
        val v = s.pop();
        if (v == minS.peek()) minS.pop();
    }

    fun top(): Int {
        return s.peek();
    }

    fun getMin(): Int {
        return minS.peek();
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */