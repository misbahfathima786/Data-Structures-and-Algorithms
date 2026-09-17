/*
Problem 189 Rotate Array.
Platform:Leetcode.

Complexity Analysis
1.Time complexity = O(n)
2.Space complexity = O(n)

*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int [] rotate = new int[n]; 
        for(int i=0; i<n; i++) {
            rotate[(i+k) % n] = nums[i];
        }
        for(int i=0; i<n; i++) {
            nums[i] = rotate[i];
        }
    }
}
