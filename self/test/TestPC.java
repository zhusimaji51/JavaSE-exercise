package self.test;

public class TestPC {
    public static void main(String[] args) {

        final Stack stack = new Stack();

        Thread t1 = new Thread(){
            public void run(){
                for (char i = 'A';i<='Z';i++){
                    stack.push(i+"");
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                for (int i = 0 ; i<26 ; i++){
                    stack.pop();
                }
            }
        };

        t1.start();
        t2.start();

    }
}


//容器
class Stack{
    private String[] values =new String[]{"","","","",""};
    private int max = 0;

    public synchronized void push(String s){

        this.notifyAll();
        if (max == values.length){
            System.out.println("满了1");
            try { this.wait(); } catch (Exception e) {}
        }
        System.out.println(s+"进栈");
        values[max] = s;
        max++;
    }

    public synchronized void pop(){

        this.notifyAll();
        if (max == 0){
            System.out.println("空了1");
            try { this.wait(); } catch (Exception e) {}
        }

        System.out.println(values[max-1]+"出栈");
        values[max-1] = "";
        max--;
    }
}
