package Sorting;

import java.util.Arrays;

// will work only for distinct sorted positive and continous elements

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {12, 9, 7, 4, 10, 11, 2, 1, 3, 5, 6, 8 };
        System.out.println(Arrays.toString(sort(nums)));
//        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] nums) {
        int i = 0;
        //if nums contains 0, correct index will be element;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;

            if(nums[i] != nums[ correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
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
