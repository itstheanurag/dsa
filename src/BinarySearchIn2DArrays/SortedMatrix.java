package BinarySearchIn2DArrays;

public class SortedMatrix {
    public static void main(String[] args) {

    }

    static int[] binarySearch(int[][] matrix, int row, int col, int target) {
        while(row <= col) {
            int mid = row + (col - row) / 2;
            if(matrix[row][mid] == target) return new int[]{row, col};

            if(matrix[row][mid] > target) {
                row = mid + 1;
            } else {
                col = mid -1 ;
            }
        }
        return new int[]{-1,-1};

    }

    static int[] search(int[][] nums,int target) {
        int rows = nums.length;
        int cols = nums[0].length;

        if(rows == 1) {
            return binarySearch(nums, rows, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols/2;


        return new int[]{-1,-1};
    }
}
