/*
Problem 2 : Reverse a Number.
Platform : Online Compiler.

Complexity Analysis
● Time Complexity: O(log₁₀ n)
● Space Complexity: O(1)
*/

import java.util.*;
public class Reverse {
    public static int reverse(int n) {
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
      int result = reverse(n);
      System.out.println("Reverse of a given number = "+result);
      sc.close();
    }
}

/*
Problem 7(L) : Reverse Integer.
Platform : Leet Code.

Complexity Analysis
● Time Complexity: O(log₁₀ n)
● Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        int res = 0;
        while (x > 0) {
            int digit = x % 10;
            x /= 10;
            if (res > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            res = (res * 10) + digit;
        }

        return isNegative ? -res : res;  
    }
}
