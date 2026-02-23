package array;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {1,2,1,2,1,2}; int val = 2;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int sz = nums.length;
        int j = sz - 1;
        int i = 0;
        int count = 0;
        while(i <= j){
            if(nums[i] == val && nums[j] == val){
                j--;
                continue;
            }
            if(nums[i] == val && nums[j] != val){
                nums[i] = nums[j];
                i++;
                j--;
                count++;
                continue;
            }
            i++;
            count++;
        }
        return count;
    }
}
