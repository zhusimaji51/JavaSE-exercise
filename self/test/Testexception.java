package self.test;

public class Testexception {
    public static void main(String[] args) {
        Stu stu = new Stu();

        try {
            stu.setAge(12);
        } catch (AgeException e) {
            e.printStackTrace();
        }

        try{
            stu.setSex("123");
        }catch (SexMisMatchException s){
            System.out.println(s.getMessage());
        }
    }
}

class AgeException extends Exception{
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}

class SexMisMatchException extends RuntimeException{
    public SexMisMatchException() {
    }

    public SexMisMatchException(String message) {
        super(message);
    }
}

class Stu{
    private int age;
    private String sex;

    public void setAge(int age) throws AgeException{
        if (age>0&&age<=253){
            this.age = age;
        } else {
            throw new AgeException("年龄的正确区间为1 ~ 253");
        }
    }

    public void setSex(String sex){
        if (sex.equals("男") || sex.equals("女")){
            this.sex = sex;
        }else {
            throw new SexMisMatchException("性别的正确取值为：“男”或者“女”");
        }
    }
}
