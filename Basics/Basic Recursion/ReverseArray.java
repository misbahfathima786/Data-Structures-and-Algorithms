/*
Problem 7:Reverse an Array.
Platform:Online Compiler

Complexity Analysis
● Time Complexity: O(N)
● Space Complexity: O(1)
*/

class ReverseArray {
      public void reverse(int [] a) {
        int left = 0; // to traverse from left side
        int right = a.length - 1; //to traverse from right side 
        while(left<=right) {
          // swapping using temporary variable
          int temp = a[left];
          a[left] = a[right];
          a[right] = temp;
          left++; right--;
        }
        for(int i=0; i<a.length; i++) {
          System.out.print(a[i]+" ");
        }

      }
    }

public class Main {
    public static void main(String[] args) {
      int [] arr = {5,4,3,2,1};
      ReverseArray r = new ReverseArray();
      r.reverse(arr);
    }
}
