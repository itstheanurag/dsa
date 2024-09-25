package Binary_Search;

public class FindPeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13, 12, 11, 10};
        System.out.println(search(array));
    }

//    https://leetcode.com/problems/find-peak-element/

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end ) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                end = mid;
            } else  {
                start = mid + 1;
            }
        }
        return start; // or end both are the same
    }
}
