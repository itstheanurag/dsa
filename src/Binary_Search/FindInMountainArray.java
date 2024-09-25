package Binary_Search;

public class FindInMountainArray {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-in-mountain-array/description/

        /*
        Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
        You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

        MountainArray.get(k) returns the element of the array at index k (0-indexed).
        MountainArray.length() returns the length of the array.
        Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
         */

        // 1. find the peek index
        // 2. once index is found look in the 0, to peek
        // index is not found then look in peek + 1, array.length - 1
        int[] array = {1,2,3,4,5,3,1};
        int target = 3;

        System.out.println(ans(array, target));
    }

    static int ans(int[] array, int target) {
        int peek = findPeekIndex(array);
        int searchInFirstHalf = orderAgnosticBinarySearch(array, target, 0, peek);
        if(searchInFirstHalf != -1) return searchInFirstHalf;
        return orderAgnosticBinarySearch(array, target, peek + 1, array.length -1);
    }

    static int findPeekIndex(int[] arr) {
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

    static int orderAgnosticBinarySearch(
            int[] arr,
            int target,
            int start,
            int end
    ) {

        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) /2 ;
            if(target == arr[mid]) {
                return mid;
            }
            if(isAsc) {
                if(target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
