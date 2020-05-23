import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class longestpanlindromicSubstring {

    public static void main(String[] args) {

    }
    
    private static String longestPall(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        Map<String, Integer> map = new HashMap<>();

        /* for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                char start = s.charAt(i);
                char end = s.charAt(j);
        
                if (start == end) {
                    
                }
            }
        }*/

        while (p1 <= p2) {
            if (s.charAt(p1) == s.charAt(p2)) {
                String subString = s.substring(p1, p2);
                if (checkPall(subString)) {
                    p1 = p2 + 1;
                    p2 = s.length() - 1;
                    map.put(subString, subString.length());
                }
            } else if (p1 == p2) {
                p1++;
                p2 = s.length() - 1;
            } else {
                p2--;
            }
        }
        
        Map<String,Integer>  map1 = map.entrySet()
                                        .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        
        return null;
    }
    
    private static boolean checkPall(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;
        
        while (p1 <= p2) {
            if (s.charAt(p1) == s.charAt(p2)) {
                p1++;
                p2--;
            } else {
                return false;
            }
        }
        return true;
    }
    
}