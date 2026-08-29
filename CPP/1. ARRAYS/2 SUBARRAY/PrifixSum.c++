#include <iostream>
#include <bits/stdc++.h>
using namespace std;

// Subarray Sum Equals K       tc: o(n) and sc: o(n)
class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int, int> mp;
        mp[0] = 1;          // Initialize the map with the base case for sum = 0
        int sum = 0;
        int cnt = 0;
        int val = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            val = sum - k;
            if(mp.find(val) != mp.end()){
                cnt = cnt + mp[sum-k];
            }
            mp[sum]++;
        }
        return cnt;
    }
};
// Input: nums = [1,2,3], k = 3
// Output: 2
// Explanation: The subarrays that sum to 3 are [1,2] and [3].