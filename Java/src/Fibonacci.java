class Fibonacci {
    public static void main(String[] args){
        System.out.println("Bitte geben Sie die gewünschte Fibonacci Reihe ein");
        int input = SavitchIn.readInt();
        System.out.println("Das Ergebnis lautet: " + fibonacci(input));
    }

    private static int fibonacci(int fibNumber){
        // If the given number is 2 or less, we can safely return 1, as this is defined by fibonacci
        if (fibNumber <= 2)
            return 1;
        else
            // If the given number is more then 2, we calculate the wanted value by calling the function recursevly
            return (fibonacci(fibNumber-1) + fibonacci(fibNumber-2));
    }
}