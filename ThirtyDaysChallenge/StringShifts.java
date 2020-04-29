package ThirtyDaysChallenge;

import java.util.Arrays;
import java.util.HashMap;

/*
You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:

direction can be 0 (for left shift) or 1 (for right shift). 
amount is the amount by which string s is to be shifted.
A left shift by 1 means remove the first character of s and append it to the end.
Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
Return the final string after all operations.

 

Example 1:

Input: s = "abc", shift = [[0,1],[1,2]]
Output: "cab"
Explanation: 
[0,1] means shift to left by 1. "abc" -> "bca"
[1,2] means shift to right by 2. "bca" -> "cab"
Example 2:

Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
Output: "efgabcd"
Explanation:  
[1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
[1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
[0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
[1,3] means shift to right by 3. "abcdefg" -> "efgabcd"
 

Constraints:

1 <= s.length <= 100
s only contains lower case English letters.
1 <= shift.length <= 100
shift[i].length == 2
0 <= shift[i][0] <= 1
0 <= shift[i][1] <= 100
   Hide Hint #1  
Intuitively performing all shift operations is acceptable due to the constraints.
   Hide Hint #2  
You may notice that left shift cancels the right shift, so count the total left shift times (may be negative if the final result is right shift), and perform it once.
*/

public class StringShifts {
    public static void main(String[] args) {
        //System.out.println(stringShift(new String("abcdefg"), new int[][]{{1,1},{1,1},{0,2},{1,3}}));
        System.out.println(stringShift(new String("yisxjwry"), new int[][]{{1,8},{1,4},{1,3},{1,6},{0,6},{1,4},{0,2},{0,1}}));
    }

    public static String stringShift(String s, int[][] shift) {
        if(s == null || s.length() == 1){
            return s;
        }

        HashMap<Integer,Integer> dataMap = new HashMap<>();

        Arrays.stream(shift).forEach(ins ->{
            dataMap.put(ins[0],dataMap.getOrDefault(ins[0], 0) + ins[1]);
        });

        int ins1 = dataMap.get(1); //5

        int ins0 = dataMap.get(0); //2

        int finalShift = ins1-ins0;

        char[] stirngArr = s.toCharArray();

        if(finalShift > 0) {
            
            char[] a1 = Arrays.copyOfRange(stirngArr, stirngArr.length - finalShift, stirngArr.length);
            char [] a2 = Arrays.copyOf(stirngArr, stirngArr.length  -finalShift);
            return new String(a1) + new String(a2);
        } else {
            char[] a1 = Arrays.copyOfRange(stirngArr, 0, Math.abs(finalShift));
            char[] a2 =Arrays.copyOfRange(stirngArr, Math.abs(finalShift), stirngArr.length);
            return new String(a2) + new String(a1);
        }
    }

}