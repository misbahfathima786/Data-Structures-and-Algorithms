/*
Problem 7:. Check if a String is Palindrome or Not.
Platform:Online Compiler.

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(N)
*/

public class Main {
    public static boolean palindromeCheck(String s, int left, int right) {
      if(left>=right) return true; // base condition 
      if(s.charAt(left) != s.charAt(right)) return false;
      return palindromeCheck(s,left+1,right-1);
    }
    public static void main(String[] args) {
      String str = "ABCBA";
      boolean res = palindromeCheck(str,0,str.length()-1);
      if(res) {
        System.out.println("Palindrome");
      }
      else {
        System.out.println("Not a palindrome");
      }
    }
}


/*
Problem 125:Valid Palindrome.
Platform:leetcode.

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        int left = 0;
        int right = s.length() - 1;
        while(left<=right) {
            char cF = s.charAt(left);
            char cL = s.charAt(right);
            if(!Character.isLetterOrDigit(cF))
                left++;
            else if(!Character.isLetterOrDigit(cL))
                right--;
            else {
                if(Character.toLowerCase(cF) != Character.toLowerCase(cL))
                    return false;
                right--;
                left++;
            }
        }
        return true;
    }
}
