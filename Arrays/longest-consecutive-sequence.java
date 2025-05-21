/*  
 *https://leetcode.com/problems/longest-consecutive-sequence/description/

 Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3
 *
 *  */

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int longest = 0;

        for(int num: set){
            if(!set.contains(num-1)){
                int count = 1;

                while(set.contains(num+count)){
                    count++;
                }

                longest = Math.max(longest, count);
                if(longest> set.size()/2){
                    return longest;
                }
            }
        }
        return longest;
    }
}
