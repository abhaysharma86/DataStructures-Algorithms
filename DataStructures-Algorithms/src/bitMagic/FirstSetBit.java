package bitMagic;

public class FirstSetBit {


    /*Given an integer n. You have to return the position of the first set bit  from the right side in
    the binary; representation of the number. If there is no set bit in the integer N, then return 0 from the function*/

    /*Input: n = 18
    Output: 2
    Explanation: Binary representation of 18 is 010010,the first set bit from the right side is at position 2.


    Input: n = 12
    Output: 3
    Explanation: Binary representation of  12 is 1100, the first set bit from the right side is at position 3.


    Input: n = 1
    Output: 1
    Explanation: Binary representation of  1 is 1, the first set bit from the right side is at position 1.
    */


    public static void main(String[] args) {

        int n = 18;
        System.out.println(getFirstSetBit(n));
    }


    public static int getFirstSetBit(int n) {
        String str = Integer.toBinaryString(n);
        int size = str.length();
        int indexValue = str.lastIndexOf("1");
        if(indexValue < 0) return -1;
        return (size - indexValue);
    }

}
