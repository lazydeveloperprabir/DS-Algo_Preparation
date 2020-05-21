import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class multi1 {
    static ExecutorService threadpool = Executors.newFixedThreadPool(20);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("sum :" + findSum(120));
        threadpool.shutdown();
    }

    public static int findSum(int n) throws InterruptedException, ExecutionException {
        Callable<Integer> sum = new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                int sumation =  0;
                for (int i = 0; i < n; i++) {
                    sumation += i;
                }
                return sumation;
            }
        
        };

        Future<Integer> result = threadpool.submit(sum);

        return result.get();
    }
}