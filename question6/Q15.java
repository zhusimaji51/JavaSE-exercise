package question6;

public class Q15 {
    public static void main(String[] args) {
        Shape[] s =new Shape[3];
        Circle c = new Circle();
        c.radius = 2D;
        s[0] = c;
        Rect r = new Rect();
        r.length = 3;
        r.width = 4;
        s[1] = r;
        Square sq =new Square();
        sq.sideLength = 5;
        s[2] = sq;

        for (int i = 0 ; i<s.length ; i++){
            if (s[i] instanceof Circle){
                Circle circle=(Circle)s[i];
                System.out.println("Circle的面积是"+circle.area());
                System.out.println("Circle的周长是"+circle.girth());
            }else if (s[i] instanceof Rect){
                Rect rect = (Rect)s[i];
                System.out.println("Rect的面积是"+rect.area());
                System.out.println("Rect的周长是"+rect.girth());
            }else if (s[i] instanceof Square){
                Square square = (Square)s[i];
                System.out.println("Square的面积是"+square.area());
                System.out.println("Square的周长是"+square.girth());
            }
        }
        System.out.println("程序结束");
//        for (int i = 0 ; i<s.length; i++){
//            System.out.println(s[i].area());
//            System.out.println(s[i].girth());
//        }
    }
}

abstract class Shape{

    public abstract double area();
    public abstract double girth();

}

class Circle extends Shape{
    double radius; //半径

    @Override
    public double area(){
        return 3.14*(Math.pow(this.radius,2));
    }

    @Override
    public double girth(){
        return 2*3.14*this.radius;
    }
}

class Rect extends Shape{
    double length;
    double width;

    public double area(){
        return this.length*this.width;
    }

    public double girth(){
        return (this.length+this.width)*2;
    }
}

class Square extends Rect{
    double sideLength;

    public double area(){
        return Math.pow(this.sideLength,2);
    }

    public double girth(){
        return this.sideLength*4;
    }
}
