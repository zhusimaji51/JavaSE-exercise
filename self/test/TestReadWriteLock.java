package self.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestReadWriteLock {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        ExecutorService es = Executors.newFixedThreadPool(5);
        final Student2 student2 =  new Student2();

        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                student2.getValue();
                return null;
            }
        };

        for (int i = 0; i <5 ; i++) {
            es.submit(callable);
        }

        es.shutdown();

        while (true){
            System.out.println("结束了吗？");
            if (es.isTerminated()){
                System.out.println("用时"+(System.currentTimeMillis()-start));
                break;
            }
        }
    }
}


class Student2{
//    Lock lock = new ReentrantLock();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock Readlock = readWriteLock.readLock();

    int value;

    //读锁
    public int getValue() {
        try {
            Readlock.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return value;
        } finally {
            Readlock.unlock();
        }
    }
}