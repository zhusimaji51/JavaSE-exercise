package question10;

import question5.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Q5 {
    public static void main(String[] args) {
        List<Workerm> list = new ArrayList<>();
        list.add(new Workerm(18,"zhang3",3000D));
        list.add(new Workerm(25,"li4",3500D));
        list.add(new Workerm(22,"wang5",3200D));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals("li4")){
                list.add(i,new Workerm(24,"zhao6",3300D));
                break;
            }
        }

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getName().equals("wang5")){
                list.remove(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Workerm i:list
             ) {
            i.work();
        }
    }

}

class Workerm{
    private int age;
    private String name;
    private double salary;

    public Workerm(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Workerm() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+"work");
    }

    @Override
    public String toString() {
        return "Workerm{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ){
            return true;
        }
        if (o==null){
            return false;
        }
        if (this.getClass()!=o.getClass()){
            return false;
        }
        Workerm workerm = (Workerm)o;
        if (this.getName().equals(workerm.getName())&&this.age==workerm.age&&this.salary==workerm.salary){
            return true;
        }
        return false;
    }

}
