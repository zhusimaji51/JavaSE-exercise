package self.test;

import java.util.concurrent.*;

public class Testcallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("程序开始");
        ExecutorService es = Executors.newFixedThreadPool(2);
        Callable<Integer> callable = new Mytask();
        Callable<Integer> callable2 = new Mytask2();

        Future<Integer> f1 = es.submit(callable);
        Future<Integer> f2 = es.submit(callable2);

        System.out.println(f1.get()+f2.get()); //get()无限期等待
    }
}



class Mytask implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        Integer sum = 0 ;

        for (int i = 0; i <= 50; i++) {
            sum+=i;
        }
        return sum;
    }
}

class Mytask2 implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        Integer sum = 0;
        for (int i = 51; i <=100 ; i++) {
            sum+=i;
        }
        return sum;
    }
}