package bitMagic;

public class BitDifference {

 /*  You are given two numbers a and b. The task is to count the number of bits needed to be flipped to convert a to b.
    Note : flipping of bit means inverting its value -- changing 1 to 0 and 0 to 1

    Input: a = 10, b = 20
    Output: 4
    Explanation: a  = 01010, b  = 10100, As we can see, the bits of A that need to be flipped are 01010. If we flip these bits, we get 10100, which is B.

    Input: a = 20, b = 25
    Output: 3
    Explanation: a  = 10100, b  = 11001, As we can see, the bits of A that need to be flipped are 10100. If we flip these bits, we get 11001, which is B.*/


    public static void main(String[] args) {
        int m = 10, n = 20;
        System.out.println(rightMostDifferentBit(m, n));
    }

    public static int rightMostDifferentBit(int m, int n) {
        int xor = m ^ n;

        if (xor == 0) return -1;

        // Position of the rightmost set bit (1-based index)
        int position = 0;
        String binaryString = Integer.toBinaryString(xor);
        char[] charArray = binaryString.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == '1'){
                position++;
            }
        }

        return position;
    }



}
