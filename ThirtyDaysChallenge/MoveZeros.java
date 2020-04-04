package ThirtyDaysChallenge;

/*
*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
*/
public class MoveZeros {
    public static void main(String[] args) {
        moveLeft(new int[]{0,1,0,3,12});
    }

    // public static int[] moveZero(int[] nums) {
    //     int startPointer = 0;
    //     int endPointer = nums.length -1;

    //     int[] numModified = new int[nums.length];

    //     for(int i: nums){
    //         if(i == 0){
    //             numModified[endPointer] = 0;
    //             endPointer --;
    //         } else{
    //             numModified[startPointer] = i;
    //             startPointer++;
    //         }
    //     }
    //     nums = numModified;
    //     return numModified;
    // }


    public static void moveLeft(int[] nums) {
        int write=0;
        int read =0;
        while (read <nums.length){
            if(nums[read] != 0){
                nums[write] = nums[read];
                read++;
                write++;
            }else {
                read++;
            }
        }

        while(write <read){
            nums[write] =0;
            write++;
        }
    }
}