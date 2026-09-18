/*
Problem 136:Single Number.
Platform:Leetcode.

Complexity Analysis 
1.Time complexuty:O(n)
2.Space complexity:O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++) {
            result = result ^ nums[i]; // to check unique number.
        }
        return result;
    }
}
