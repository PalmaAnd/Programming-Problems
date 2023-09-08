package problems.leetcode.stack;

public class MinStackTest {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(-3);
        int param_4 = minStack.getMin();
        minStack.pop();
        int param_3 = minStack.top();
        int param_5 = minStack.getMin();
        System.out.println(param_4);
        System.out.println(param_3);
        System.out.println(param_5);

    }
}
