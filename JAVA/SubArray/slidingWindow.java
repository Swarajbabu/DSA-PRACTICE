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


// 713. Subarray Product Less Than K      tc: o(n) and sc: o(1) // 
class Solution1 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int n = nums.length;
        int l = 0;
        int p = 1;
        int cnt = 0;
        for (int r = 0; r < n; r++) {
            p = p * nums[r];
            while (p >= k) {
                p = p / nums[l];
                l++;
            }
            cnt = cnt + (r - l + 1);
        }
        return cnt;
    }
}
// Input: nums = [10,5,2,6], k = 100
// Output: 8
// Explanation: The 8 subarrays that have product less than 100 are:
// [10], [5], [2], [6], [10,5], [5,2], [2,6], [5,2,6]


// 904. Fruit Into Baskets      tc: o(n) and sc: o(1) //
class Solution2 {
    public int totalFruit(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        int l = 0;
        int max_cnt = 0;
        for (int r = 0; r < n; r++) {
            mp.put(nums[r],mp.getOrDefault(nums[r],0) + 1);
            while(mp.size()>2){
                mp.put(nums[l],mp.get(nums[l]) - 1);
                if(mp.get(nums[l]) == 0){
                    mp.remove(nums[l]);
                }
                l++;
            }
            max_cnt = Math.max(max_cnt,(r-l+1));
        }
        return max_cnt;
    }
}
// Input: fruits = [1,2,1]
// Output: 3
// Explanation: We can pick from index 0 to 2. [1, 2, 1]

// Input: fruits = [0,1,2,2]
// Output: 3
// Explanation: We can pick from index 1 to 3. [1, 2, 2]

public class slidingWindow {

}
