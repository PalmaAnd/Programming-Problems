package problems.other;

/*
    Problem:
    You are climbing a staircase. It takes n steps to reach the top.
    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

    Runtime: 0ms Memory: 40.7MB
 */

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println("Please enter how many stairs you want to climb: ");
        int input = SavitchIn.readInt();
        System.out.println("Result: " + calculateSteps(input));
    }

    private static int calculateSteps(int amountOfStairs) {
        // If n is two or less, we can return n itself
        if (amountOfStairs <= 2)
            return amountOfStairs;
        // Otherwise we create an array with the length of n + 1
        int[] cache = new int[amountOfStairs + 1];
        // We hardcode the second and third element of the array
        cache[1] = 1;
        cache[2] = 2;

        // Now we loop through the array, starting from two until we arrived at the length of n
        for (int i = 3; i <= amountOfStairs; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[amountOfStairs];
    }
}
