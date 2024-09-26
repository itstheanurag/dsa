package Binary_Search;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,2,2,3,3,4,5,6,7};
        System.out.println(Arrays.toString(ans(nums, 2)));
    }

    static  int[] ans(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    static  int search(int[] nums, int target, boolean firstSearchIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if ( target > nums[mid]) {
                start = mid + 1;
            } else {
                // the only case where element is equal to the target
                ans = mid;
                if(firstSearchIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
