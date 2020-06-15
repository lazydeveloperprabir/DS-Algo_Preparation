public class editDistance {

    public static void main(String[] args) {
        name("apple", "aaaa");
    }

    public static void name(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        int[][] dp = new int[l1 + 1][l2 + 1];

        for (int i = 0; i < l1; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j < l2; j++) {
            dp[0][j] = j;
        }

        for (int i = 0; i < l1; i++) {
            char c1 = s1.charAt(i);
            for (int j = 0; j < l2; j++) {
                char c2 = s2.charAt(j);

                if (c1 == c2) {
                    dp[i + 1][j + 1] = dp[i][j];
                } else {
                    int replace = dp[i][j] + 1;
                    int insert = dp[i][j + 1] + 1;
                    int delete = dp[i + 1][j] + 1;

                    int min1 = Math.min(replace, insert);
                    int min2 = Math.min(min1, delete);
                    dp[i + 1][j + 1] = min2;

                }

                System.out.println(dp[l1][l2]);

            }
        }
    }
}