/*
Problem 1752 : Check if array is sorted and rotated.
Platform : Leetcode.

Complexity Analysis
1.Time complexity : O(n).
2.Space complexity : O(1)
*/

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        if(nums[nums.length-1]>nums[0]) count++;
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] > nums[i]) { 
                count++; // to check whether rotations are more than 1.
            }
        }
        if(count == 0 || count == 1) return true;
        else return false;
    }
}
