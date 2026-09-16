/*
Problem 6: Recursive Insertion Sort.
Platform : Online compiler.

Complexity Analysis
Time Complexity: O(N2) for the worst and average cases and O(N) for the best case.

Space Complexity: O(N) auxiliary stack space.
*/

import java.util.*;

public class Main {
    public static void insertionSort(int [] a , int num, int i) {
      if(i == num) return;
      int j = i;
      while(j>0 && a[j-1]>a[j]) {
          int temp = a[j-1];
          a[j-1] = a[j];
          a[j] = temp;
          j--;
      }
      insertionSort(a , num, i+1);
    }
    public static void main(String[] args) {
      int [] arr = {2,4,1,5,7,6,8,3};
      int n = arr.length;
      insertionSort(arr, n,0);
      for(int i = 0; i< n; i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
