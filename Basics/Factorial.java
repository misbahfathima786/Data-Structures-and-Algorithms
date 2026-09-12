/*
Problem 6:Factorial of N Numbers.
Platform:Online Compiler

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(N)
*/

public class Recursion {
    public static int factorial(int n) {
      if(n==0) return 1;
      return n * factorial(n-1);
    }
    public static void main(String[] args) {
      int n = 3;
      int res = factorial(n);
      System.out.println(res);
    }
}
