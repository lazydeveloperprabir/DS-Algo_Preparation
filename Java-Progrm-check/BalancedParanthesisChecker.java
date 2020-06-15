public class BalancedParanthesisChecker {

    public static void main(String[] args) {
        int n = 5;
        name(n);
    }

    public static void name(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                sb.append(i);
                sb.append("\n");

            } else {
                for (int j = 0; j < i; j++) {
                    sb.append(i);
                    if (j != i - 1) {
                        sb.append("*");
                    }
                }
                sb.append("\n");
            }

        }

        System.out.print(sb.toString());

        sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            if (i == 1) {
                sb.append(i);
                sb.append("\n");

            } else {
                for (int j = 0; j < i; j++) {
                    sb.append(i);
                    if (j != i - 1) {
                        sb.append("*");
                    }
                }
                sb.append("\n");
            }

        }

        System.out.println(sb.toString());





        // Printing upper part
        /*      for (int i = 1; i <= n; i++) {
            if (i == 1)
                System.out.print(i);
            else
                // for (int j = 1; j <=i ; j++)
                System.out.print(i + "*" + i);
            System.out.print("\n");
        }
        
        // printing lower part
        for (int i = n - 1; i > 0; i--) {
            for (int j = i; j > 0; j--)
                System.out.print(i + "*");
            System.out.print("\n");
        }
          }
          */
    }

}