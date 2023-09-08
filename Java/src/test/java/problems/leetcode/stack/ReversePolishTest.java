package problems.leetcode.stack;

public class ReversePolishTest {
    public static void main(String[] args) {
        ReversePolish polishToken = new ReversePolish();
        String[] input = {"4","13","5","/","+"};
        System.out.println(polishToken.evalRPN(input));
    }
}
