/*
Problem 26 : Remove Duplicates in-place from Sorted Array
Platform : Leetcode

Complexity Analysis
1.Time complexity : O(n)
2.Space Complexity : O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i<nums.length; i++) {
            if(nums[i] != nums[k-1]) {
                nums[k] = nums[i];
                k++;
            }

        }
        return k;
    }
}
