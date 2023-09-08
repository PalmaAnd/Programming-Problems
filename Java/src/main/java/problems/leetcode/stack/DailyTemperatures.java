package problems.leetcode.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
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
