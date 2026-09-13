/*
Problem 1:Counting Frequencies of Array Elements.
Platform:Online Compiler.

Complexity Analysis
● Time Complexity: O(N)
● space Complexity: O(N)
*/

import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
      int [] arr = {1,2,1,3,2,4};
      HashMap <Integer,Integer> map = new HashMap<>();
      for(int i=0; i<arr.length; i++) {
        if(map.containsKey(arr[i])) {
          map.put(arr[i] , map.get(arr[i])+1); // if key is already present in map , increment the value to 1. 
        }
        else {
          map.put(arr[i],1); // add the new key in map , set the value to 1.
        }
      
      }
      System.out.println(map);
    }
}
