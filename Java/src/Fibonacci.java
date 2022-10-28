/*
Problem:
The Fibonacci numbers, commonly denoted F(n) form a sequence,
called the Fibonacci sequence, such that each number is the sum
of the two preceding ones, starting from 0 and 1.

Given n, calculate F(n).

Runtime: 0ms Memory: 40.8MB
 */

class Fibonacci {
    public static void main(String[] args){
        System.out.println("Please enter the desired Fibonacci series: ");
        int input = SavitchIn.readInt();
        System.out.println("Result: " + fibonacci(input));
    }

    private static int fibonacci(int fibNumber){
        // If n is one or less, we can return n itself
        if (fibNumber <= 1)
            return fibNumber;
        // Otherwise we create an array with the length of n + 1
        int[] fib_cache = new int[fibNumber + 1];
        // We hardcode that the second element of the array is 1 (because the fib of 1 is 1)
        fib_cache[1] = 1;

        // Now we loop through the array, starting from two until we arrived at the length of n
        for(int i = 2; i <= fibNumber; i++) {
            fib_cache[i] = fib_cache[i - 1] + fib_cache[i - 2];
        }
        return fib_cache[fibNumber];
    }
}