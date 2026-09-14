/*
Problem 1:Selection Sort.
Platform:Online Compiler.

Complexity Analysis
1.Time Complexity:O(N^2).
2.Space Complexity: O(1).

*/

public class SelectionSort {
    public static void main(String[] args) {
      int [] arr = {2,3,1,6,8,5};
      int n = arr.length;
      for(int i=0;i<=n-2;i++) {
        int min = i;
        for(int j=i; j<=n-1;j++) {
          if(arr[j]<arr[i]) {
            min = j;
          }
        }
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
      }
      System.out.println("Sorted array");
      for(int i=0;i<n;i++) {
        System.out.print(arr[i] + " ");
      }
    }
}
