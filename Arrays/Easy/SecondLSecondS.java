/*
Problem 2:Find Second Smallest and Second Largest Element in an array.
Platform:Online Compiler.

Complexity Analysis
1.Time complexity = O(n)
2.Space complexity = O(1)

*/

public class Main {
    public static void secondSmallSecondLarge(int [] arr) {
      int max=Integer.MIN_VALUE, secMax=Integer.MIN_VALUE, min=Integer.MAX_VALUE, secMin=Integer.MAX_VALUE; 
      for(int i=0;i<arr.length;i++) {
        if(arr[i]>max) {
          secMax = max;
          max = arr[i];
        }
        else if(arr[i]>secMax) {
          secMax = arr[i];
        }
        if(arr[i]<min) {
          secMin = min;
          min = arr[i];
        }
        else if(arr[i]<secMin) {
          secMin = arr[i];
        }
      }
      System.out.println("Largest : "+max);
      System.out.println("Second Largest : "+secMax);
      System.out.println("Smallest : " + min);
      System.out.println("Second Smallest : " + secMin);
    }
    public static void main(String[] args) {
      int [] arr = {2,4,5,1,6,8,3,9};
      System.out.print("Given array : ");
      for(int i=0; i< arr.length; i++) {
        System.out.print(arr[i]+" ");
      }
      System.out.println();
      secondSmallSecondLarge(arr);
    }
}
