package mathematic;

public class FindAbsoluteValue {

//    You are given an integer n, find the absolute value of the integer n.


    /*
    Input: n = -32
    Output: 32
    Explanation:The absolute value of -32 is 32.
    */

    /*
    Input: n = 45
    Output: 45
    Explanation: The absolute value of 45 is 45 itself.
    */

    public static void main(String[] args) {

        int n = -32;
        int absValue = n < 0 ? -n : n;

        System.out.println(absValue);


    }


}
