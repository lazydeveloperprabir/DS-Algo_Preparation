package SlidingWindowPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * FruitsIntoBaskets
 */
public class FruitsIntoBaskets {

    public static void main(String[] args) {
        System.out.println(findLength(new char[] { 'A', 'B', 'C', 'A', 'C' }));
        System.out.println(findLength(new char[] { 'A', 'B', 'C', 'B', 'B', 'C' }));
    }

    public static int findLength(char[] arr) {

        if(arr.length <2){
            throw new IllegalArgumentException();
        }

        int windowStart =0;
        int maxLength =0;
        Map<Character,Integer> freqMap = new HashMap<>();
        for(int windowEnd =0;windowEnd <arr.length;windowEnd++){
            char fruitChar = arr[windowEnd];
            freqMap.put(fruitChar,  freqMap.getOrDefault(fruitChar, 0) +1);

            while(freqMap.size() >2) {
                char rightChar = arr[windowStart];
                freqMap.put(rightChar,freqMap.get(rightChar) - 1);
                if(freqMap.get(rightChar) == 0){
                    freqMap.remove(rightChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart +1);
        }
        
        return maxLength;
    }
}