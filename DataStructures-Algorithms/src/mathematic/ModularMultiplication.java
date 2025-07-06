package mathematic;

public class ModularMultiplication {

/*
    Given three integers a, b, and M, your task is to compute the result of the modular addition operation:
    Note: Modular operations returns the remainder when divided by M. The result will always be an integer between 0 and M−1.
    */
/*

    Input: a = 10, b = 20, M = 3
    Output: 0
    Explanation: (10 + 20) mod 3 = 0
*/
/*

    Input: a = 100, b = 13, M = 107
    Output: 6
    Explanation: (100 + 13) mod 107 = 6
*/


    public static void main(String[] args) {

        int a = 5, b = 3, M = 11;

        int result = ((a % M) * (b % M)) % M;

        // Ensure result is always non-negative (important if a or b are negative)
        if (result < 0) {
            result += M;
        }

        System.out.println("Result of (a * b) % M = " + result);
    }
}
