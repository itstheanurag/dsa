package BinarySearchIn2DArrays;

import java.util.Arrays;

public class RowAndColWiseSorted {
    public static void main(String[] args) {

        /*
        *   10 20 30 40
        *   15 25 35 45
        *   28 29 37 49
        *   33 34 38 50
        * */

        int[][] mat = {
                {10, 20 ,30 ,40},
                {15 ,25, 35, 45},
                {28 ,29, 37 ,49},
                {33 ,34, 38 ,50},
        };

        /**
         * Since matrix is sorted row and col wise
         * assume you are searching for element in first row
         * and element = target (return row, col)
         *
         * if(element < mid)
         *    mid is the mid of the first row.
         *    then we know all the col are going to be greater than target
         *    since matrix is sorted col wise as well
         *
         *
         */


        System.out.println(Arrays.toString(search(mat, 35)));

    }

    static int[] search(int[][] nums, int target) {
        int row = 0;
        int col = nums.length - 1;
        while(row <= col) {
           if(nums[row][col] == target) return new int[]{row, col};

           if(nums[row][col] < target) {
               row++;
           } else {
               col--;
           }
        }

        return new int[]{-1,-1};
    }
}
