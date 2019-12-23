package Day_15.exam;

import Day_8.Bank_3.Test;

public class TestEquals_2 {
    public static void main(String[] args) {
        Object o = new Worker9("ss",12,12D);
        Worker9 worker9 = new Worker9("ss",12,12D);
        System.out.println(o.equals(worker9));
        System.out.println(worker9);
    }
}


class Worker9{
    String name;
    Integer age ;
    Double salary;

    public Worker9(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker9{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }

        if (obj == null){
            return false;
        }

        if (this.getClass()!=obj.getClass()){
            return false;
        }

        Worker9 worker9 = (Worker9) obj;

        if (this.name.equals(worker9.name)&&this.age.equals(worker9.age)&&this.salary.equals(worker9.salary)){
            return true;
        }
        return false;
    }
}