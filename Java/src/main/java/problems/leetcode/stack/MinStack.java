package problems.leetcode.stack;

class MinStack {
    private int min;

    private Node topEntry;

    static class Node {
        int val;
        int minValue;
        Node parent;
        Node next;
        Node (int val, Node parent, int minValue){
            this.val = val;
            this.minValue = Math.min(val, minValue);
            if (parent != null) {
                this.parent = parent;
                this.parent.next = this;
            }
        }
    }

    public MinStack() {
        this.min = Integer.MAX_VALUE;
        this.topEntry = null;
    }

    public void push(int val) {
        Node newEntry;
        if (topEntry == null){
            newEntry = new Node(val, null, val);
        } else {
            newEntry = new Node(val, this.topEntry, min);
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
            min = this.topEntry.parent.minValue;
        }

    }

    public int top() {
        return topEntry.val;
    }

    public int getMin() {
        return min;
    }
}
