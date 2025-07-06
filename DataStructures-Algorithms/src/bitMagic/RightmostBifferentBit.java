package bitMagic;

public class RightmostBifferentBit {

  /*  Given two integers m and n , return the position (1-based from the right) of the
    rightmost bit where they differ in binary, or -1 if both are identical.

    Input: m = 11, n = 9
    Output: 2
    Explanation: Binary representation of the given numbers are: 1011 and 1001, 2nd bit from right is different.

    Input: m = 52, n = 4
    Output: 5
    Explanation: Binary representation of the given numbers are: 110100 and 0100, 5th-bit from right is different.


    Input: m = 29, n = 15
    Output: 2
    Explanation: Binary representation of the given numbers are: 29 in binary is 11101, 15 in binary is 01111. The 2nd bit from the right is different.*/


    public static void main(String[] args) {
        int m = 10, n = 20;
        System.out.println(rightMostDifferentBit(m, n));
    }

    public static int rightMostDifferentBit(int m, int n) {
        int xor = m ^ n;

        if (xor == 0) return -1;

        // Position of the rightmost set bit (1-based index)
        int position = 1;
        while ((xor & 1) == 0) {
            xor >>= 1;
            position++;
        }

        return position;
    }



}
