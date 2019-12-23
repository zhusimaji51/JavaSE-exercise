package bank_pro;

public class TestPoly {
    public static void main(String[] args) {
        Teacher t =new Student();
        t.sleep();
    }
}

class Teacher{
    String name;

    public void sleep(){
        System.out.println("Teacher");
    }
}

class Student extends Teacher{
    public void sleep(){
        System.out.println("Student");
    }
}