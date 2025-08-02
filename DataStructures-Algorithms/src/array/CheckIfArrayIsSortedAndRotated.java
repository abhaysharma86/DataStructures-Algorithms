package array;

public class CheckIfArrayIsSortedAndRotated {

    public static void main(String[] args) {

        CheckIfArrayIsSortedAndRotated checkIfArrayIsSortedAndRotated = new CheckIfArrayIsSortedAndRotated();
        int arr[] = {13 ,17, 22, 36, 41, 44, 68, 74, 75, 2};
        boolean sortedRotated = checkIfArrayIsSortedAndRotated.isSortedRotated(arr);
        System.out.println(sortedRotated);

    }

    public boolean isSortedRotated(int[] arr) {

        int smallest = arr[0];
        int position = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest)
            {
                smallest = arr[i];
                position  = i;
            }
        }

        if(position == 0 || (position == arr.length - 1 && arr[0] > arr[arr.length - 2])){
            return false;
        }
        return true;
    }

}
