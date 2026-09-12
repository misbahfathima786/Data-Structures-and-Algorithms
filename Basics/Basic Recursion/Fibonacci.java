/*
Problem 9:Fibonacci Number.
Platform:Online Compiler.

Complexity Analysis
● Time Complexity: O(2^N)
● Space Complexity: O(N)
*/

public class Main {
  public static int fibonacci(int n) {
    if(n==1 || n==0) return 1;
    int last = fibonacci(n-1);
    int slast = fibonacci(n-2);
    return last + slast;
  }
  public static void main(String[] args) {
    int n = 5;
    int res = fibonacci(n);
    System.out.println(res);
  }
}

/*Problem 509:Fibonacci Number.
Platform:Leetcode.

Complexity Analysis
● Time Complexity: O(2^N)
● Space Complexity: O(N)
*/
class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int last = fib(n-1);
        int slast = fib(n-2);
        return last + slast;
    }
}
