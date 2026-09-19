/*
Problem 12:Find the Missing Number.
Platform:Online compiler.

Complexity Analysis 
1.Time Complexity:O(n)
2.space Complexity:O(1)
*/

import java.util.*;

public class Main {
    public static void findMissingElement(int [] arr, int n) {
      int xor1 = 0 , xor2 = 0;
      for(int i=0; i<n; i++) {
        xor1 ^= arr[i]; // XOR on complete array.
      }
      for(int i=1; i<=n+1; i++) {
        xor2 ^= i; // XOR on n numbers.
      }
      int missingElement = xor2 ^ xor1; // Finding missing element.(XOR of same elements == 0)
      System.out.println("Missing Element = "+ missingElement);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        System.out.print("Enter elements of array : ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findMissingElement(arr,n);
    }
}
