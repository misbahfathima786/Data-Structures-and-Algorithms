/*
Problem 1838:Frequency of the most frequent Element.
Platform:Leetcode.

Complexity Analysis
● Time Complexity: O(n log n)
● space Complexity: O(1) auxilary
*/

class Solution {
    public int maxFrequency(int[] nums, int k) {
        int left = 0 , maxFreq = 0 ; //left for sliding window concept , maxFreq to update frequency of an element in an array and to return result.
        long sum = 0; // to calculate sum of the elements present in the current window.
        Arrays.sort(nums); // to do sliding window .
        
        for(int right = 0; right<nums.length; right++) {
            int ws = right - left + 1; // windpw size
            sum += nums[right]; // sum calculation
            long operations = (long) nums[right]*ws - sum; // to find how many operation we need to make other elements == target (nums[right])
            
            while(operations>k) { // we can not make other elements == target so move window.
                left++; 
                ws = right-left+1; 
                sum -= nums[left-1]; // as we move one step forward , we have to update our sum also.
                operations = (long) nums[right]*ws - sum; // as we move one step forward , we have to update our operations also.
            }
            if(ws > maxFreq) {
                maxFreq = ws; // if operations<=k , means we can add +1 to other elements to make equal to target . 
            }
        }
        return maxFreq;
    }
}
