package ThirtyDaysChallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * SingleNumber Given a non-empty array of integers, every element appears twice
 * except for one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * Input: [2,2,1] Output: 1
 * 
 * Example 2:
 * 
 * Input: [4,1,2,1,2] Output: 4
 */
public class SingleNumber {

    public static void main(final String[] args) {
        System.out.println(singleNumber(new int[] {2,2,1}));
        System.out.println(singleNumber(new int[] {4,1,2,1,2}));

        System.out.println(fasterSol(new int[] {2,2,1}));
        System.out.println(fasterSol(new int[] {4,1,2,1,2}));
    }

    public static int singleNumber( int[] nums) {
        final Map<Integer, Integer> freqMap = new HashMap<>();
        for(int index=0;index<nums.length;index++){
            freqMap.put(nums[index],freqMap.getOrDefault(nums[index],0)+1);          
        }
        
        int[] result = new int[1];

        freqMap.entrySet().forEach(entry ->{
            if(entry.getValue() == 1){
                result[0] = entry.getKey();
            }
        });

        return result[0];
        }

        //Faster Solution using Bitwise XOR(^).
        // "^" is an operator in Java that provides the answer '1' if both of the bits in its operands are different, if both of the bits are same then the XOR operator gives the result '0'. XOR is a binary operator that is evaluated from left to right. 
        
        public static int  fasterSol(int[] nums) {
                int a =0;
                for(int i:nums) {
                    a^=i;
                } 
                return a;        
        }
}