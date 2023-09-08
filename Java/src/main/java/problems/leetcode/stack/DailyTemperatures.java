package problems.leetcode.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            // While the stack is not empty and the current temperature is greater than the temperature at the index
            // stored at the top of the stack, we have found a warmer day.
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                // Get the index of the temperature for which we found a warmer day.
                int prevIndex = stack.pop();

                // Calculate the number of days waited and store it in the answer array.
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }

    public int[] dailyTemperaturesSlow(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        int counter = 0;
        for (int i = 0; i < temperatures.length; i++) {
            counter = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                counter++;
                if (temperatures[j] > temperatures[i]){
                    answer[i] = counter;
                    break;
                }
            }
        }
        return answer;
    }
}
