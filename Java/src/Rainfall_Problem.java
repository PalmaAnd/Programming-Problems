/**
 * Description:
 * - Design a program that consumes a list of numbers (integers) representing daily rainfall amounts as entered by a user
 * - The list may contain the number -999 indicating the end of the data of interest
 * - Produce the average of the non-negative values in the list up to the first -999 (if it shows up)
 * - There may be negative numbers other than-999 in the list
 */

public class Rainfall_Problem {
    public static void main(String[] args) {
        int[] fixedArray = {2,3,-100,4,-999,5,-100,6};
        System.out.println(calcRainfallAverage(fixedArray));
    }

    public static int calcRainfallAverage(int[] rainfallData) {
        int average = 0;
        int count = 0;
        for (int i = 0; i < rainfallData.length - 1; i++) {
            if (rainfallData[i] == -999) {
                if (average == 0 || count == 0) return 0;
                return average/count;
            } else if (rainfallData[i] > 0) {
                average += rainfallData[i];
                count++;
            }
        }
        if (average == 0 || count == 0) return 0;
        else return average/count;
    }
}
