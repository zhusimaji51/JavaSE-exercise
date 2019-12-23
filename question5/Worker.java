package question5;

public class Worker {


    private String name;
    private int age;
    private double salary;
    private Address addr;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setSalary(double salary){
        this.salary= salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setAddr(Address addr){
        this.addr = addr;
    }

    public Address getAddr(){
        return this.addr;
    }



    public Worker(String name, int age, double salary,String address,String zipCode) {
        super();
        this.addr = new Address(address,zipCode);
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Worker(){
        super();
    }
    public void work(){
        System.out.println("work");
    }

    public void work(int hours){
        System.out.println("worker works for " + hours + " hours");
    }

}
