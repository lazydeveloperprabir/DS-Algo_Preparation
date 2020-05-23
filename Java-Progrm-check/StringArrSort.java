import java.util.Arrays;

/**
 * StringArrSort
 */
public class StringArrSort {

    public static void main(String[] args) {
        name(new String[] { "abcd", "ijkl", "efgh", "yz" });
    }
    
    public static void name(String[] arr) {
        Arrays.sort(arr);
        System.out.println(arr);
    }
}