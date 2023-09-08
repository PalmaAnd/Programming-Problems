package problems.leetcode.stack;
// 0150 - Evaluate Reverse Polish Notation

import java.util.Stack;

public class ReversePolish {
    public int evalRPN(String[] tokens) {
        Stack<Integer> counterStack = new Stack<Integer>();
        for (String token : tokens) {
            if (isNumeric(token)) counterStack.push(Integer.parseInt(token));
            else if (counterStack.size() < 2) return counterStack.pop(); // return the only left entry
            else {
                if (token.equals("+")){
                    counterStack.push(counterStack.pop() + counterStack.pop());
                }
                if (token.equals("-")){
                    // we have to subtract the first entry and add the second one, because for subtraction
                    // it is not commutative
                    counterStack.push(- counterStack.pop() + counterStack.pop());
                }
                if (token.equals("*")){
                    counterStack.push(counterStack.pop() * counterStack.pop());
                }
                if (token.equals("/")){
                    // we have to divide the second entry with the first, because for division
                    // it is not commutative
                    int var1 = counterStack.pop();
                    int var2 = counterStack.pop();
                    if (var1 != 0)
                        counterStack.push(var2 / var1);
                    else
                        return 0; // in theory this check is not needed but I added it for safety reasons
                }
            }
            System.out.println(counterStack.peek());
        }
        return counterStack.pop();
    }

    private static boolean isNumeric(String str){
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e){
            System.out.println("Error occured: " + e.toString());
            return false;
        }
    }
}
