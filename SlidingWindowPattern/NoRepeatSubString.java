package SlidingWindowPattern;

import java.util.HashMap;
import java.util.Map;


/**
 * NoRepeatSubString
 */
public class NoRepeatSubString {

    public static void main(String[] args) {
        System.out.println(findLength("abbbb"));
        System.out.println(findLength("aabccbb"));
        System.out.println(findLength("abccde"));
    }

    public static int findLength(String s) {
        if(s== null)
            throw new IllegalArgumentException();
        
        int startWindow = 0;
        int maxLength = 0;

        Map<Character,Integer> freqMap = new HashMap<>();

        for(int windowEnd =0;windowEnd <s.length();windowEnd++){
            char eachChar = s.charAt(windowEnd);
            
            if(freqMap.containsKey(eachChar)){
                startWindow = Math.max(startWindow,freqMap.get(eachChar) +1);
            }
            freqMap.put(eachChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - startWindow +1);

        }
        return maxLength;
    }
}