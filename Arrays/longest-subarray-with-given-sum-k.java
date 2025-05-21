/*
 
Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.

Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.


*/


import java.util.*;
class Main {

    public static int longestSubarray(int[] nums, int k) {

       HashMap<Integer,Integer> map = new HashMap<>();
       int sum =0;
       int max = 0;
       for(int i=0;i<nums.length;i++){
           sum +=nums[i] ;

           if(sum == k){
               max = i+1;
           }

           if(map.containsKey(sum-k)){
               max = Math.max(max,i-map.get(sum-k));
           }

           if(!map.containsKey(sum)){
           map.put(sum,i);
           }

       }


        //System.out.println(max);
        return max;

    }



    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;
        int res = longestSubarray(arr, k);
        System.out.println(res);
    }
}
