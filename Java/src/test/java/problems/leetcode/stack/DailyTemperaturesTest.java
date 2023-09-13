package problems.leetcode.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {

    @Test
    void testSampleInput() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    void testAllTemperaturesSame() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = {60, 60, 60, 60, 60};
        int[] expected = {0, 0, 0, 0, 0};
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    void testIncreasingTemperatures() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = {50, 55, 60, 65, 70};
        int[] expected = {1, 1, 1, 1, 0};
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    void testDecreasingTemperatures() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = {70, 65, 60, 55, 50};
        int[] expected = {0, 0, 0, 0, 0};
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }

    @Test
    void testEmptyInput() {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int[] temperatures = {};
        int[] expected = {};
        int[] result = dailyTemperatures.dailyTemperatures(temperatures);
        assertArrayEquals(expected, result);
    }
}
