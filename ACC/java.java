// Feb
class Solution {
    public int fib(int n) {
        if(n == 1 || n == 0){
            return n;
        }
        int first = 0;
        int second = 1;
        int ans = 0;
        for(int i=2;i<=n;i++){
            ans = first + second;
            first = second;
            second = ans;
        }
        return ans;
    }
}


//second largest
class Solution1 {
    public int getSecondLargest(int[] arr) {
        // code here
        int large = -1;
        int second = -1;
        for(int i = 0 ;i < arr.length;i++){
            if(arr[i] > large){
                second = large;
                large = arr[i];
            }
            if(arr[i] > second && arr[i] != large){
                second = arr[i];
            }
        }
        return second;
    }
}

// LCM AND GCD
class Solution2 {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int x = a,y = b;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;
        int lcm = (a*b)/gcd;
        
        return new int[]{lcm,gcd};
    }
}
// input: 

// Move zeros to the end;
class Solution3 {
    public void moveZeroes(int[] arr) {
        int n = arr.length;

        int z = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[z];
                arr[z] = temp;

                z++;
            }
        }
    }
}
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
