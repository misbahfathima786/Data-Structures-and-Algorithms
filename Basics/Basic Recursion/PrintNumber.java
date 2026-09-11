/*
Problem 3: Print 1 N using Recursion.
Platform: Online compiler.

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(N)
*/

public class Recursion {
    public static int printNumber(int N, int count) {
      if(count>N) return 0; // base condition
      System.out.println(count);
      return printNumber(N, count+1); // recursion call (5 times)
    }
    public static void main(String[] args) {
      int n = 5;
      int count = 1;
      printNumber(n, count);
    }
}
/*
Printing numbers through backtracking
*/

class Solution {
    // Recursive function to print numbers from current to n using backtracking
    public void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n) return;
        // Recursive call with next number
        printNumbers(current + 1, n);
        // Print current number during backtracking
        System.out.print(current + " "); // this line will execute after base condition will execute.
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        sol.printNumbers(1, n);
        System.out.println();
    }
}
