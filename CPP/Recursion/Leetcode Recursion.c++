class Solution {
public:
    double power(double x, int n){
        if(n==0){
            return 1;
        }
        double halfpow = power(x,n/2);
        double halfpowersqu = halfpow * halfpow;

        if(n%2 != 0){
            return x * halfpowersqu;
        }

        return halfpowersqu;
    }

    double myPow(double x, int n) {
        long long N = n;

        if(N<0){
            x = 1/x;
            N = -N; 
        }

        return power(x, N);
    }
};
