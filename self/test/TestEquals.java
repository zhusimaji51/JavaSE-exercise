package self.test;
import java.util.Scanner;

public class TestEquals {
    public static void main(String[] args) {

        Object b1 =new Ball("匹克","das",13);
        Object b2 =new Ball("匹克","das",13);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
        System.out.println(b1.toString());
    }
}

class Ball{
    String name;
    String brand;
    int size;

    public Ball(String name, String brand, int size) {
        this.name = name;
        this.brand = brand;
        this.size = size;
    }

    public String toString(){
        return this.name+"\t"+this.brand+"\t"+this.size;
    }

    public boolean equals(Object object){
        if (this == object){
            return true;
        }

        if (object == null){
            return false;
        }

        if (this.getClass()!=object.getClass()){
            return false;
        }
        Ball ball = (Ball)object;

        if (this.name.equals(ball.name)&&this.brand.equals(ball.brand)&&this.size==ball.size){
            return true;
        }
        return false;
    }
}
