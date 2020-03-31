package SlidingWindowPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * longestSubStringWithKDistinctCharacters
 * ws= windowstart
 * we= wwindowend
 * ml = maxlength
 */
public class longestSubStringWithKDistinctCharacters {

    public static void main(String[] args) {
        System.out.println(longestSubWithKChar("araaci", 2));
        System.out.println(longestSubWithKChar("araaci", 1));
        System.out.println(longestSubWithKChar("araaci", 3));
    }

    public static int longestSubWithKChar(String s, int k) {
        if(s == null || s.length() == 0 || s.length() <k){
            throw new IllegalArgumentException();
        }
        int ws =0;
        int ml =0;

        Map<Character,Integer> charMap = new HashMap<>();
        char[] arr = s.toCharArray();
    
    //    int count =0;
        for(int we = 0;we<arr.length;we++){
            char rightChar = arr[we];
            charMap.put(rightChar, charMap.getOrDefault(rightChar, 0)+1);

            while(charMap.size() > k){
                char leftChar = arr[ws];
                charMap.put(leftChar, charMap.get(leftChar) -1);
                if(charMap.get(leftChar) ==0){
                    charMap.remove(leftChar);
                }
                ws++;
            }
            ml = Math.max(ml, we - ws + 1);
        }
        return ml;
        
    }
}