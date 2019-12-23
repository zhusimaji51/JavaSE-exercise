package self.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Taskkk taskkk = new Taskkk();

        executorService.submit(new java.lang.Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=500; i++) {
                    System.out.println("NM"+Thread.currentThread().getName()+"\t"+i);
                }
            }
        });
        executorService.submit(taskkk);
        executorService.submit(taskkk);
        executorService.submit(taskkk);
    }

}

class Taskkk implements java.lang.Runnable {
    @Override
    public void run(){
        for (int i = 0; i <= 500 ; i++) {
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}
