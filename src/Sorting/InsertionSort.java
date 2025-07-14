package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {134,5234,64,645,457,23,45,74,75,2,6,2,1,346,41,1};
        int[] arr = {1,2,3,4,5,7,8,9,10,5,2,4,5,12};
        System.out.println(Arrays.toString(sort(nums)));
        System.out.println(Arrays.toString(sort(arr)));
    }

   static int[] sort(int[] nums){

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j > 0; j--) {
                if(nums[j] < nums[j-1]) {
                    swap(nums, j, j -1);
                } else break;
            }
        }

        return nums;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
