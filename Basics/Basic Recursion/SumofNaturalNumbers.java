/*
Problem 5:Sum of First N Numbers.
Platform:Online compiler.

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(N)
*/

public class Recursion {
    public static int sumofNaturalNumbers(int N) {
      if(N==0) return 0; // base condition
      return N + sumofNaturalNumbers(N-1);  // recursion call (5 times)
    }
    public static void main(String[] args) {
      int n = 5;
      int sum = sumofNaturalNumbers(n);
      System.out.println(sum);
    }
}
