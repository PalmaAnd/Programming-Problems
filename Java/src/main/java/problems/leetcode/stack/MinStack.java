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
        if (val < min) min = val;
        stack.push(val);
    }

    public void pop() {
        int removedItem = (int) stack.pop();
        if (removedItem == min){

        }
    }

    public int top() {
        return (int) stack.get(stack.size() - 1);
    }

    public int getMin() {
        return min;
    }
}
