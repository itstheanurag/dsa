package Binary_Search;

public class SearchInsertPosition {
    public static void main(String[] args) {
        /*
        Given a sorted array 'nums' and a number 'n',
        find the position where n should be inserted such that
        array remains sorted

        its just another version of the lower bound;
         */


        int[] nums = new int[]{1,2,3,4,5,6,7,8,10,10,11};
        int target = 7;
        System.out.println(lowerBound(nums, target));
    }

    static int lowerBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
