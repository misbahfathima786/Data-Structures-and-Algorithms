/*
Problem 2:Counting Frequencies of Array Elements.
Platform:Online Compiler.

Complexity Analysis
● Time Complexity: O(N)
● space Complexity: O(N)
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
      int [] arr = {1,2,1,3,1,2,2,2,2,2};
      HashMap <Integer,Integer> map = new HashMap<>();
      int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
      int maxElement = 0 , minElement = 0;

      for(int i=0; i<arr.length; i++) {
        if(map.containsKey(arr[i])) {
          map.put(arr[i] , map.get(arr[i])+1); // if key is already present in map , increment the value to 1. 
        }
        else {
          map.put(arr[i],1); // add the new key in map , set the value to 1.
        }
      }

      for(Map.Entry<Integer,Integer> entry:map.entrySet()) { //A Map.Entry represents one key-value pair.
        // to loop over the hashmap. entrySet() helps in getting key and value , it gives all key value pairs.
        
        if(entry.getValue() > max) {
          max = entry.getValue();
          maxElement = entry.getKey();
        }
        if(entry.getValue() < min) {
          min = entry.getValue();
          minElement = entry.getKey();
        }

      }

      System.out.println(map);
      System.out.println("Highest Frequency element : "+maxElement);
      System.out.println("Smallest Frequency element : "+minElement);
    }
}


