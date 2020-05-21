import java.util.HashMap;
import java.util.Map;

public class checkIfaStringIsUnique {
    public static void main(String[] args) {
        System.out.println(check("count"));
    }

    public static boolean check(String s) {
        Map<Character, Integer> m = new HashMap<>();
        boolean state = true;

        for (int i = 0; i < s.length(); i++) {
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) + 100);
        }

        for (Integer val : m.values()) {
            if (val > 100)
                state = false;
        }
        return state;
    }

}