package mathematic;

public class FactorialOfNumber {

    // Given a positive integer n. You have to find factorial of n.
/*
    Input: n = 4
    Output: 24
    Explanation: 4! = 4 * 3 * 2 * 1 = 24
    */
/*
    Input: n = 11
    Output: 39916800
    Explanation: 11! = 11 * 10 * .. * 1 = 39916800
    */

    public static void main(String[] args) {
        int n = 19;
        long res = 1;

        while (n != 0) {
            res = res * n;
            --n;
        }
        System.out.println(res);
    }

}
