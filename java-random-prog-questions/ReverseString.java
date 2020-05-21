public class ReverseString {

    public static void main(String[] args) {
        System.out.println("Before : " + "hello" + "  after :" + reverse("hello"));
    }

    public static String reverse(String s) {
        int p1 = 0;
        int p2 = s.length() - 1;

        char[] arr = s.toCharArray();

        while (p1 < p2) {
            if (s.charAt(p1) != s.charAt(p2)) {
                arr[p1] = s.charAt(p2);
                arr[p2] = s.charAt(p1);
            }
            p1++;
            p2--;
        }

        return new String(arr);
    }
}