package self.test;

public class TestRecursion {
    public static void main(String[] args) {
        int x = recursion2(100);
        System.out.println(x);

        int fib = fibonacci(4);
        System.out.println(fib);

    }

    public static int recursion(int m){
        if (m==1){
            return 1;
        }else {
            return m * recursion(m-1);
        }
    }

    public static int recursion2(int m){
        if (m==1){
            return 1;
        }else {
            return m + recursion2(m-1);
        }
    }

    public static int fibonacci(int m){
        if (m == 0 || m==1 ) {
            return 1;
        }
        if (m < 0){
            return 0;
        }
        return fibonacci(m - 1) + fibonacci(m - 2);
    }
}
