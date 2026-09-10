/*
Problem : Count Digits.
Platform : Online Compiler.
problem number : 1
*/

import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int n = sc.nextInt();
      int count = 0;
      while(n!=0) {
        count++;
        n/=10; //To remove last digit
      }
      System.out.println("Number of digits in a given number = "+count);
      sc.close();
    }
}