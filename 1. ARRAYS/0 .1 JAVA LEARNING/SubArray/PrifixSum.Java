// 
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0]; 
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        int left_sum = 0;
        int right_sum = 0;
        for (int i = 0; i < n; i++) {

            left_sum = (i == 0)? 0 : prefix[i-1];
            right_sum = prefix[n-1] - prefix[i];

            if (left_sum == right_sum) {
                return i;
            }
        }
        return -1;
    }
}
// 

// 
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        int n = nums.length;
        int sum = 0;
        mp.put(0,1);
        int cnt = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            int target = sum - k;
            if(mp.containsKey(target)){
                cnt = cnt + mp.get(target);
            }
            mp.put(sum,mp.getOrDefault(sum,0) + 1);
        }
        return cnt;
    }
}