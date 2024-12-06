class MinStack {
    Stack<Integer> s;
    Queue<Integer> q;

    public MinStack() {
        s = new Stack();
        q = new PriorityQueue();
    }
    
    public void push(int val) {
        s.push(val);
        q.offer(val);
    }
    
    public void pop() {
        int val = s.pop();
        q.remove(val);
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return q.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */