
// C++ program to print "Swaraj" n times using recursion
#include <iostream>
#include<bits/stdc++.h>
using namespace std;

void nam(int i,int n){
    if(i>=n){
        return;
    }
    cout<<"Swaraj\n";
    i++;
    nam(i,n);
}
int main(){
    int n;
    cin>>n;
    
    int i=0;
    nam(i,n);
}

// Output (for input: 5):
//         Swaraj upto 5 times


// C++ program to print first n natural numbers using recursion
#include <iostream>
using namespace std;

void nam(int i,int n){
    if(i>n){
        return;
    }
    cout<<i<<" ";
    i++;
    nam(i,n);
}
int main(){
    int n;
    cin>>n;
    
    int i=1;
    nam(i,n);
}
// Output (for input: 5):
//         1 2 3 4 5


// Factrol of an number                 tc: O(n)  sc: O(n)  
int fact(int n){
    if(n==0){
        return 1;
    }
    return n*fact(n-1);
}

int main(){
    int ans = fact(5);
    cout << ans << endl;
}

// Print numbers from n to 1 using recursion   tc: O(n)  sc: O(n)
void print(int n){
    if(n==0){
        return;
    }
    cout << n<<" ";
    print(n-1);
}
int main(){
    print(5);
}
// Output (for input: 5):
//        5 4 3 2 1

// Print numbers from 1 to n using recursion            tc: O(n)  sc: O(n)
void print(int n){
    if(n==0){
        return;
    }
    print(n-1);
    cout << n<<" ";
}
int main(){
    print(5);
}
// Output (for input: 5):
//        1 2 3 4 5


// Sum of first n natural numbers using recursion       tc: O(n)  sc: O(n)
int sum(int n){
    if(n==1){
        return 1;
    }
    return n + sum(n-1);
}
int main(){
    // cout<< "Ans: ";
    int sumval = sum(5);
    cout<<"Sum of values: "<<sumval;
}
// Output (for input: 5):
//        Sum of values: 15

// Fibonacci series using recursion             tc: O(2^n)  sc: O(n) 
int Fibonacci(int n){
    if(n==1){
        return 1;
    }
    if(n==0){
        return 0;
    }
    return Fibonacci(n-1) + Fibonacci(n-2);
}

int main(){
    // cout<< "Ans: ";
    int Fibval = Fibonacci(7);
    cout<<"Sum of values: "<<Fibval;
}
// Output (for input: 7):
//       Sum of values: 13

// Fibonacci series using recursion (Tree representation)
// The Fibonacci sequence can be represented as a binary tree, where each node represents a Fibonacci number and its children represent the two preceding Fibonacci numbers. 
//The tree structure helps visualize the recursive calls made during the computation of Fibonacci numbers.


//      Base Cases:
//      fib(0) = 0
//      fib(1) = 1

//      Formula:
//      fib(n) = fib(n-1) + fib(n-2)
// 
//                                 fib(5)
//                             (3 + 2 = 5)
//                            /             \
//                           /               \
//                     fib(4)               fib(3)
//                  (2 + 1 = 3)         (1 + 1 = 2)
//                   /        \           /        \
//                  /          \         /          \
//            fib(3)        fib(2)   fib(2)      fib(1)
//         (1 + 1 = 2)    (1+0=1)   (1+0=1)         1
//           /      \        /  \      /  \
//          /        \      /    \    /    \
//     fib(2)      fib(1) fib(1) fib(0) fib(1) fib(0)
//    (1+0=1)         1      1      0      1      0
//      /   \
//     /     \
// fib(1)   fib(0)
//    1         0


// Check if an array is sorted or not using recursion      tc: O(n)  sc: O(n)
bool Sorted_or_not(vector<int>& arr, int n, int i) {
    if (i == n - 1){
        return true;
    }
    
    if (arr[i] > arr[i + 1]){
        return false;
    }
    return Sorted_or_not(arr, n, i + 1);
}
int main() {
    vector<int> arr = {1,2,3,4,5};
    bool ans = Sorted_or_not(arr, arr.size(), 0);
    cout << ans;
    return 0;
}
// Output (for input: {1,2,3,4,5}):

//               Sorted_or_not(arr,5,0)
//               Compare: 1 > 2 ? No
//                        |
//                        V
//               Sorted_or_not(arr,5,1)
//               Compare: 2 > 3 ? No
//                        |
//                        V
//               Sorted_or_not(arr,5,2)
//               Compare: 3 > 4 ? No
//                        |
//                        V
//               Sorted_or_not(arr,5,3)
//               Compare: 4 > 5 ? No
//                        |
//                        V
//               Sorted_or_not(arr,5,4)
//               Base Case
//               return true
//                        |
//     -----------------------------------------
//     |               |              |         |
// return true     return true   return true  return true
//     |               |              |         |
//     -----------------------------------------
//                        |
//                  return true