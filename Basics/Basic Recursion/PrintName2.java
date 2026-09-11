/*
Problem 4:Print N to 1 using Recursion.
Platform:Online compiler.

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(N)
*/

public class Recursion {
    public static int printNumber(int N, int count) {
      if(count<1) return 0; // base condition
      System.out.println(count);
      return printNumber(N, count-1); // recursion call (5 times)
    }
    public static void main(String[] args) {
      int n = 5;
      printNumber(n , n);
    }
}

//Backtracking

public class Recursion {
    public static void printNumber(int N, int count) {
      if(count<1) return; // base condition
      printNumber(N, count-1);  // recursion call (5 times)
      System.out.println(count);
    }
    public static void main(String[] args) {
      int n = 5;
      printNumber(n , n);
    }
}
