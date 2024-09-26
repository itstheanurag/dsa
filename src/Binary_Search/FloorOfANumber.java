package Binary_Search;

public class FloorOfANumber {
    public static void main(String[] args) {
        /*
        Floor of a number is such that nums[mid] <= n;
         */

        int[] nums = new int[]{1,2,3,4,5,6,8,10,10,11};
        int target = 7;
        System.out.println(findTheFloorOfANumber(nums, target));
    }

    static int findTheFloorOfANumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        // in case we don't have a floor return -1
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] <= target) {
                ans = nums[mid];
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
