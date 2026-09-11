/*
Problem 2: Print name N times using Recursion.
Platform: Online compiler.

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(N)
*/

public class Recursion {
    public static int printName(String name, int N, int count) {
      if(count==N) return 0; // base condition
      System.out.println(name);
      return printName(name, N, count+1); // recursion call (5 times)
    }
    public static void main(String[] args) {
      int n = 5;
      int count = 0;
      String name = "Misbah";
      printName(name, n, count);
    }
}
