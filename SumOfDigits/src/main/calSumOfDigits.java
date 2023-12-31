package main;

public class calSumOfDigits {
    int sum = 0;

    public int calculate(int number) {
        // Check if the number is a single digit
        if (number >= 0 && number <= 9) {
            return 0;
        }

        while (number != 0) {
            //pull number
            int digit = number % 10;
            sum += digit;

            //delete last number
            number /= 10;
        }

        return sum;
    }
}
