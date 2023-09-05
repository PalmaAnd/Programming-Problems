package problems.leetcode.stack;

import java.util.Stack;

class MinStack {

    private int min;
    private Stack stack;

    public MinStack() {
        min = Integer.MAX_VALUE;
        stack = new Stack<Integer>();
    }

    public void push(int val) {

    }

    public void pop() {

    }

    public int top() {
        int topValue = (int) stack.get(stack.size());
        return topValue;
    }

    public int getMin() {
        return min;
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