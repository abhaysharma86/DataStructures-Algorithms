package bitMagic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountSetBits {


/*
    You are given a number n. Find the total count of set bits for all numbers from 1 to n (both inclusive).
*/

   /* Input: n = 4
    Output: 5
    Explanation: For numbers from 1 to 4. For 1: 0 0 1 = 1 set bits For 2: 0 1 0 = 1 set bits For
    3: 0 1 1 = 2 set bits For 4: 1 0 0 = 1 set bits Therefore, the total set bits is 5.

    Input: n = 17
    Output: 35
    Explanation: From numbers 1 to 17(both inclusive), the total number of set bits is 35.*/


    public static void main(String[] args) {
        int n = 17;
        System.out.println(countSetBits(n));

    }

    public static int countSetBits(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int i1 = checkSetBit(i);
            result += i1;
        }
        return result;
    }

    public static int checkSetBit(int n) {
        String binaryString = Integer.toBinaryString(n);
        int length = binaryString.length();
        boolean contains = binaryString.contains("1");
        if (!contains) return 0;
        int count = 0;
        char[] charArray = binaryString.toCharArray();
        for (char c : charArray) {
            if (c == '1') {
                ++count;
            }
        }
        return count;
    }


}
