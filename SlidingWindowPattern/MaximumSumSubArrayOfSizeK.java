package SlidingWindowPattern;

/**
 * MaximumSumSubArrayOfSizeK
 */
public class MaximumSumSubArrayOfSizeK {

    public static void main(String[] args) {
        System.out.println("Maximum sum of a subarray of size K: "
        + maxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
    System.out.println("Maximum sum of a subarray of size K: "
        + maxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    }

   public static int maxSumSubArray(int k,int [] arr ) {
       int windowSum =0, maxSum =0;
       int windowStart =0;
       for(int i =0;i<arr.length;i++){
           windowSum +=arr[i];
           if(i >= k-1){
               maxSum = Math.max(maxSum,windowSum);
               windowSum -=arr[windowStart];
               windowStart++;
           }
       }
       return maxSum; 
   }

}