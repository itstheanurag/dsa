package Binary_Search;

public class LowerBound {
    public static void main(String[] args) {
        /*
        Lower bound arr[mid] >= n;
         */

        int[] nums = new int[]{1,2,3,4,5,8,8,10,10,11};
        int target = 7;
        System.out.println(lowerBound(nums, target));
    }

    static int lowerBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        /*
        if no element such that nums[mid] >= target exists that
        means the answer will be last.
         */
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
