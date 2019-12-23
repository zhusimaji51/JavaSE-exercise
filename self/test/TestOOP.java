package self.test;

public class TestOOP {
    public static void main(String[] args) {
        Student1 s1= new Student1();
        Student1 s2= new Student1();
        Student1 s3= new Student1();
        Student1 s4= new Student1();

        s1.score = 99.0;
        s2.score = 66D;
        s3.score = 94.5D;
        s4.score = 99.1;
        s1.name = "aaa";
        s2.name = "bbb";
        s3.name = "ccc";
        s4.name = "ddd";
        s1.sayHi();
        s2.sayHi();

        Teacher t1 = new Teacher();

        String[] name = new String[]{s1.name,s2.name,s3.name,s4.name};
        double[] scoreArray = new double[]{s1.score,s2.score,s3.score,s4.score};
//        double res = t1.calScore(s1.score,s2.score,s3.score,s4.score);
        double res = t1.calScore(scoreArray);
        System.out.println(res);

        t1.calScore(name,scoreArray);
    }
}


class Student1{
    String name;
    int age;
    String sex;
    double score;


    public void sayHi(){
        System.out.println(name+age+sex+score);
    }

}


class Teacher{
    String name;
    int age;
    String sex;
    double salary;

    //public double calScore(double a,double b,double c,double d){
      //  return a+b+c+d;
    //}

    public double calScore(double... score){
        double sum = 0D;
        for (int i = 0 ; i<score.length ; i++){
            sum += score[i];
        }
        return sum;
    }

    public double calScore(String[] name ,double... score){
        double sum = 0D;
        int index = 0;
        double max = score[0];

        for (int i = 0 ; i<score.length ; i++){
            sum += score[i];
            if (score[i] > max){
                max = score[i];
                index = i;
            }
        }
        System.out.println("最高分是"+name[index]);
        return sum;
    }
}
