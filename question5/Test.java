package question5;

public class Test {
    public static void main(String[] args) {
        Worker w = new Worker("张三",25,2500D,"北京","100045");
        System.out.println("名字:"+w.getName()+"\t"+"年龄"+w.getAge()+"\t"+"工资"+w.getSalary()+"\t"+"邮编"+w.getAddr().getZipCode()+"\t"+"地址"+w.getAddr().getAddress());

    }
}
