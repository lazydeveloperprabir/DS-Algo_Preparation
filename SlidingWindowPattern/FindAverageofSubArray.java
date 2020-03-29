package SlidingWindowPattern;

/**
 * FindAverageofSubArray
 */

public class FindAverageofSubArray {

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,-1,4,1,8,2};
        int k = 5;
        System.out.println(getAverageContigously(arr,k));
        
    }

    private static int[] getAverageContigously(int[] arr,int k){

        int[] resultArr = new int[arr.length - k + 1];
        int windowStart = 0;
        int windowSum = 0;
        for(int windowEnd  = 0; windowStart < arr.length; windowEnd++){
            windowSum +=arr[windowEnd];
            if(windowEnd > k -1) {
                resultArr[windowStart] = windowSum/k;
                windowSum -= arr[windowStart];
                windowStart++;
            }

        }
        return resultArr;
    }
}