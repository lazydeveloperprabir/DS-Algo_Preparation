import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class caesarCypher {

    public static void main(String[] args) {
        System.out.println(cypher("xyz", 2));
    }

    public static String cypher(String s, int key) {
        s.toLowerCase();
        List<Character> alphabets = new ArrayList<>();
        char[] newChar = new char[s.length()];

        for (int i = 97; i < 123; i++) {
            char c = (char) i;
            alphabets.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = idx(alphabets, c);
            int newidx = index + key;

            if (newidx < alphabets.size()) {
                char ch = alphabets.get(newidx);
                newChar[i] = ch;
            } else {
                int diff = newidx - alphabets.size();
                newChar[i] = alphabets.get(diff);
            }
        }
        return new String(newChar);
    }

    public static int idx(List<Character> arr, char c) {
        return IntStream.range(0, arr.size()).filter(i -> arr.get(i) == c).findAny().orElse(-1);
    }

}