/*
Problem 1 : Count Digits.
Platform : Online Compiler

Complexity Analysis
● Time Complexity: O(log₁₀ n), number of digits
● Space Complexity: O(1)
*/

import java.util.*;
public class CountDigits {
    public static int countDigits(int n) {
      int count = 0;
      if(n==0) {
        return count+1;
      }
      while(n!=0) {
        count++;
        n/=10; //To remove last digit
      }
      return count;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int result = countDigits(n);
      System.out.println("Number of digits in a given number = "+result);
      sc.close();
    }
}
