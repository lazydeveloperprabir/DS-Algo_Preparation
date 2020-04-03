package ThirtyDaysChallenge;



/**
 * Kadane's Algorithm
 * MaxContigousSubArray
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class MaxContigousSubArray {

    public static void main(String[] args) {
        System.out.println(maxSumSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        
    }

    public static int maxSumSubArray(int[] nums) {
        int currentMax = nums[0];
        int globalMax = nums[0];
        for(int i =1;i<nums.length;i++){
            if(currentMax < 0)
                currentMax = nums[i];
            else 
                currentMax = currentMax + nums[i];
            
           if(globalMax < currentMax) {
               globalMax = currentMax;
           }
        }
        return globalMax;
    }
}