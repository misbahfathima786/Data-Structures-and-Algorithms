/*
Problem 1:Largest Element.
Platform:Online Compiler.

Complexity Analysis
1.Time complexity = O(n)
2.Space complexity = O(1)

*/

public class Main {
    public static int largestElement(int [] arr, int max) {
      for(int i=1;i<arr.length;i++) {
        if(arr[i]>max) {
          max = arr[i];
        }
      }
      return max;
    }
    public static void main(String[] args) {
      int [] arr = {2,4,5,1,6,8,3,9};
      System.out.print("Given array : ");
      for(int i=0; i< arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      System.out.println("Largest Element = "+largestElement(arr , arr[0]));
    }
}
