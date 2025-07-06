package bitMagic;

public class PowerOfTwoCheck {

/*    Given a non-negative integer n. You have to check if it is a power of 2 or not. */


    /*Input: n = 8
    Output: true
    Explanation: 8 is equal to 2 raised to 3 (23 = 8).

    Input: n = 98
    Output: false
    Explanation: 98 cannot be obtained by any power of 2.


    Input: n = 1
    Output: true
    Explanation: (20 = 1).*/

    public static void main(String[] args) {
        int n = 16; // example input

        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is NOT a power of 2.");
        }
    }

    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
