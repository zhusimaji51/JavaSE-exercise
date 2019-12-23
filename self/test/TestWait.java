package self.test;

public class TestWait {
    public static void main(String[] args) {
        Object o = new Object();
        Task t = new Task(o);

        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (o){
            System.out.println("main进入同步代码快");
            o.notifyAll();
            System.out.println("main结束同步代码块");
        }
    }
}



class Task implements java.lang.Runnable{
    Object object;

    public Task(Object object) {
        this.object = object;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"线程启动");
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+"进入同步代码块");
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"退出同步代码块0");
        }
        System.out.println(Thread.currentThread().getName()+"退出run方法");
    }

}