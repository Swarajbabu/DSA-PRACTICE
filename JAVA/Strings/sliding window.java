import java.util.*;

// ==========================================
// 1. LeetCode 438. Find All Anagrams in a String (Brute Force)
// ==========================================
class Solution1 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int n = s.length();
        int k = p.length(); 

        if (k > n) return list;

        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<k;i++){
            mp.put(p.charAt(i),mp.getOrDefault(p.charAt(i),0)+1);
        }

        for(int i=0;i <= n-k;i++){
            HashMap<Character,Integer> mp1 = new HashMap<>();

            for(int j = i;j<=i+k-1;j++){
                mp1.put(s.charAt(j),mp1.getOrDefault(s.charAt(j),0)+1);
            }

            if(mp.equals(mp1)){
                list.add(i);
            }
        }

        return list;
    }
}
// Example:
// Input: s = "cbaebabacd", p = "abc"
// Output: [0, 6]
//
// TC: O(n * k)
// SC: O(k)


// ==========================================
// 1. LeetCode 438. Find All Anagrams in a String (Optimal - Sliding Window)
// ==========================================
class Solution2 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        if (k > n)
            return list;

        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < k; i++) {
            mp.put(p.charAt(i), mp.getOrDefault(p.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> mp1 = new HashMap<>();
        for (int i = 0; i < k; i++) {
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0) + 1);
        }
        if (mp1.equals(mp)) {
            list.add(0);
        }

        int l = 0;
        for (int i = k; i < n; i++) {
            char ch = s.charAt(l);
            mp1.put(ch, mp1.get(ch) - 1);
            if (mp1.get(ch) == 0) {
                mp1.remove(ch);
            }
            mp1.put(s.charAt(i), mp1.getOrDefault(s.charAt(i), 0) + 1);
            if (mp1.equals(mp)) {
                list.add(l+1);
            }
            l++;
        }

        return list;
    }
}
// Example:
// Input: s = "cbaebabacd", p = "abc"
// Output: [0, 6]
//
// TC: O(n)
// SC: O(1)

