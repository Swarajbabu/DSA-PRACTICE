import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            sum = sum + nums[i];
        }
        long max_sum = 0;
        if (mp.size() == k) {
            max_sum = sum;
        }
        int l = 0;
        for (int i = k; i < n; i++) {
            sum = sum + nums[i];
            sum = sum - nums[l];
            mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
            mp.put(nums[l], mp.get(nums[l]) - 1);
            if (mp.get(nums[l]) == 0) {
                mp.remove(nums[l]);
            }
            l++;
            if (mp.size() == k) {
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
}
// Input: nums = [1,5,4,2,9,9,9], k = 3
// Output: 15
// Explanation: The subarrays of nums with length 3 are:
// - [1,5,4] which meets the requirements and has a sum of 10.
// - [5,4,2] which meets the requirements and has a sum of 11.
// - [4,2,9] which meets the requirements and has a sum of 15.
// - [2,9,9] which does not meet the requirements because the element 9 is repeated.
// - [9,9,9] which does not meet the requirements because the element 9 is repeated.


public class slidingWindow {

}
