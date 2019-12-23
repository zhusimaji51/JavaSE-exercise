package question10;

import question5.Worker;

import java.util.HashSet;
import java.util.Set;

public class Q8 {
    public static void main(String[] args) {
        Set<Worker3> worker3s = new HashSet<>();
        worker3s.add(new Worker3("tom",18,2000));
        worker3s.add(new Worker3("tom",18,2000));
        worker3s.add(new Worker3("jerry",18,2000));
        System.out.println(worker3s.size());
    }
}

class Worker3{
    String name;
    int age;
    double salary;

    public Worker3() {
    }

    public Worker3(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return name.hashCode()+age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)return true;
        if (obj == null)return false;
        if (this.getClass()!=obj.getClass()){
            return false;
        }
        Worker3 worker3 = (Worker3)obj;
        if (this.name.equals(worker3.name)&&this.age==worker3.age&&this.salary==worker3.salary){
            return true;
        }
        return false;
    }
}