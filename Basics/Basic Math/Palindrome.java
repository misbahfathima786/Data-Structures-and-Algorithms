/*
Problem 3 : Check Palindrome.
Platform : Online Compiler.

Complexity Analysis
● Time Complexity: O(log₁₀ n)
● Space Complexity: O(1)
*/

import java.util.*;
public class Palindrome {
    public static int palindrome(int n) {
      int rev = 0;
      while(n!=0) {
        int digit = n%10; //To extract last digit
        rev = rev * 10 + digit;//To add the extracted number at first(To reverse).
        n/=10; //To remove last digit
      }
      return rev;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int reverse = palindrome(n);
      if(n==reverse) {
        System.out.println("Given number is Palindrome.");
      }
      else {
        System.out.println("Given number is not a Palindrome.");
      }
      sc.close();
    }
}

/*
Problem 9(L) : Palindrome Number.
Platform : Leet Code.

Complexity Analysis
● Time Complexity: O(log₁₀ n)
● Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n = x;
        if(x<0) {
            return false;
        }
      while(x!=0) {
        int digit = x%10; //To extract last digit
        rev = rev * 10 + digit;//To add the extracted number at first(To reverse).
        x/=10; //To remove last digit
      }
      return rev==n;
    }
}
