package question11;

public class Q5 {
    public static void main(String[] args) {
        int n  = 0;
        try{
            m(n);
        }catch (MyException1 ex1){
            ex1.printStackTrace();
        }catch (MyException2 ex2){
            System.out.println(ex2.getMessage());
            throw ex2;
        }
    }

    public static void m(int n) throws MyException1{
        if (n==1){
            throw new MyException1("n==1");
        }else {
            throw new MyException2("n==2");
        }
    }
}



class MyException1 extends Exception{
    public MyException1() {
    }

    public MyException1(String message) {
        super(message);
    }
}

class MyException2 extends RuntimeException{
    public MyException2() {
    }

    public MyException2(String message) {
        super(message);
    }
}
