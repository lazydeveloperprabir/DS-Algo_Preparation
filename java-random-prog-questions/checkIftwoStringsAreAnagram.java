import java.util.Arrays;

public class checkIftwoStringsAreAnagram {
    public static void main(String[] args) {
        System.out.println("Check anagaram : " + checkAnagram("Angel", "Anglet"));
    }

    private static boolean checkAnagram(String s1, String s2) {
        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();

        Arrays.sort(s1arr);
        Arrays.sort(s2arr);

        return new String(s1arr).equalsIgnoreCase(new String(s2arr));
    }
}