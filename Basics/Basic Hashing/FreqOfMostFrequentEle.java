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
