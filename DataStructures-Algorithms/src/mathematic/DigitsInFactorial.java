package mathematic;

import java.math.BigInteger;

public class DigitsInFactorial {

//    Given an integer n, find the number of digits in the value of n factorial.


/*
    Input: n = 5
    Output: 3
    Explanation: Factorial of 5 is 120. Number of digits in 120 is 3 (1, 2, and 0)
*/

/*
    Input: n = 120
    Output: 199
    Explanation: The number of digits in 120! is 199
*/

    public static void main(String[] args) {

        int n = 19;

        BigInteger res = BigInteger.ONE;

        while (n != 0) {
            res = res.multiply(BigInteger.valueOf(n--));
        }

        int count = 0;

        while (res.compareTo(BigInteger.ZERO) > 0) {
            res = res.divide(BigInteger.TEN);
            ++count;
        }

        System.out.println(res + " : " + count);

    }


}
