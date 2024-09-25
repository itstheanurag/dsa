package Binary_Search;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        // https://leetcode.com/problems/split-array-largest-sum/
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(ans(nums, k));
    }

    static int ans(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int num : nums) {
            start = Math.max(start, num);
            end+=num;
        }

        if( k == 1) return end;

        while(start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for(int num : nums) {
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}
