package self.test;

public class TestObject {
    public static void main(String[] args) {

        Student name1 = new Student();

        name1.name="打赏";
        name1.exam();
        System.out.println(name1.name);
    }

}





class Student{
    String name;
    String sex;
    int age ;
    double score;

    public void exam(){
        System.out.println(name+"考试");
    }
}