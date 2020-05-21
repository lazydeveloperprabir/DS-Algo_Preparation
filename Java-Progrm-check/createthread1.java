/**
 * createthread1
 */
public class createthread1 {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10;i++)
            System.out.println("Inside thread1");
        });

        t1.start();


        Thread t2 = new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println("inside T2");
            }
        });

        t2.start();

        Thread t3 = new Thread(() ->{
            while(true){
                System.out.println("Indefinite loop");
            }
        });
        
       // t3.setDaemon(true);
        t3.start();
        Thread.sleep(1000);
        t3.interrupt();
        
    }
}