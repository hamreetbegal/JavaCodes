/*

https://leetcode.com/problems/two-sum/description/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        //int sum = 0;
        //int max = 0;

        int[] arr = new int[2];

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);

        }
        for(int i=0;i<nums.length;i++){
            int sum = target - nums[i];
            if(map.containsKey(sum) && map.get(sum)!=i){
                arr[0] = i;
                arr[1] = map.get(sum);
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}
