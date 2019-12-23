package self.test;

import java.util.ArrayList;

public class PandC {
    public static void main (String[] args){
        Queue q = new Queue();

        Pro p = new Pro(q);
        Consumer c= new Consumer(q);

        p.start();
        c.start();
    }
}

class Pro extends Thread{
    private Queue queue;

    public Pro(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (char i ='A'; i<='E';i++){
            queue.offer(i);
        }
//        queue.showE();
    }
}

class Consumer extends Thread{
    private Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (char i =0; i<=4;i++){
            queue.poll();
        }
//        queue.showE();
    }
}


class Queue{
    private ArrayList values = new ArrayList();
    private int max=4;

    public synchronized void offer(Object o){
        while (values.size() == max){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        values.add(o);
        System.out.println(o+"进入队列");
        System.out.println(values.size());
    }

    public synchronized Object poll(){
        while (values.size() == 0 ){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        System.out.println(values.get(0)+"被消费");
        return values.remove(0);
    }

    public void showE(){
        for (Object o:values
             ) {
            System.out.println(o);
        }
    }
}