package Binary_Search;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        // google, amazon question

        //https://leetcode.com/problems/search-in-rotated-sorted-array/description/
        int[] array = {4,5,6,7,0,1,2};
        int target = 1;

        System.out.println(ans(array, target));
    }

    static int ans(int[] arr, int target) {
        int pivot = findPivotPoint(arr);

        if(pivot == -1) {
            return search(arr, target, 0, arr.length - 1);
        }

        if(arr[pivot] == target) {
            return pivot;
        }

        if(target >= arr[0]) {
            return search(arr, target, 0, pivot - 1);
        }

        return search(arr, target, pivot + 1, arr.length - 1);
    }

    // not for duplicated values
    static int findPivotPoint(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end ) {
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int search(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            }
            if(target < arr[mid]) {
                end = mid - 1;
            }

            if(target == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
