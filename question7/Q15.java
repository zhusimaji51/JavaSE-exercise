package question7;

public class Q15 {
    public static void main(String[] args) {

        Myclass.statistics();
        new Myclass();
        new Myclass();
        new Myclass();
        new Myclass();
        new Myclass();
        Myclass.statistics();
    }
}

class Myclass{
    static int count;

    public Myclass(){
        count++;
    }

    static void statistics(){
        System.out.println(count);
    }
}

