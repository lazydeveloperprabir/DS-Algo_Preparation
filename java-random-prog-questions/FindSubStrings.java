import java.util.ArrayList;
import java.util.List;

public class FindSubStrings {
    public static void main(String[] args) {
        System.out.println(subSt("abbc"));

    }

    public static List<String> subSt(String s) {

        List<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
                String sb = s.substring(i, j);
                res.add(sb);
            }
        }

        return res;
    }
}