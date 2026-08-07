import java.util.*;

// 167. Two Sum II - Input Array Is Sorted
class TwoPointers {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int sum = nums[l] + nums[r];

            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }

        return new int[]{};
    }

    // 15. 3Sum
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }

        return ans;
    }

    
    public static void main(String[] args) {
        TwoPointers solution = new TwoPointers();

        int[] nums1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(solution.twoSum(nums1, 9)));

        int[] nums2 = {-1, 0, 1, 2, -1, -4};
        System.out.println(solution.threeSum(nums2));
    }
}