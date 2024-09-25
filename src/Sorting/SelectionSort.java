package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {-1,23,0,23,1,56,6,3};
        System.out.println(Arrays.toString(sort(nums, "asc")));
        System.out.println(Arrays.toString(sort(nums, "desc")));
    }

    static int[] sort(int[] nums, String order) {

        for(int i = 0; i < nums.length; i++) {
            int lowestIndex = i;

            for(int j = i + 1; j < nums.length; j++) {
                if(order.equals("asc")) {
                    if(nums[lowestIndex] > nums[j]) {
                        lowestIndex = j;
                    }
                } else {
                    if(nums[lowestIndex] < nums[j]) {
                        lowestIndex = j;
                    }
                }
            }

            if(lowestIndex != i) {
                // you can put it in any order
                swap(nums, i, lowestIndex);
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
