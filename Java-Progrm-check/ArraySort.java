import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        name(new int[] { 1, 2, 5, 3, 4 });
    }
    
    public static void name(int[] arr) {
        int length = arr.length;

        int mid = length / 2;
        
        int[] subArr1 = Arrays.copyOf(arr, mid);

        int[] subArr2 = Arrays.copyOfRange(arr, 0, mid + 1);
        int[] subArr3 = Arrays.copyOfRange(arr, mid, arr.length);


        Comparator<Integer> comp = Collections.reverseOrder();
        //Arrays.sort(arr, 0, mid + 1, Collections.reverseOrder());
        
        //Arrays.sort(arr, 0, mid + 1, comp);

        Arrays.sort(subArr2);
        
        



    }
    
}