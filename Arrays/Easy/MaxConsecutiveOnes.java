/*
Problem 485: Max Consecutive Ones.
Platform:Leetcode

Complexity Analysis
1.Time Complexity:O(n)
2.Space Complexity:O(1)

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0 , max = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==1) {
                count++;
            }
            else{
                count=0; // reset count , because after one other number is there , not consecutive .
            }
            if(max<count) {
                max = count; // to find maximum consecutive one's.
            }
        }
        return max;
    }
}
