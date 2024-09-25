package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        /*
        Bubble sort is used for sorting a given array
         */

//        int[] nums = {134,5234,64,645,457,23,45,74,75,2,6,2,1,346,41,1};

        int[] nums = {1,2,3,4,5,7,8,9,10,5,2,4,5,12};
        System.out.println(Arrays.toString(sort(nums, "asc")));
        System.out.println(Arrays.toString(sort(nums, "desc")));
    }

    static int[] sort(int[] nums, String order) {
        for(int i = 0; i < nums.length; i++) {
            int didSwap = 0;
            for(int j = 1; j < nums.length; j++) {
                if(order.equals("asc")) {
                    if(nums[j] < nums[j - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                        didSwap = 1;
                    }
                } else {
                    if(nums[j] > nums[j - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                        didSwap = 1;
                    }
                }
            }
            if (didSwap == 0) {
                break;
            }

        }

        return nums;
    }
}
