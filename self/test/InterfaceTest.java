package self.test;

public class InterfaceTest {
    public static void main(String[] args) {

    }
}


abstract class Animal2{
    public abstract void eat();
    public abstract void sleep();
}

class Dog extends Animal2 implements Runnable,Swimmable {
    public void eat(){}
    public void sleep(){}
    public void run(){}
    public void swim(){}
}

class Cat extends Animal2 implements Runnable{
    public void eat(){}
    public void sleep(){}
    public void  run(){}

}

interface Runnable{
    public abstract void run();
}

interface Swimmable{
    public abstract void swim();
}