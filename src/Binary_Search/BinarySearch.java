package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        /*
        Binary search is used in sorted arrays to find the elements
        it reduces the lookup time to logn which comes around 20 lookups
        for an array of size 1 million
         */

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 12;

        System.out.println(search(array, target));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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
