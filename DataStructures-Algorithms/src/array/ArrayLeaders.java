package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {

    public static void main(String[] args) {

        int arr[] = {30, 10, 10, 5};

        ArrayList<Integer> leaders = leaders(arr);
        System.out.println(leaders);

    }

    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();
        int baseLeader = arr[arr.length-1];
        list.add(baseLeader);
        for(int i = arr.length - 2; i >= 0 ; i--){
            if(arr[i] >= baseLeader){
                list.add(arr[i]);
                baseLeader = arr[i];
            }
        }
        ArrayList arrayList = new ArrayList<>();
        arrayList.addAll(list.reversed());
        return arrayList;
    }
}
