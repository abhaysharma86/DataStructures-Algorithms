package BasicLogicBuilding;

import java.util.Arrays;

public class ArithmeticProgression {

    public static void main(String[] args) {
        int[] arr = {1,4,7,10};
        System.out.println(aP(arr));
    }

    public static boolean aP(int[] arr){

        if(arr.length != 0){
            Arrays.sort(arr);
            int diff = arr[1] - arr[0];
            for(int i = 2; i < arr.length; i++)
            {
                if(arr[i] - arr[i-1] != diff )
                    return false;
            }
            return true;
        }
        return  false;
    }

}
