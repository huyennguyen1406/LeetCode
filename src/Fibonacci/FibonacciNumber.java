package Fibonacci;

public class FibonacciNumber {
    public int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if(n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
}
