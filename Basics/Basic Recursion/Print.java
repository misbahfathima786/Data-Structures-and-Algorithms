/*
Problem 1:Simple problem to start or get the idea about recursion . print the name recursively till it reaches the base case
Platform:Online Compiler

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(N)
*/

import java.util.*;
public class Recursion {
    public static int rec(int n) {
      if(n==0) {
        return 0;
      }
      else {
        System.out.println("Misbah");
        return rec(n-1);
      }
    }
    public static void main(String[] args) {
      int n = 3;
      rec(n);
    }
}
