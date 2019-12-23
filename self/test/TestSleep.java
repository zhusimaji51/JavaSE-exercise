package self.test;

public class TestSleep {
    public static void main(String[] args) {
        Frunnable task1 = new Frunnable();
        Frunnable2 task2 = new Frunnable2();
        Thread thread = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread.start();
        thread2.start();
    }
}




class Frunnable implements java.lang.Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i<=1000; i++){
            System.out.println("Task1:\t"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Frunnable2 implements java.lang.Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i<=1000 ; i++){
            System.out.println("Task2:\t"+i);
        }
    }
}