/*
Problem 5: Recursive Bubble Sort.
Platform : Online compiler.

Complexity Analysis
Time Complexity: O(N2) for the worst and average cases and O(N) for the best case.

Space Complexity: O(N) auxiliary stack space.
*/

import java.util.*;

public class Main {
    public static void bubbleSort(int [] a , int num) {
      if(num == 1) return;
      int didSwap = 0;
      for(int j = 0; j<num - 2; j++) {
        if(a[j] > a[j+1]) {
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
          didSwap = 1;
        }
      }
      if(didSwap == 0) return;
      bubbleSort(a , num-1);
    }
    public static void main(String[] args) {
      int [] arr = {2,4,1,5,7,6,8,3};
      int n = arr.length;
      bubbleSort(arr, n);
      for(int i = 0; i< n; i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
