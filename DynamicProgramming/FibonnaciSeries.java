package DynamicProgramming;
/**
 * FibonnaciSeries
 * recursive solution
 */
public class FibonnaciSeries {

    public static void main(String[] args) {
        int[] nums = {1,5,7,10};
        for(int i:nums){
            System.out.println(fib(i));
        }
    }

    public static int fib(int n) {
        if(n==0 || n ==1){
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}