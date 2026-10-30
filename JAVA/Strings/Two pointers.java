import java.util.*;

// ==========================================
// 1. LeetCode 344. Reverse String
// ==========================================
class Solution1 {
    public void reverseString(char[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        while (l < r) {
            char temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
// Example:
// Input: nums = ['h', 'e', 'l', 'l', 'o']
// Output: ['o', 'l', 'l', 'e', 'h']
//
// TC: O(n)
// SC: O(1)


// ==========================================
// 2. LeetCode 125. Valid Palindrome
// ==========================================
class Solution2 {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String val = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                val += Character.toLowerCase(ch);
            } 
        }

        String org = val;
        int l = 0;
        int r = val.length()-1;
        char[] arr = val.toCharArray();

        while(l < r){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        String rev = new String(arr);
        if (org.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
// Example:
// Input: s = "A man, a plan, a canal: Panama"
// Output: true
//
// TC: O(n^2)
// SC: O(n)


// ==========================================
// 3. LeetCode 680. Valid Palindrome II
// ==========================================
class Solution3 {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n-1;
        boolean removed = false;

        while(l<r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return isPalindrome(s,l+1,r) || isPalindrome(s,l,r-1);
            }
        }
        return true;
    }

    public boolean isPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
// Example:
// Input: s = "abca"
// Output: true
//
// TC: O(n)
// SC: O(1)


// ==========================================
// 4. LeetCode 5. Longest Palindromic Substring (Brute Force)
// ==========================================
class Solution4 {
    public String longestPalindrome(String s) {
        int n = s.length();

        String result = "";
        for(int i=0;i<n;i++){
            for(int j = i;j<n;j++){
                if(ispaladrom(s,i,j)){
                    if(result.length() < (j-i+1)){
                        result = s.substring(i,j+1);
                    }
                }    
            }
        }

        return result;
    }

    public boolean ispaladrom(String s, int l,int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
// Example:
// Input: s = "babad"
// Output: "bab"
//
// TC: O(n^3)
// SC: O(n)


// ==========================================
// 4. LeetCode 5. Longest Palindromic Substring (Optimal)
// ==========================================
class Solution5 {
    public String longestPalindrome(String s) {
        int n = s.length();

        String result = "";
        for(int i = 0; i<n;i++){
            String odd = ispaladrom(s,i,i);
            String even = ispaladrom(s,i,i+1);
            if (odd.length() > result.length()) {
                result = odd;
            }

            if (even.length() > result.length()) {
                result = even;
            }
        }
        return result;
    }

    public String ispaladrom(String s, int l,int r){
        while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        String nm = s.substring(l+1,r);
        return nm;
    }
}
// Example:
// Input: s = "babad"
// Output: "bab"
//
// TC: O(n^2)
// SC: O(n)
