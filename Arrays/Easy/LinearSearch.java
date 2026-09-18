/*
Problem 8:Linear Search.
Platform : Online /compiler.

Complexity Analysis
1.time Complexity:O(n)
2.Space Complexity:O(1)
*/

import java.util.*;

public class LinearSearch {

    public static int linearSearch(int [] arr, int k) {
      if(arr.length == 0) return -1;
      for(int i=0; i<arr.length; i++) {
        if(arr[i] == k) return i; // if k is present in array
      }
      return -1; // element not found
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a size of an array : ");
      int size = sc.nextInt();
      int [] arr = new int[size];
      System.out.println("Enter array elements.");
      for(int i=0;i<size; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.print("Enter Searching element : ");
      int k = sc.nextInt();
      LinearSearch search = new LinearSearch();
      int res = search.linearSearch(arr,k);
      System.out.println(res);
      sc.close();
    }
}
