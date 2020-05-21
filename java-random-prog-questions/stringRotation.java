public class stringRotation {
    public static void main(String[] args) {
        System.out.println(check("java2blog", "blogjavt2"));
    }

    public static boolean check(String s1, String s2) {
        String s3 = s1 + s1;
        if (s3.contains(s2)) {
            return true;
        }
        return false;
    }
}