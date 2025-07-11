package BinarySearchIn2DArrays;

import java.util.Arrays;

/**
 * Problem Statement: You have been given a 2-D array 'mat' of size 'N x M' where 'N' and 'M' denote the number of rows and columns, respectively. The elements of each row are sorted in non-decreasing order. Moreover, the first element of a row is greater than the last element of the previous row (if it exists). You are given an integer ‘target’, and your task is to find if it exists in the given 'mat' or not.
 *
 */
public class SearchIn2DSortedArray {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1 ,2 ,3 ,4},
                { 5 ,6 ,7 ,8 , 9},
                { 10, 11 ,12, 13},
                {14, 15 ,16, 17, 18}
        };
        int target = 9;

        // if target is found in the matrix return true
        // O(nlogn complexity)
        /*
        boolean ans = false;
        for(int[] num: matrix) {
            ans = binarySearch(num, target);
            if(ans) {
                System.out.println("target exists");
                break;
            }
        }

        if(!ans) {
            System.out.println("TARGET DOES NOT EXISTS");
        }
         */

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start )/2;

            if(nums[mid] == target) {
                return true;
            }

            if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }

    static int[] search(int[][] nums, int target) {
        int n = nums.length;
        int m = nums[0].length;

        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / m, col = mid % m;
            if (nums[row][col] == target) return new int[]{row,col};
            else if (nums[row][col] < target) low = mid + 1;
            else high = mid - 1;
        }
        return new int[]{-1,-1};
    }
}
