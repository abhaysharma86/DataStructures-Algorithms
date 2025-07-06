package bitMagic;

public class SwapOddAndEvenBits {


   /* Given an unsigned integer n, You have  to swap all even-position bits with their rightside adjacent odd-position bits.*/

/*
    Input: n = 23
    Output: 43
    Explanation: Binary representation of the given number  is 00010111 after swapping  00101011 = 43 in decimal.


    Input: n = 2
    Output: 1
    Explanation: Binary representation of the given number is 10 after swapping 01 = 1 in decimal.
10111 -> 11011

    */

    public static void main(String[] args) {

        int  n = 23;

        String binaryString = Integer.toBinaryString(n);

        StringBuffer re = new StringBuffer(binaryString);
        System.out.println(re.reverse());
        char[] charArray = binaryString.toCharArray();
        System.out.println(binaryString);
        for(int i = 0; i < charArray.length-1; i++){

        }


    }

}
