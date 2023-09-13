package problems.leetcode.stack;

import problems.leetcode.utils.MinValueNode;

public class MinStack {
    private int min;

    private MinValueNode topEntry;

    public MinStack() {
        this.min = Integer.MAX_VALUE;
        this.topEntry = null;
    }

    public void push(int val) {
        MinValueNode newEntry;
        if (topEntry == null){
            newEntry = new MinValueNode(val, null, val);
        } else {
            newEntry = new MinValueNode(val, this.topEntry, min);
        }
        this.topEntry = newEntry;
        this.min = newEntry.minValue;
    }

    public void pop() {
        int removedMin = this.topEntry.minValue;
        this.topEntry = this.topEntry.parent;
        if (this.topEntry == null){
            min = Integer.MAX_VALUE;
        } else if (removedMin == min) {
            min = this.topEntry.minValue;
        }

    }

    public int top() {
        return topEntry.val;
    }

    public int getMin() {
        return min;
    }

    public boolean isEmpty() {
        return topEntry == null;
    }
}
