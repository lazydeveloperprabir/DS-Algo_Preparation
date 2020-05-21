import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonReapetedCharacterInString {
    public static void main(String[] args) {
        System.out.println(getNonReapeted("apple"));
    }

    public static char getNonReapeted(String s) {
        Map<Character, Integer> m = new LinkedHashMap<>();
        char ret = ' ';
        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 100);
        }

        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            char key = e.getKey();
            int val = e.getValue();

            if (val == 100) {
                ret = key;
                break;
            }
        }

        return ret;
    }
}