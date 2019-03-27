package Leetcode;

public class FibonacciNumber {

   /* The Fibonacci numbers, commonly denoted F(n) form a sequence,
    called the Fibonacci sequence, such that each number is the sum
    of the two preceding ones, starting from 0 and 1. That is,

    F(0) = 0,   F(1) = 1
    F(N) = F(N - 1) + F(N - 2), for N > 1.
    Given N, calculate F(N).
    */

    public int fib(int N) {
        if (N==0){
            return 0;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for (int i=2;i<=N;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
