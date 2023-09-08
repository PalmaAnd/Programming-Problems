package problems.leetcode.stack;

import java.util.Arrays;

public class DailyTemperaturesTest {
    public static void main(String[] args) {
        int [] temperatures = {73,74,75,71,69,72,76,73};
        DailyTemperatures dailyTemp = new DailyTemperatures();
        int [] daysTillHotter = dailyTemp.dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(daysTillHotter));
    }
}
