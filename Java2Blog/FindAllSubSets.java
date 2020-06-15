public class FindAllSubSets {
    public static void main(String[] args) {
        findAllSubset(new char[] { 'a', 'b', 'c', 'd' });
    }

    public static void findAllSubset(char[] arr) {
        int n = arr.length;
        System.out.println(1 << n);
        System.out.println(1 >> n);

        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{");

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(arr[j]);
                }
            }
            System.out.print(" }");
        }

    }

}