class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0){
            double val = 1/x;
            int m = Math.abs(n);
            return f(val, m);
        }
        return f(x, n);
    }

    public double f(double x, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }

        double ans = f(x, n / 2);
        if(n % 2 != 0){
            return ans * ans * x;
        }
        return ans * ans;
    }
}