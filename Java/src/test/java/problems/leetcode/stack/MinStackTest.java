package problems.leetcode.stack;

public class MinStackTest {
    public static void main(String[] args) {
        testCase1();
        testCase2();
    }

    public static void testCase1(){
        System.out.println("Start test1");
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(-3);
        int param_1 = minStack.getMin();
        minStack.pop();
        int param_2 = minStack.top();
        int param_3 = minStack.getMin();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println("Ende   test1");

    }

    public static void testCase2(){
        System.out.println("Start test2");
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        int param_1 = minStack.getMin();
        minStack.pop();
        int param_2 = minStack.getMin();
        minStack.pop();
        int param_3 = minStack.getMin();
        minStack.pop();
        int param_4 = minStack.getMin();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
        System.out.println("End  test2");
    }
}
