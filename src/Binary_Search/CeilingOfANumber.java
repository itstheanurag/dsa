package Binary_Search;

public class CeilingOfANumber {
    /*
    Ceiling of a numebr is a number such that nums[mid] >= x

    which is just lowerBound
     */
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,8,10,10,11};
        int target = 12;
        System.out.println(lowerBound(nums, target));
    }

    static int lowerBound(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] >= target) {
                ans = nums[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
