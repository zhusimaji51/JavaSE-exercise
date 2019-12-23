package self.test;

public class ToStringTest {
    public static void main(String[] args) {
        Object o = new Teacher1("Bob");
        Object o1 = new Teacher1("777");
//        System.out.println(o.hashCode());
//        System.out.println(o1.hashCode());
        System.out.println(o.toString());
        System.out.println(o);
    }
}


class Teacher1{
    String name;

    public Teacher1(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}