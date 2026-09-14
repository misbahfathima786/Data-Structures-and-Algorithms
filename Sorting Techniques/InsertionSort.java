/*
Problem 3:Insertion Sort.
Platform:Online Compiler.

Complexity Analysis
1.Time Complexity:O(N^2) for worst case and average case , O(n) for best case -> if array is already sorted.
2.Space Complexity: O(1).

*/

public class InsertionSort {
    public static void main(String[] args) {
      int [] arr = {5,1,2,4,6,3};
      int n = arr.length;
      for(int i=0; i<n; i++) { 
        int j = i;
        while(j>0 && arr[j-1]>arr[j]) {
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }  
      }
      System.out.println("Sorted array");
      for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
