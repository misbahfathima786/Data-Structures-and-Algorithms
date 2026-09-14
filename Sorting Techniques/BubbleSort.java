/*
Problem 1:Bubble Sort.
Platform:Online Compiler.

Complexity Analysis
1.Time Complexity:O(N^2) for worst case and average case , O(n) for best case -> if array is already sorted.
2.Space Complexity: O(1).

*/

public class SelectionSort {
    public static void main(String[] args) {
      int [] arr = {5,1,2,4,6,3};
      int n = arr.length;
      for(int i=n-1; i>1; i--) { // to neglet last elements as they are sorted and placed at last we will decrement i.
        int didSwap = 0;// if array is already sorted , not a single swap was done , then break it and print original one (Best case senario).
        for(int j=0; j<i; j++) {
          if(arr[j]>arr[j+1]) {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
            didSwap = 1;
          }
        }
        if(didSwap == 0) {
          break;
        }  
      }
      System.out.println("Sorted array");
      for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
