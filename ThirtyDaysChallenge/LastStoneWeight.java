package ThirtyDaysChallenge;
/*
We have a collection of stones, each stone has a positive integer weight.

Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:

If x == y, both stones are totally destroyed;
If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)

 

Example 1:

Input: [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of last stone.

*/

import java.util.Arrays;

public class LastStoneWeight {

    public static void main(String[] args) {
        System.out.println(getLastStoneWeight(new int[] {2,7,4,1,8,1}));
    }

    public static int getLastStoneWeight(int[] a) {
        if(a.length == 1){
            return a[0];
        }

        Arrays.sort(a);

        int last = a[a.length - 1];
        int lastButOne = a[a.length - 2];

        a[a.length - 2] = last - lastButOne;
        a = Arrays.copyOf(a, a.length -1);

        return getLastStoneWeight(a);

    }
}