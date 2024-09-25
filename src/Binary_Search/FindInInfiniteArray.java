package Binary_Search;

public class FindInInfiniteArray {
    public static void main(String[] args) {
        /*
        We can assume that there is a sorted array with an infinite length,
        and we have to find an element inside that array.

        since the array is an infinite array, array.length can't be used.
        we can use the binary search on this to find the element

        to do this we first have to find the start and end point.
         */

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 13;

        System.out.println(ans(array, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        // if its smalled than start will always be zero and end will be one.
        while(target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2; // keep increasing the search window exponentially;
            start = temp;
        }

        return search(arr, target, start, end);
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
