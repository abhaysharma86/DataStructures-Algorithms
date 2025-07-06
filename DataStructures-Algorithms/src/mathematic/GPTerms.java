package mathematic;

public class GPTerms {

//    Given the first 2 terms a and b of a Geometric Series. The task is to find the nth term of the series.

/*
    Input: a = 2, b = 3, n = 1
    Output: 2
    Explanation: The first term is already given in the input as 2
    */

/*

    Input: a = 1, b = 2, n = 5
    Output: 16
    Explanation: Common ratio = 2,Hence Fifth term is 1*(2)(5-1) = 24 = 16 .
*/


    public static void main(String[] args) {

        int a = 2, b = 3, n = 1;
        double r = (double) b/a;
        double nthTerm = a * Math.pow(r, n-1);
        System.out.println(nthTerm);
    }
}
