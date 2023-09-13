package problems.leetcode.utils;

public class MinValueNode {
    public int val;
    public int minValue;
    public MinValueNode parent;
    MinValueNode next;
    public MinValueNode(int val, MinValueNode parent, int minValue){
        this.val = val;
        this.minValue = Math.min(val, minValue);
        if (parent != null) {
            this.parent = parent;
            this.parent.next = this;
        }
    }
}
