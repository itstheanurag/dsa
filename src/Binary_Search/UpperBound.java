package Binary_Search;

public class UpperBound {
    public static void main(String[] args) {
         /*
        smallest index such that nums[mid] > n;
         */

        int[] nums = new int[]{1,2,3,4,5,8,8,10,10,11};
        int target = 7;
        System.out.println(upperBound(nums, target));
    }

    static int upperBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // only change happens here
            if(nums[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
