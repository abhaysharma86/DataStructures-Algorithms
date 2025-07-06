package array;

import java.util.ArrayList;

public class ArrayInsertAtIndex {

/*

    You are given an array arr(0-based index) and two positive integer index and val. You need to insert an val at given index.

    Input: arr[] = [1, 2, 3, 4, 5], index = 5, val = 90
    Output: 1 2 3 4 5 90
    Explanation: 90 is inserted at index 5(0-based indexing). After inserting,array elements are like [1, 2, 3, 4, 5, 90].


    Input: arr[] = [1, 2, 3, 4, 5], index = 2, val = 90
    Output: [1, 2, 90, 3, 4, 5]
    Explanation: 90 is inserted at index 2(0-based indexing). After inserting, array elements are like [1, 2, 90, 3, 4, 5].
*/


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        insertAtIndex(list, 2,90);
        System.out.println(list);


    }


    public static void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        arr.add(index,val);
    }
}
