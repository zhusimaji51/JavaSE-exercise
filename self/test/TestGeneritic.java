package self.test;

public class TestGeneritic {
    public static void main(String[] args) {
        Paper<Boolean> paper = new Paper<Boolean>();
        paper.m1(true);//实例泛型
        Paper paper1 = new Paper();
        paper1.m1(new Object());
        Paper<Integer> paper2 = new Paper<Integer>();
        paper2.m1(12);

        Dongwu<Integer> dongwu = new Monkey();
        dongwu.M2(12);

//        StaticClass.method1(1233);
//        StaticClass.method1("444");
        StaticClass.method1(new Boy());
//        StaticClass.method1(new Girl());
    }
}

class StaticClass{
    public static <E extends People & Comparable> void method1(E e){

    }
}


class Paper<E>{
    public void m1(E e){

    }
}

interface Dongwu<E>{
    public void M2(E e);
}

class Monkey implements Dongwu<Integer>{
    @Override
    public void M2(Integer integer) {

    }
}

abstract class People{}

class Boy extends People implements Comparable<Boy>{
    @Override
    public int compareTo(Boy o) {
        return 0;
    }
}
class Girl extends People{

}