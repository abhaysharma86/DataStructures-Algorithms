package mathematic;

import java.util.Scanner;

public class Exactly3Divisors {
    // Helper method to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Main method to count numbers ≤ n with exactly 3 divisors
    public static void main(String[] args) {
        int n = 10;

        int count = 0;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Count of numbers with exactly 3 divisors: " + count);
    }
}
