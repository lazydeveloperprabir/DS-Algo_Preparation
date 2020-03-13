package Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {

    private static int binarySearch(int[] a , int key){
        int low =0;
        int high = a.length -1;
        while(low <= high){
            int mid = low + ((high - low)/2);
            if(a[mid] == key){
                return mid;
            }else if(a[mid] > key){
                high = mid -1;
            }else{
                low = mid +1;
            }
            }
            return -1;
        }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1, 2, 4, 7, 8, 12, 15, 19, 24, 50, 69, 80, 100}, 12));
    }
}