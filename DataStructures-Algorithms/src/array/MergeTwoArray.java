package array;

import java.util.ArrayList;

public class MergeTwoArray {
    public static void main(String[] args) {
        int nums1[] = {1}, nums2[] = {0};
        merge(nums1, 1, nums2, 0);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int mSize = Math.min(m, n);
        ArrayList<Integer> nums3 = new ArrayList<>();
        int i = 0, j = 0;
        int index = 0;
        while(i < mSize && j < mSize){
            if(nums1[i] == 0){
                i++;
                continue;
            }

            if(nums2[j] == 0){
                j++;
                continue;
            }

            if(nums1[i] <= nums2[j]){
                nums3.add(nums1[i++]);
            }else{
                nums3.add(nums2[j++]);
            }
        }

        while(i < m){
            nums3.add(nums1[i++]);
        }

        while(j < n){
            nums3.add(nums2[j++]);
        }
        System.out.print(nums3);
    }
}
