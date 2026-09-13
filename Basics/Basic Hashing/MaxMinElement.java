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


/*
/*
Problem 1838:Frequency of the most frequent Element.
Platform:Leetcode.

Complexity Analysis
● Time Complexity: O(n log n)
● space Complexity: O(1) auxilary
*/

class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0 , maxFreq = 0 ;
        long sum = 0;
        Arrays.sort(nums);
        for(int right = 0; right<nums.length; right++) {
            int ws = right - left + 1;
            sum += nums[right];
            long operations = (long) nums[right]*ws - sum;
            while(operations>k) {
                left++;
                ws = right-left+1;
                sum -= nums[left-1];
                operations = (long) nums[right]*ws - sum;
            }
            if(ws > maxFreq) {
                maxFreq = ws;
            }
        }
        return maxFreq;
    }
}
