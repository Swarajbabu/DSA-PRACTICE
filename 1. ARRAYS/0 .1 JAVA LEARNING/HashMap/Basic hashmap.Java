import java.util.HashMap;
public class Main{
	public static void main(String[] args) {
		HashMap<Integer,String> mp = new HashMap<>();
		
		mp.put(1,"Swaraj");
		mp.put(2,"babu");
		mp.put(3,"Vecha");
		
		System.out.println(mp);
	}
}

// find the majority element in an array
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num:nums){
            mp.put(num,mp.getOrDefault(num,0) + 1);
        }
        for(Integer key: mp.keySet()){
            if(mp.get(key) > n/2){
                return key;
            }
        }
        return -1;
    }
}
// Input: nums = [2,2,1,1,1,2,2], target = 4
// Output: 2
// Explanation: The only element in nums that appears more than n/2 times is 2. 

// 1. Two Sum           tc: o(n) and sc: o(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>(); 
        
        for(int i=0;i<n;i++){
            int req = target - nums[i];
            if(mp.containsKey(req)){
                return new int[]{mp.get(req),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}
// Example 1:   Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Maximum Subarray Sum of a Fixed Size        tc: o(n) and sc: o(n)
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


