package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayInsertAtEnd {

/*

    Given an array arr that is not completely filled and a value a, you have to insert the value at the end of the array.


    Input: arr[] = [1, 2, 3, 4, 5], val = 90
    Output: [1, 2, 3, 4, 5, 90]
    Explanation: After inserting 90 at the end, we have array elements as 1 2 3 4 5 90.

    Input: arr[] = [1, 2, 3], val = 50
    Output: [1, 2, 3, 50]
    Explanation: After inserting 50 at the end, we have array elements as 1 2 3 50.
*/


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        insertAtEnd(list, 90);
        System.out.println(list);



    }

    public static void insertAtEnd(ArrayList<Integer> arr, int val) {
        arr.add(val);
    }

}
